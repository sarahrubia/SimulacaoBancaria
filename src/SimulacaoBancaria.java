import java.util.Locale;
import java.util.Scanner;

public class SimulacaoBancaria {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
    double saldo = 0;
    boolean continuar = true;

    while (continuar) {
      System.out.println(
          "Digite o número de uma das opções para realizar uma operação:\n 1. Depositar \n 2. Sacar \n 3. Consultar Saldo \n 4. Encerrar");
      int opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          System.out.println("Qual o valor que você deseja depositar?");
          Double valorDepositado = scanner.nextDouble();
          saldo += valorDepositado;
          System.out.println(String.format("Saldo atual: R$ %.2f", saldo));
          break;
        case 2:
          System.out.println("Qual o valor que você deseja sacar?");
          Double valorSacado = scanner.nextDouble();
          if (saldo > valorSacado) {
            saldo -= valorSacado;
            System.out.println(String.format("Saldo atual: R$ %.2f", saldo));
          } else {
            System.out.println("Saldo insuficiente.");
          }
          break;
        case 3:
          System.out.println(String.format("Saldo atual: R$ %.2f", saldo));
          break;
        case 4:
          System.out.println("Programa encerrado.");
          continuar = false; // Atualiza a variável de controle para encerrar o loop
          break;
        default:
          System.out.println("Opção inválida. Tente novamente.");
      }
    }
    scanner.close();
  }
}
