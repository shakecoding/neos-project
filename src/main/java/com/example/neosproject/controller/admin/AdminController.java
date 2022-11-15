package com.example.neosproject.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/admin/*")
public class AdminController {
    @GetMapping("/index")
    public String index(){
        return "app/admin/adminIndex";
    }

    /*배너 관리 클릭시*/
    @GetMapping("/configBanner")
    public String configBanner(){
        return "app/admin/configBanner";
    }

    //    배너 등록
    @GetMapping("/bannerEditer")
    public String bannerEditer(){
        return "app/admin/bannerEdit";
    }

    // 공지사항
    @GetMapping("/noticePost")
    public String noticePost(){return "app/admin/noticePost";}

    //게시글관리
    @GetMapping("/content")
    public String contentManage(){return "app/admin/studyManagement";}
}
