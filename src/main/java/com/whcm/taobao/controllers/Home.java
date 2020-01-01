package com.whcm.taobao.controllers;

import com.whcm.taobao.models.ItemList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Home {
  @RequestMapping("/")
  public String homePage(Model model) {
    // ArrayList<Item> items = new ArrayList<>();
    // Item item = new Item(0, "128.00", "68", "潘歌旗舰店",
    // "潘歌针织衫连衣裙2019秋冬季女装新款宽松显瘦休闲两件套套装裙打底毛衣裙子",
    // "https://ss3.bdstatic.com/70cFv8Sh_Q1YnxGkpoWK1HF6hhy/it/u=310491111,3883904556&fm=11&gp=0.jpg");
    // items.add(item);
    // model.addAttribute("itemList", items);

    // ItemList.insert(item);
    model.addAttribute("itemList", ItemList.all());
    return "/home";
  }

}