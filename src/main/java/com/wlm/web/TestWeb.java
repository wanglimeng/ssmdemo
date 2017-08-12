package com.wlm.web;


import com.wlm.dao.AdminMapper;
import com.wlm.pojo.Admin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestWeb {

    @Autowired
    AdminMapper adminMapper;
    @RequestMapping("/")
    public String testJSP(Model model) {

        Admin admin = adminMapper.selectByPrimaryKey(6);

        model.addAttribute("msg",admin);
        return  "test";

    }

    @RequestMapping(value = "/json",method = RequestMethod.GET)

    public @ResponseBody Admin testJson() {
        Admin admin = adminMapper.selectByPrimaryKey(6);
        return admin;
    }



}
