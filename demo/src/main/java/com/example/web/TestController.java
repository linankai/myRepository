package com.example.web;


import com.example.exception.CrowdException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @RequestMapping(value="/")
    public String index(ModelMap map) {
        map.addAttribute("host", "http://blog.didispace.com");
        return "/index";
    }

    @ResponseBody
    @RequestMapping(value="/json")
    public String json() throws Exception {
        throw new Exception();
    }
}
