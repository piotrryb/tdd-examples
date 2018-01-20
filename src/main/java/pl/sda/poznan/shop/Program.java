package pl.sda.poznan.shop;

import java.util.Arrays;
import java.util.Scanner;
import pl.sda.poznan.shop.model.Product;
import pl.sda.poznan.shop.repository.ProductRepository;

public class Program {

  public static void main(String[] args) {
    initializeApp();
    boolean exit = false;
    while (!exit) {
      printMenu();
      Scanner scanner = new Scanner(System.in);
      int option = scanner.nextInt();
      switch (option) {
        case 1: {
          System.out.println("Lista produktow: ....");
          ProductRepository.getInstance()
              .getAll()
              .forEach(System.out::println);
//              .forEach(p -> System.out.println(p.toString()));
          break;
        }
        case 2: {
          System.out.println("Logowanie");
          System.out.println("Podaj login: ");
          System.out.println("Podaj haslo: ");
          break;
        }
        case 3: {
          System.out.println("Rejestracja");
          System.out.println("Wypelnij ponizsze dane");
          System.out.println("Imie: ");
          System.out.println("Nazwisko: ");
          System.out.println("Email: ");
          System.out.println("Haslo: ");
          System.out.println("Powtorz haslo: ");
          break;
        }
        case 0: {
          System.out.println("Wychodze z programu ... ");
          exit = true;
        }

      }
    }
  }

  private static void printMenu() {
    System.out.println(" ");
    System.out.println("Menu: ");
    System.out.println("1. Wyswietl wszystkie produkty");
    System.out.println("2. Logowanie");
    System.out.println("3. Rejestracja");
    System.out.println("0. Wyjscie");

  }

  private static void initializeApp(){
    seedProducts();
    //
  }

  private static void seedProducts() {
    Product smartphone = new Product("Nokia", "Desc", 500D);
    Product laptop = new Product("Dell", "Ultrabook", 1500D);
    Product console = new Product("Xbox", "One x", 2000.00);

    ProductRepository
        .getInstance()
        .add(Arrays.asList(smartphone, laptop, console));

  }
}
