/*1. Create a Java program to simulate a vehicle driving test containing the attributes: user name, age, car color and whether it is on (use boolean). After that,
the system returns the following information:
● If the car is on: the car lights up the dashboard and displays “welcome, name”.
● If the car is off: the user is notified that they need to press the start button.*/

import java.util.Scanner;

public class SimuladorTesteDirecao {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.print("Nome do usuário: ");
    String nome = sc.nextLine();

    System.out.print("Idade: ");
    int idade = sc.nextInt();
    sc.nextLine();

    System.out.print("Cor do carro: ");
    String cor = sc.nextLine();

    System.out.print("O carro está ligado? (true/false): ");
    boolean ligado = sc.nextBoolean();

    if (ligado) {
      System.out.println("Painel aceso. Bem-vindo, " + nome + "!");
    } else {
      System.out.println("Carro desligado. Pressione o botão START.");
    }

  }
}


