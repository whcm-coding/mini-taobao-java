package com.whcm.taobao.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
  @RequestMapping("/")
  public String homePage(Model model) {
    model.addAttribute("name", "武汉传媒学院欢迎你哦!");
    return "/home";
  }
}