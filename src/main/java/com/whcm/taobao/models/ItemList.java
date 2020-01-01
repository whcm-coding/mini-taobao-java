package com.whcm.taobao.models;

import java.util.List;

public class ItemList {
  static public List<Item> items = List.of(
      new Item(0, "128.00", 68, "潘歌旗舰店", "潘歌针织衫连衣裙2019秋冬季女装新款宽松显瘦休闲两件套套装裙打底毛衣裙子",
          "https://img12.360buyimg.com/n7/jfs/t1/89432/18/4540/72734/5de7ada0Efd732c59/f5504e3edbf39047.jpg"),
      new Item(1, "160,21", 50, "歌减女装专营店", "QuinceGirl时尚羽绒服2019秋冬季新款女装韩版百搭中长款网红大毛领白鸭绒大码",
          "https://img13.360buyimg.com/n7/jfs/t1/109925/31/2233/213872/5e05c4e3E83fa4de7/fc632fa3bef8386e.jpg"));

  public static int insert(Item item) {
    ItemList.items.add(item);
    return 0;
  }

  public static Item get(int id) {
    for (Item item : ItemList.items) {
      if (item.id == id) {
        return item;
      }
    }
    return null;
  }

  public static List<Item> all() {
    return ItemList.items;
  }
};
