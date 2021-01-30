package com.project.dao.portfolio;

import java.util.List;
import java.util.Optional;

import com.project.model.portfolio.PortfolioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface PortfolioDAO extends JpaRepository<PortfolioEntity,String>{
    
    //포트폴리오 전체 조회
    public List<PortfolioEntity> findAllByUid(String uid);

    //포트폴리오 세부 조회
    Optional<PortfolioEntity> findByUid(String uid);
    Optional<PortfolioEntity> findByPid(int pid);

}
