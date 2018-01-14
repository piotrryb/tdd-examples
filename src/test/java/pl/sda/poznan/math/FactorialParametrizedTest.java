package pl.sda.poznan.math;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class FactorialParametrizedTest {

  private int n;
  private int expectedValue;

  public FactorialParametrizedTest(int n, int expectedValue) {
    this.n = n;
    this.expectedValue = expectedValue;
  }

  @Parameters
  public static Collection<Object[]> data() {
    return Arrays.asList(new Object[][]{
        {2, 2},
        {3, 6},
        {4, 24},
        {5, 120}
    });
  }

  @Test
  public void calculate_factorial_test() {
    // AAA
    // Act
    int result = MathHelper.factorial(this.n);

    // Assert
    assertEquals(this.expectedValue, result);
  }
}
