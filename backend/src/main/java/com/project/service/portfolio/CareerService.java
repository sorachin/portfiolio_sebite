package com.project.service.portfolio;

import java.util.List;
import java.util.Optional;

import com.project.dao.portfolio.CareerDAO;
import com.project.model.portfolio.CareerDTO;
import com.project.model.portfolio.CareerEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class CareerService {
    @Autowired
    CareerDAO cDao;
  
    //###################Create###################
    // 경력저장
    public Object saveCareer(CareerDTO.Add request) {
        CareerEntity career = new CareerEntity(request.getUid(),
                                               request.getCname(), 
                                               request.getCjob(), 
                                               request.getCstartdate(), 
                                               request.getCenddate(), 
                                               request.getCrole());

        CareerEntity tmp = cDao.save(career);
        if(tmp == career) return request;
        else return null;
    }

    //###################Read###################
    //uid에 저장된 모든 경력사항 가져오기
    public List<CareerEntity> getCareerList(String uid) {
        return cDao.findAllByUid(uid);
    }

    //cid로 경력사항 불러오기
    public Optional<CareerEntity> getCareerInfo(int cid){
        return cDao.findByCid(cid);
    }
    
    
    //###################Update###################
    //경력 수정
    public Object modCareer(CareerDTO.Mod request) {
        int cid = request.getCid();

        Optional<CareerEntity> tmp = cDao.findByCid(cid);
        tmp.ifPresent(career -> {
            career.setCname(request.getCname());
            career.setCjob(request.getCjob());
            career.setCstartdate(request.getCstartdate());
            career.setCenddate(request.getCenddate());
            career.setCrole(request.getCrole());
            cDao.save(career);
        });

        return new ResponseEntity<Optional<CareerEntity>>(tmp, HttpStatus.OK);
    }

    //###################Delete###################
    //경력 삭제
    public Object delCareer(int cid) {
        cDao.findByCid(cid).ifPresent(career -> {
            cDao.delete(career);
        });
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
