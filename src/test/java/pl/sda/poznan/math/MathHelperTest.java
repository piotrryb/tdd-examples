package pl.sda.poznan.math;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MathHelperTest {

  @Test
  public void should_return_one() {
    // AAA
    // Arrange
    int n = 0;

    // Act
    int factorial = MathHelper.factorial(n);

    // Assert
    assertEquals(1, factorial);
  }

  @Test
  public void should_return_result_when_one_is_passed() {
    int n = 1;
    int result = MathHelper.factorial(n);
    assertEquals(1, result);
  }

  @Test
  public void should_calculate_factorial() {
    // AAA
    // Arrange
    int n = 5;

    // Act
    int factorial = MathHelper.factorial(n);

    // Assert

    assertEquals(120, factorial);
  }

  @Test(expected = IllegalArgumentException.class)
  public void should_throw_exception_on_negative_value() {
    int n = -5;
    int result = MathHelper.factorial(n);
  }
}