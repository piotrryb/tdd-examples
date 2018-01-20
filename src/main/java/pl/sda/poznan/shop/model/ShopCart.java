package pl.sda.poznan.shop.model;

import java.util.ArrayList;
import java.util.List;
import pl.sda.poznan.shop.iterator.Iterable;
import pl.sda.poznan.shop.iterator.Iterator;

public class ShopCart implements Iterable<CartItem> {

  private List<CartItem> cartItems = new ArrayList<>();
  private double sum;

  public void add(CartItem cartItem) {
    this.cartItems.add(cartItem);
    this.sum += cartItem.getUnitPrice() * cartItem.getQuantity();
  }

  public double getSum() {
    return sum;
  }

  @Override
  public Iterator<CartItem> getIterator() {
    return new Iterator<CartItem>() {

      private int index = 0;

      @Override
      public boolean hasNext() {
        return index < cartItems.size();
      }

      @Override
      public CartItem next() {
        return cartItems.get(index++);
      }

      @Override
      public void reset() {
        index = 0;
      }
    };
  }
}
