package pl.sda.poznan.shop.repository;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.Before;
import org.junit.Test;
import pl.sda.poznan.shop.model.Product;

public class ProductRepositoryTest {

  private List<Product> products;

  @Before
  public void init() {
    Product smartphone = new Product("Nokia", "Desc", 500D);
    Product laptop = new Product("Dell", "Ultrabook", 1500D);
    Product console = new Product("Xbox", "One x", 2000.00);

    this.products = Arrays.asList(smartphone, laptop, console);
  }

  // playground
  @Test
  public void test() {
    // znajdz produkty drozsze niz 1000
    List<Product> results = products
        .stream()
        .filter(mojProd -> mojProd.getPrice() > 1000)
        .collect(Collectors.toList());

    assertEquals(2, results.size());
    assertEquals(3, products.size());
  }

  @Test
  public void should_find_where_starts_with_given_letter() {
    // wyrazenie filtrujace, gdzie mamy produkty drozsze niz 1000 i zaczynajace sie od X

    List<Product> results = products
        .stream()
        .filter(p -> p.getPrice() > 1000)
        .filter(p -> p.getName().startsWith("X"))
        .collect(Collectors.toList());

    assertEquals(1, results.size());

  }

  // znajdz pierwszy kosztujacy tanszy niz 2000
  @Test
  public void should_find_first() {
    List<Product> collect = products
        .stream()
        .filter(p -> p.getPrice() < 20)
        .collect(Collectors.toList());

    // Before Java 8
    if (collect.size() > 0) {
      Product first = collect.get(0);
      if (first == null) {
        throw new NoSuchElementException();
      }
    }

    Optional<Product> optionalProduct = products.stream()
        .filter(p -> p.getPrice() > 10000)
        .findFirst();

    Product p = optionalProduct.orElseThrow(() -> new NoSuchElementException());

//    assertNotNull(first);
  }

  // posortuj alfabetycznie po nazwie

  @Test
  public void should_sort_by_name() {
    this.products.sort(Comparator.comparing(p -> p.getName()));
    // to samo z uzyciem method reference
    this.products.sort(Comparator.comparing(Product::getName));
    this.products.sort(Comparator.comparing(Product::getName));
    this.products.sort((o1, o2) -> o2.getPrice().compareTo(o1.getPrice()));

    this.products.sort(Comparator.naturalOrder());
    this.products.sort(Comparator.reverseOrder());
  }


  // dla kazdego produktu pobierz jego nazwe na liste
  @Test
  public void should_map_to_names() {
    List<String> list = this.products
        .stream()
        .map(p -> p.getName())
        .collect(Collectors.toList());

    List<String> collect = this.products
        .stream()
        .map(p -> p.getName().toUpperCase())
        .collect(Collectors.toList());


    assertEquals(list.size(), 3);
  }


}