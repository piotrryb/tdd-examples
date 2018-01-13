package pl.sda.poznan.math;

public class PrimeChecker {

  public static boolean isPrime(int number) {
    // Przechodzimy petla for przez wszystkie liczby od 2 do szukanej liczby
    for (int i = 2; i <= number / 2; i++) {
      // jezeli liczba dzieli sie przez i-ty element to nie jest pierwsza
      if (number % i == 0) {
        return false;
      }
    }
    return true;
  }
}
