package com.koreait.facebook.userprofile;

import com.koreait.facebook.user.UserService;
import com.koreait.facebook.user.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/user")
public class UserProfileController {

    @RequestMapping("/profile")
    public String userProfile() {
        return "user/profile";
    }

}









