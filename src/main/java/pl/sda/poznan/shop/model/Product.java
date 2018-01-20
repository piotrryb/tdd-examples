package pl.sda.poznan.shop.model;

/**
 * Model class for representing Product
 */
public class Product implements Comparable<Product>{

  private Long id;
  private String name;
  private String description;
  private Double price;

  public Product() {
  }

  public Product(String name, String description, Double price) {
    this.name = name;
    this.description = description;
    this.price = price;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }

  @Override
  public int compareTo(Product o) {
    return price.compareTo(o.getPrice());
  }

  @Override
  public String toString() {
    return String.format("%s - %s - %s - %.2f", id, name, description, price);
  }
}
