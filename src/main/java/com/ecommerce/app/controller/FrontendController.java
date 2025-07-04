package com.ecommerce.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FrontendController {
    @RequestMapping(value = {"/{path:[^\\.]*}", "/"})
    public String forward() {
        return "forward:/index.html";
    }
}