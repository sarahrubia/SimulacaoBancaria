import java.util.Scanner;

public class ControleSimplesDeSaques {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Por favor, informe o limite diário de saque.");
    double limiteDiario = scanner.nextDouble();

    // Loop for para iterar sobre os saques
    for (int i = 1; i < limiteDiario; i++) {
      System.out.println("Por favor, informe o valor do saque.");
      double valorSaque = scanner.nextDouble();

      if (valorSaque == 0) {
        System.out.println("Transacoes encerradas.");
        break; // Encerra o loop
      } else if (valorSaque > limiteDiario) {
        System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
        break; // Encerra o loop
      } else {
        limiteDiario -= valorSaque;
        System.out.println("Saque realizado. Limite restante: " + limiteDiario);
      }
    }

    // Fechar o scanner para evitar vazamentos de recursos
    scanner.close();
  }
}
