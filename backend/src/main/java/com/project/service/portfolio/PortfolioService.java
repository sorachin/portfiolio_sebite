package com.project.service.portfolio;

import java.util.List;
import java.util.Optional;

import com.project.dao.portfolio.PortfolioDAO;
import com.project.model.portfolio.PortfolioDTO;
import com.project.model.portfolio.PortfolioEntity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class PortfolioService {
    @Autowired
    PortfolioDAO pDao;

    //###################Create###################
    //포트폴리오 저장
    public Object savePortfolio(PortfolioDTO.AddMod request) {
        System.out.println("포트폴리오저장");
        PortfolioEntity portfolio = new PortfolioEntity(request.getUid(),
                                                        request.getPintro(),
                                                        request.getPurl(), 
                                                        request.getPjob());
        PortfolioEntity tmp = pDao.save(portfolio);
        if(tmp == portfolio) return request;
        else return null;
    }

    //uid에 저장된 모든 포트폴리오 가져오기
    public List<PortfolioEntity> getPortfolioList(String uid) {
        return pDao.findAllByUid(uid);
    }

    //uid에 저장된 포트폴리오 정보 불러오기
    public Optional<PortfolioEntity> getPortfolioByUid(String uid) {
        return pDao.findByUid(uid);
    }

    //pid로 포트폴리오 불러오기
    public Optional<PortfolioEntity> getPortfolioInfo(int pid){
        return pDao.findByPid(pid);
    }
    
    
    //###################Update###################
    //포트폴리오 수정
    public Object modPortfolio(PortfolioDTO.AddMod request) {
        String uid = request.getUid();
        Optional<PortfolioEntity> tmp = pDao.findByUid(uid);
        if(tmp==null) return savePortfolio(request);
        else {
            tmp.ifPresent(portfolio -> {
                portfolio.setPintro(request.getPintro());
                portfolio.setPurl(request.getPurl());
                portfolio.setPjob(request.getPjob());
                pDao.save(portfolio);
            });
            return new ResponseEntity<Optional<PortfolioEntity>>(tmp, HttpStatus.OK);
        }
    }

    //###################Delete###################
    //포트폴리오 삭제
    public Object delPortfolio(int pid) {
        pDao.findByPid(pid).ifPresent(portfolio -> {
            pDao.delete(portfolio);
        });
        return new ResponseEntity<String>(HttpStatus.OK);
    }

}
