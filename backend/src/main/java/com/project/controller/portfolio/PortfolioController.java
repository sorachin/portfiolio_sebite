package com.project.controller.portfolio;

import java.util.List;
import java.util.Optional;

import com.project.model.portfolio.PortfolioDTO;
import com.project.model.portfolio.PortfolioEntity;
import com.project.service.portfolio.PortfolioService;

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
@RequestMapping("/portfolio")
@Validated
public class PortfolioController {
    @Autowired
    PortfolioService pService;

    // ###################Create###################
    @PostMapping("/add")
    public Object addPortfolio(@RequestBody PortfolioDTO.AddMod request) {
        if (pService.savePortfolio(request) == request) {
            return new ResponseEntity<Object>(HttpStatus.OK);
        }
        return new ResponseEntity<Object>(HttpStatus.BAD_REQUEST);
    }

    // ###################Read###################
    // uid에 저장된 모든 포트폴리오 가져오기
    @GetMapping("/list")
    public ResponseEntity<List<PortfolioEntity>> getCareerList(@RequestParam("uid") String uid) {

        List<PortfolioEntity> result = null;

        if (!uid.equals("undefined")) {
            result = pService.getPortfolioList(uid);
            return new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        }
    }

    // uid로 포트폴리오 불러오기
    @GetMapping("/detail")
    public Object getPortfolioInfo(@RequestParam("uid") String uid) {
        Optional<PortfolioEntity> result = pService.getPortfolioByUid(uid);
        if(result == null) return new ResponseEntity<>(result, HttpStatus.BAD_REQUEST);
        
        return new ResponseEntity<Object>(result, HttpStatus.OK);
    }

    // ###################Update###################
    @PostMapping(value = "/mod")
    public Object modPortfolio(@RequestBody PortfolioDTO.AddMod request) {
        return pService.modPortfolio(request);
    }

    // ###################Delete###################
    @GetMapping("/del")
    public Object delPortfolio(@RequestParam int pid) {
        return pService.delPortfolio(pid);
    }
}
