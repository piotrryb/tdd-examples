package pl.sda.poznan.shop.factory;

import static org.junit.Assert.*;

import org.junit.Test;
import pl.sda.poznan.shop.file.product.JsonProductFileWriter;
import pl.sda.poznan.shop.file.product.ProductFileWriter;
import pl.sda.poznan.shop.file.product.TxtProductFileWriter;

public class ProductFileWriterFactoryTest {

  @Test
  public void create() {
    ProductFileWriterFactory productFileWriterFactory = new ProductFileWriterFactory();

    ProductFileWriter productFileWriter = productFileWriterFactory.create("plik.json");

    assertEquals(JsonProductFileWriter.class, productFileWriter.getClass());
  }
}