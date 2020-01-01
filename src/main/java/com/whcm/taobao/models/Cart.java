package com.whcm.taobao.models;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * items
 */
public class Cart {
  static public Map<Integer, Item> cartItems = new HashMap<Integer, Item>();

  public static void add(final Item item, final int cnt) {
    Item cartItem;
    if (Cart.cartItems.get(item.id) != null) {
      cartItem = Cart.cartItems.get(item.id);
      cartItem.count += cnt;
    } else {
      cartItem = item.clone();
      cartItem.count = cnt;
    }
    Cart.cartItems.put(item.id, cartItem);
  }

  public static Collection<Item> all() {
    return Cart.cartItems.values();
  }

  public static void clear() {
    for (Item item : Cart.all()) {
      Item i = ItemList.get(item.id);
      if (i != null) {
        i.count -= item.count;
      }
    }
    Cart.cartItems.clear();
  }
}
