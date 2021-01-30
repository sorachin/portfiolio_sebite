package com.project.controller.user;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import com.project.model.user.UserDTO;
import com.project.service.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
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
@RequestMapping("/user")
@Validated
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService userService){
        this.userService = userService;
    }

    @PostMapping("/")
    public Object add(@RequestBody @Valid UserDTO.SignUp param){
        return "hello";
    }

    //회원가입
    @PostMapping("/signup")
    public Object signUp(@RequestBody UserDTO.SignUp request){
        return userService.signUp(request);
    }

    //로그인
    @GetMapping("/login")
    public Object userLogin(@RequestParam("uid")String uid,@RequestParam("upw") String upw, HttpSession session){
       
        return userService.login(uid,upw,session);
    }


    //로그아웃
    @GetMapping("/logout")
    public Object userLogout(HttpSession session){
       
        return session.toString();
    }

    @GetMapping("/info")
    public Object userInfo(@RequestParam("uid") String userId){
        
        return userService.userInfo(userId);
    }

}
