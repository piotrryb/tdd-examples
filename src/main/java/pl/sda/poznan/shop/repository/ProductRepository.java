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
    for (Product p : products) {
      if (p.equals(id)) {
        return p;
      }
    }

    List<Product> collect = products
        .stream()
        .filter(new ProductByIdPredicate(id))
        .collect(Collectors.toList());

    throw new UnsupportedOperationException();
  }

  public Product getByName(String name) {
    List<Product> collect = this.products
        .stream()
        .filter(pr -> pr.getName().equals(name))
        .filter(pr -> pr.getPrice() > 500)
//        .map(product -> product.getDescription())
        .collect(Collectors.toList());
    return collect.get(0);
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
