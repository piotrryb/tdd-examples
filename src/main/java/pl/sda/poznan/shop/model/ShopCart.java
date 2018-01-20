package pl.sda.poznan.shop.model;

import java.util.ArrayList;
import java.util.List;

public class ShopCart {

  private List<CartItem> cartItems = new ArrayList<>();
  private double sum;

  public void add(CartItem cartItem) {
    this.cartItems.add(cartItem);
    this.sum += cartItem.getUnitPrice() * cartItem.getQuantity();
  }

  public double getSum() {
    return sum;
  }
}
