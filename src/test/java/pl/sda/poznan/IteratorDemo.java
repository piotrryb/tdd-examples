package pl.sda.poznan;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;

public class IteratorDemo {

  @Test
  public void test() throws IOException {
    List<String> stringList = Arrays.asList("Piotr", "Test", "Imie");

    for (int i = 0; i < stringList.size(); i++) {
      System.out.println(stringList.get(i));
    }

    for (String s : stringList) {
      System.out.println(s);
    }

    while (stringList.iterator().hasNext()) {
      String element = stringList.iterator().next();
      System.out.println(element);
    }

    ////////////////////////////////
    String line = null;
    BufferedReader bufferedReader = new BufferedReader(new FileReader("plik.txt"));

    while ((line = bufferedReader.readLine()) != null) {
      System.out.println(line);
    }


  }
}
