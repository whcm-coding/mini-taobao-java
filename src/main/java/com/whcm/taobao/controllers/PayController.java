package com.whcm.taobao.controllers;

import com.whcm.taobao.models.Cart;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PayController {
  @GetMapping("/pay")
  public String payResult(Model model) {
    Cart.clear();
    return "/pay";
  }
}