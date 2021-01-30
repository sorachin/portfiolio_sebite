package com.project.dao.portfolio;

import java.util.List;
import java.util.Optional;

import com.project.model.portfolio.CareerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CareerDAO extends JpaRepository<CareerEntity,String>{

    //사용자별 경력 전체 조회
    List<CareerEntity> findAllByUid(String uid);

    //사용자의 경력 세부 조회
    Optional<CareerEntity> findByCid(int cid);

}
