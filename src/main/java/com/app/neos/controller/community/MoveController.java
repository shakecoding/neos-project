package com.app.neos.controller.community;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/community/*")
public class MoveController {

    @GetMapping("/frag")
    public String frag(){
        return "app/community/fragmentTest";
    }

    @GetMapping("/community")
    public String freeboard(){
        return "app/community/freeboard";
    }

    @GetMapping("/counseling")
    public String counseling(){
        return "app/community/counseling";
    }

    @GetMapping("header")
    public String header(){
        return "app/community/headerghost";
    }

    @GetMapping("footer")
    public String footer(){
        return "app/fix/footer";
    }
}
