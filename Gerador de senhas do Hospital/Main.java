import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GeradorDeSenhas sistema = new GeradorDeSenhas();
        Scanner scanner = new Scanner(System.in);
        int opcao = -1;

        while (opcao != 0) {
            // Tela inicial
            System.out.println("\n=== Sistema Gerador de Senhas ===");
            System.out.println("1. Gerar nova senha");
            System.out.println("2. Chamar próximo paciente");
            System.out.println("3. Exibir histórico de chamadas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();

            if (opcao == 1) {
                // Gera uma nova senha
                sistema.gerarSenha();
                System.out.println("\nNova senha gerada com sucesso!");
            } else if (opcao == 2) {
                // Chama o próximo paciente
                System.out.println("\nChamando o próximo paciente...");
                sistema.chamarProximo();
            } else if (opcao == 3) {
                // Exibe o histórico de chamadas
                System.out.println("\nExibindo o histórico de chamadas:");
                sistema.exibirHistorico();
            } else if (opcao == 0) {
                System.out.println("Encerrando o sistema...");
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }
        }

        scanner.close();
    }
}

