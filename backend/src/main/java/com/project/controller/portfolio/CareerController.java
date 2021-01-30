package com.project.controller.portfolio;

import java.util.List;
import java.util.Optional;

import com.project.model.portfolio.CareerDTO;
import com.project.model.portfolio.CareerEntity;
import com.project.service.portfolio.CareerService;

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
@RequestMapping("/career")
@Validated
public class CareerController {
    @Autowired
    CareerService cService;


    //###################Create###################
    @PostMapping("/add")
    public Object addCareer(@RequestBody CareerDTO.Add request) {
        if(cService.saveCareer(request) == request) {
            return new ResponseEntity<Object>(HttpStatus.OK);
        } 
        return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
    }

    //###################Read###################
    //uid에 저장된 모든 경력사항 가져오기
    @GetMapping("/list")
    public ResponseEntity<List<CareerEntity>> getCareerList(@RequestParam("uid") String uid){

        List<CareerEntity> result = null;

        if(!uid.equals("undefined")){
            result = cService.getCareerList(uid);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
    }
    //cid로 경력사항 불러오기
    @GetMapping("/detail")
    public Object getCareerInfo(@RequestParam("cid") int cid){

        Optional<CareerEntity> result = cService.getCareerInfo(cid);

        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

    //###################Update###################
    @PostMapping(value="/mod")
    public Object modCareer(@RequestBody CareerDTO.Mod request) {
        return cService.modCareer(request);
    }

    //###################Delete###################
    @GetMapping("/del")
    public Object delCareer(@RequestParam int cid) {
        return cService.delCareer(cid);
    }
}
