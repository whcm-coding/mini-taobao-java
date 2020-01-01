package com.whcm.taobao.models;

/**
 * items
 */
public class Item {
  public int id;
  public String price;
  public String title;
  public String desc;
  public String img;
  public int count;

  public Item(final int id, final String price, final int count, final String title, final String desc,
      final String img) {
    this.id = id;
    this.price = price;
    this.count = count;
    this.img = img;
    this.title = title;
    this.desc = desc;
  }
}
