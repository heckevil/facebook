package com.koreait.facebook.feed;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/feed")
public class FeedController {
    @RequestMapping("/home")
    public String home (){
        return "/feed/home";
    }
}
