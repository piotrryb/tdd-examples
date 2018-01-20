package pl.sda.poznan.shop.model;

import static org.junit.Assert.*;

import org.junit.Test;
import pl.sda.poznan.shop.iterator.Iterator;

public class ShopCartTest {

  @Test
  public void should_iterate_through_cart() {
    ShopCart cart = new ShopCart();

    cart.add(
        CartItem.builder()
            .name("Laptop")
            .unitPrice(12.00)
            .build()
    );

    cart.add(
        CartItem.builder()
            .name("Smartfon")
            .unitPrice(122.00)
            .build()
    );

    Iterator<CartItem> iterator = cart.getIterator();

    while (iterator.hasNext()){
      CartItem next = iterator.next();
      System.out.println(next);
    }
  }
}