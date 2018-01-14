package pl.sda.poznan;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class GreetingTest {

  @Before
  public void setUp() {
    System.out.println("Uruchamiane przed kazdym testem");
  }

  @After
  public void cleanUp(){
    System.out.println("Uruchamiane po kazdym tescie");
  }

  @BeforeClass
  public static void start(){
    System.out.println("Uruchamiane raz");
  }

  @Test
  @Ignore
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