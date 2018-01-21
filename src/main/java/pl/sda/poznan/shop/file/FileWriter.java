package pl.sda.poznan.shop.file;

import java.io.IOException;
import java.util.List;
import pl.sda.poznan.shop.model.Product;

public interface FileWriter<E> {

  void saveToFile(List<E> elements) throws IOException;
}
