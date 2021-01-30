package com.project.dao.portfolio;

import java.util.List;
import java.util.Optional;

import com.project.model.portfolio.EducationEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EducationDAO extends JpaRepository<EducationEntity,String>{
    
    //교육 전체 조회
    public List<EducationEntity> findAllByUid(String uid);

    //교육 세부 조회
    EducationEntity getUserByUid(String uid);
    Optional<EducationEntity> findByEid(int eid);

}
