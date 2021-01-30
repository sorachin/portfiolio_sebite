package com.project.service.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

import java.lang.Object;
import java.time.LocalDateTime;
import com.project.dao.user.UserDAO;
import com.project.model.user.UserDTO;
import com.project.model.user.UserEntity;

import org.springframework.web.bind.annotation.RequestBody;

// import java.util.ArrayList;
import java.util.Enumeration;
// import java.util.List;
import java.util.Optional;

@Service
public class UserService implements UserDetailsService {

    @Autowired
    UserDAO userDAO;





    //회원가입
	public Object signUp(@RequestBody UserDTO.SignUp request) {
        System.out.println(request);
        UserEntity newUser = new UserEntity();
        newUser.setUid(request.getUid());
        newUser.setUpw(request.getUpw());
        newUser.setUname(request.getUname());
        newUser.setUemail(request.getUemail());
        newUser.setUphone(request.getUphone());
        newUser.setUaddr(request.getUaddr());
        newUser.setUcreatedate(LocalDateTime.now());
        
        userDAO.save(newUser);
        
        return new ResponseEntity<UserEntity>(newUser, HttpStatus.OK);
	}
    


    //로그인
    public Object login(final String uid, final String upw, final HttpSession session) {
        final Optional<UserEntity> user = userDAO.findByUidAndUpw(uid, upw);
        ResponseEntity response = null;
        final ResponseBody result = new ResponseBody();

        if (user.isPresent()) {

            result.status = true;
            result.data = "success";

            user.ifPresent(u -> {
                System.out.println("email : " + u.getUemail());
                session.setAttribute("user", u);
                session.setAttribute("uid", u.getUid());
                session.setAttribute("upw", u.getUpw());
                session.setAttribute("uemail", u.getUemail());
                result.object = session.getAttribute("user");
            });
            response = new ResponseEntity<>(result, HttpStatus.OK);
        } else {
            response = new ResponseEntity<>("로그인 실패", HttpStatus.OK);
        }

        final Enumeration se = session.getAttributeNames();

        while (se.hasMoreElements()) {
            final String getse = se.nextElement() + "";
            System.out.println("@@@@@@@ session : " + getse + " : " + session.getAttribute(getse));
        }

        System.out.println("리스판스" + result.object);
        return response;
    }

    public Object logout(final HttpSession session) {

        session.invalidate();

        return session;
    }
    
    public Object userInfo(String userId){
        UserEntity user = userDAO.getUserByUid(userId);
        return user;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }

}


class ResponseBody {
    public boolean status = false;
    public String data;
    public Object object;
}
