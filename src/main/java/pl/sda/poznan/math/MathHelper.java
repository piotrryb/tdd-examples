package pl.sda.poznan.math;

public class MathHelper {

  private MathHelper() {
    throw new IllegalStateException("Utility class");
  }

  public static int factorial(int n) {
    if(n < 0){
      throw new IllegalArgumentException("n cannot be less than 0");
    }
    if (n == 0 || n == 1) {
      return 1;
    }
    return factorial(n - 1) * n;
  }

}
