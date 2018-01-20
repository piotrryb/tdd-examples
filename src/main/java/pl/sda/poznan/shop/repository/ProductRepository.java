package pl.sda.poznan.shop.repository;

import java.util.List;
import java.util.Optional;
import pl.sda.poznan.shop.exception.ProductNotFoundException;
import pl.sda.poznan.shop.model.Product;

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
    Optional<Product> first = this.products.stream()
        .filter(p -> p.getId().equals(id))
        .findFirst();

    return first
        .orElseThrow(() ->
            new ProductNotFoundException("Nie ma produktu o takim identyfikatorze")
        );
  }

  public Product getByName(String name) {
    return this.products
        .stream()
        .filter(x -> x.getName().equals(name))
        .findFirst()
        .orElseThrow(() -> new ProductNotFoundException("Can't find product with given name"));
  }

  public boolean remove(Long id) {
    return this.products.removeIf(p -> p.getId().equals(id));
  }

  public boolean remove(Product product) {
    return this.products.remove(product);
  }

  public int count() {
    return this.products.size();
  }
}
