/*********************************************************************
  * 2) Faça um programa que: 
  * - Leia a cotação do dólar
  * - Leia um valor em dólares
  * - Converta esse valor para real
  * - Mostre o resultado
  *
  *********************************************************************/
import java.util.Scanner;

public class ConversorDolarReal {
  Scanner entrada = new Scanner(System.in);
  double cotacao_dolar, valor_dolar, valor_real;

  System.out.print("Conversor de dólar em real\n\n");

  System.out.print("Digite a cotação do dólar: ");
  cotacao_dolar = entrada.nextDouble();

  valor_real = cotacao_dolar * valor_dolar;

  System.out.print("O valor em reais é: "+ valor_real+ "\n");

  }

}

  
