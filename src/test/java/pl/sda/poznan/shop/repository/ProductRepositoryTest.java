package pl.sda.poznan.shop.repository;

import static org.junit.Assert.*;

import org.junit.Test;
import pl.sda.poznan.shop.model.Product;

public class ProductRepositoryTest {

  @Test
  public void should_return_same_instance() {
    ProductRepository firstInstance = ProductRepository.getInstance();
    ProductRepository secondInstance = ProductRepository.getInstance();

    boolean isSameInstance = firstInstance == secondInstance;

    assertEquals(true, isSameInstance);
    assertSame(firstInstance, secondInstance);
  }
}