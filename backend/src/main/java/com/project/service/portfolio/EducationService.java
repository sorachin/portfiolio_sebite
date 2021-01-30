package com.project.service.portfolio;

import java.util.List;
import java.util.Optional;

import com.project.dao.portfolio.EducationDAO;
import com.project.model.portfolio.EducationDTO;
import com.project.model.portfolio.EducationEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EducationService {
    @Autowired
    EducationDAO eDao;

   //###################Create###################
   //교육 저장
    public Object saveEdu(EducationDTO.Add request) {
        EducationEntity edu = new EducationEntity(request.getUid(),
                                                  request.getEname(),
                                                  request.getEdegree(),
                                                  request.getEstartdate(),
                                                  request.getEenddate(),
                                                  request.getEmajor());
        EducationEntity tmp = eDao.save(edu);
        if(tmp == edu) return request;
        else return null;
    }

   //uid에 저장된 모든 교육사항 가져오기
    public List<EducationEntity> getEduList(String uid) {
        return eDao.findAllByUid(uid);
    }

    //eid로 교육사항 불러오기
    public Optional<EducationEntity> getEduInfo(int eid){
        return eDao.findByEid(eid);
    }
    
    
    //###################Update###################
    //교육 수정
    public Object modEdu(EducationDTO.Mod request) {
        int eid = request.getEid();

        Optional<EducationEntity> tmp = eDao.findByEid(eid);
        tmp.ifPresent(edu -> {
            edu.setEname(request.getEname());
            edu.setEdegree(request.getEdegree());
            edu.setEmajor(request.getEmajor());
            edu.setEstartdate(request.getEstartdate());
            edu.setEenddate(request.getEenddate());
            eDao.save(edu);
        });
        return new ResponseEntity<Optional<EducationEntity>>(tmp, HttpStatus.OK);
    }

    //###################Delete###################
    //교육 삭제
    public Object delEdu(int eid) {
        eDao.findByEid(eid).ifPresent(edu -> {
            eDao.delete(edu);
        });
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
  

