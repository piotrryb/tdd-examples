package pl.sda.poznan;

import static org.junit.Assert.*;

import org.junit.Test;

public class GreetingTest {

  @Test
  public void should_greet_for_single_name() {
    String greet = Greeting.greet("Jan");
    assertEquals("Hello, Jan", greet);
  }

  @Test
  public void should_greet_as_a_friend_when_null_passed() {
    String greet = Greeting.greet(null);
    assertEquals("Hello, my friend", greet);
  }

  @Test
  public void shoud_return_greet_in_capital_letters() {
    String greet = Greeting.greet("JAN");
    assertEquals("HELLO, JAN", greet);
  }

  @Test
  public void should_greet_two_people() {
    String greet = Greeting.greet("Jan", "Ala");
    assertEquals("Hello, Jan and Ala", greet);
  }

  @Test
  public void shoud_greet_many_people() {
    String greet = Greeting.greet("Piotr", "Anna", "Paulina");
    assertEquals("Hello, Piotr, Anna and Paulina", greet);
  }

  @Test
  public void should_greet_with_capital_letters() {
    String greet = Greeting.greet("Jan", "PIOTR", "Magda");
    assertEquals("Hello, Jan and Magda. AND HELLO PIOTR", greet);
  }

}