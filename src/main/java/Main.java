import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Wczytanie znaku
    System.out.print("Podaj znak do narysowania obwodu kwadratu: ");
    char znak = scanner.next().charAt(0);
    // Wczytanie rozmiaru

    System.out.print("Podaj rozmiar kwadratu: ");
    int rozmiar = scanner.nextInt();

    // Rysowanie kwadratu
    for (int i = 1; i <= rozmiar; i++) {
      for (int j = 1; j <= rozmiar; j++) {
        if (i == 1 || i == rozmiar || j == 1 || j == rozmiar) {
          System.out.print(znak + " ");
        } else {
          System.out.print("  ");
        }
      }
      System.out.println();
    }
  }
}
