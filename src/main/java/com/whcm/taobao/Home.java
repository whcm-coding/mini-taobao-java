package com.whcm.taobao;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Home {
  @RequestMapping("/")
  public String homePage() {
    return "hello world3";
  }
}