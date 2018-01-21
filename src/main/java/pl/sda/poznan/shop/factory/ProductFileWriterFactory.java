package pl.sda.poznan.shop.factory;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import pl.sda.poznan.shop.file.product.JsonProductFileWriter;
import pl.sda.poznan.shop.file.product.ProductFileWriter;
import pl.sda.poznan.shop.file.product.TxtProductFileWriter;
import pl.sda.poznan.shop.file.product.XmlProductFileWriter;

public class ProductFileWriterFactory implements Factory<String, ProductFileWriter> {

  private Map<String, ProductFileWriter> writerMap = new HashMap<>();

  // Kluczem jest funkcja, ktora sprawdza, czy plik konczy sie na np. ".txt"
  // Wartoscia jest funkcje ktora jako argument przyjmuje sciezke i zwraca nowy obiekt typu konkretnego czytnika
  private Map<Predicate<String>, Function<String, ProductFileWriter>> map = new HashMap<>();

  public ProductFileWriterFactory() {
//    writerMap.put(".txt", new TxtProductFileWriter("?"));
//    writerMap.put(".xml", new XmlProductFileWriter("?"));
//    writerMap.put(".json", new JsonProductFileWriter("?"));

    map.put(s -> s.endsWith(".txt"), s -> new TxtProductFileWriter(s));
    map.put(s -> s.endsWith(".xml"), XmlProductFileWriter::new);
    map.put(s -> s.endsWith(".json"), JsonProductFileWriter::new);

  }

  @Override
  public ProductFileWriter create(String path) {
    // musimy przeiterowac przez caly slownik
    // dla kazdej wartosci wywolujemy funkcje predykatu
    // jezeli zwroci true, to uruchamiamy funkcje odpowiedzialna za tworzenie obiektu
    // tej logiki nie potrzebujemy zmieniac
    // jesli pojawi sie nowy czynik, to uzupelniamy mape
    for (Entry<Predicate<String>, Function<String, ProductFileWriter>> e : map.entrySet()) {
      if (e.getKey().test(path)) { // metoda test -> metoda z interfejsu Funkcyjnego predicate
        return e.getValue()
            .apply(path); // metoda apply -> metoda z interfejsu funkcyjnego Function
      }
    }
    return null;
  }
}