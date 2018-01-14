package pl.sda.poznan;

import pl.sda.poznan.shop.labda.BaseCalculator;
import pl.sda.poznan.shop.labda.Calculator;

public class Program {

  public static void main(String[] args) {
//    System.out.println("Hello world");
//
//    char[] chars = "Hello".toCharArray();
//
//    "Hello".charAt(0);

    Calculator calculator = new BaseCalculator();
    int sum = calculator.calculate(2, 2);

    System.out.println("Wynik dodawania:" + sum);

    // With Lambda
    Calculator simpleCalc = (a, b) -> a + b;

    int sum1 = simpleCalc.calculate(4, 4);
    System.out.println(sum1);

    ////////////////////////////////////////////////
    int sumResult = calculateExpressionWithLambaExpression((a, b) -> a + b);

    int substractionResult = calculateExpressionWithLambaExpression((a, b) -> a - b);

    int multiplication = calculateExpressionWithLambaExpression((a, b) -> a * b);

    int division = calculateExpressionWithLambaExpression((a, b) -> a / b);




  }

  public static int calculateExpressionWithLambaExpression(Calculator calculator) {
    int a = 5;
    int b = 20;

    return calculator.calculate(a, b);
  }
}
