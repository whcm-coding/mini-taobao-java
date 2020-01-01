package com.whcm.taobao.controllers;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import com.whcm.taobao.models.Cart;
import com.whcm.taobao.models.Item;
import com.whcm.taobao.models.ItemList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Cart
 */
@Controller
public class CartController {
  @PostMapping("/add-to-cart")
  public String add(final HttpServletRequest request) {
    final Map<String, String[]> params = request.getParameterMap();
    // System.out.println("**************************************************************");
    // System.out.println(params.get("id"));
    // System.out.println(ItemList.get(Integer.valueOf(params.get("id")[0])));
    // System.out.println(ItemList.get(Integer.valueOf(params.get("id")[0])).price);
    Item item = ItemList.get(Integer.valueOf(params.get("id")[0]));
    Cart.add(item, 1);
    return "redirect:/";
  }

  @RequestMapping("go-to-cart")
  public String gotoCart(final Model model) {
    model.addAttribute("itemList", Cart.all());

    return "/cart";
  }
}