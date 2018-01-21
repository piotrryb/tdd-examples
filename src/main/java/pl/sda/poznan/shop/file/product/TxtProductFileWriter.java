package pl.sda.poznan.shop.file.product;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import pl.sda.poznan.shop.model.Product;

public class TxtProductFileWriter implements ProductFileWriter {

  private String path;

  public TxtProductFileWriter(String path) {
    this.path = path;
  }

  @Override
  public void saveToFile(List<Product> elements) throws IOException {
    // Napisac zapis do pliku
    List<String> collect = elements.stream()
        .map(prod -> prod.toString())    // z wykorzystaniem method reference    .map(String::toString)
        .collect(Collectors.toList());

    Files.write(Paths.get(path), collect);
  }
}
