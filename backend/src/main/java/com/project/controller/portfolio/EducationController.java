package com.project.controller.portfolio;

import java.util.List;
import java.util.Optional;

import com.project.model.portfolio.EducationDTO;
import com.project.model.portfolio.EducationEntity;
import com.project.service.portfolio.EducationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@CrossOrigin
@RestController
@RequestMapping("/edu")
@Validated
public class EducationController {
    @Autowired
    EducationService eService;

    // ###################Create###################
    @PostMapping("/add")
    public Object addEdu(@RequestBody EducationDTO.Add request) {
        if (eService.saveEdu(request) == request) {
            return new ResponseEntity<Object>(HttpStatus.OK);
        }
        return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
    }

    // ###################Read###################
    // uid에 저장된 모든 교육사항 가져오기
    @GetMapping("/list")
    public ResponseEntity<List<EducationEntity>> getEduList(@RequestParam("uid") String uid) {

        List<EducationEntity> result = null;

        if (!uid.equals("undefined")) {
            result = eService.getEduList(uid);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
    }

    // cid로 경력사항 불러오기
    @GetMapping("/detail")
    public Object getEduInfo(@RequestParam("eid") int eid) {

        Optional<EducationEntity> result = eService.getEduInfo(eid);

        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

    // ###################Update###################
    @PostMapping(value = "/mod")
    public Object modEdu(@RequestBody EducationDTO.Mod request) {
        return eService.modEdu(request);
    }

    // ###################Delete###################
    @GetMapping("/del")
    public Object delEdu(@RequestParam int eid) {
        return eService.delEdu(eid);
    }
}
