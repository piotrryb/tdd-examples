package pl.sda.poznan.shop.repository;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import pl.sda.poznan.shop.model.Product;
import pl.sda.poznan.shop.model.ProductByIdPredicate;

public class ProductRepository {

  private static Long productId = 1L;
  private List<Product> products;

  public Product add(Product product) {
    // nadac productId dla produktu
    product.setId(productId++);
    this.products.add(product);
    return product;
  }

  public Product getById(Long id) {
    throw new UnsupportedOperationException();
  }

  public Product getByName(String name) {
    throw new UnsupportedOperationException();
  }

  public void remove(Long id) {
    throw new UnsupportedOperationException();
  }

  public void remove(Product product) {
    throw new UnsupportedOperationException();
  }

  public int count() {
    throw new UnsupportedOperationException();
  }
}
