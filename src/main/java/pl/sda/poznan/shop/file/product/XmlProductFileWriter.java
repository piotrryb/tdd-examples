package pl.sda.poznan.shop.file.product;

import java.io.IOException;
import java.util.List;
import pl.sda.poznan.shop.model.Product;

public class XmlProductFileWriter implements ProductFileWriter {

  private String path;

  public XmlProductFileWriter(String path) {
    this.path = path;
  }

  @Override
  public void saveToFile(List<Product> elements) throws IOException {
    throw new UnsupportedOperationException();
  }
}
