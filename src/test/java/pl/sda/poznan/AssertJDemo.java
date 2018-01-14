package pl.sda.poznan;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import org.junit.Test;

public class AssertJDemo {
  @Test
  public void test(){
    List<String> strings = Arrays.asList("1", "2", "3");
    assertThat(strings).isNotNull();

    Date date = new Date();
//    assertThat(date).is
  }
}
