import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Navegador navegador = new Navegador();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n--- Navegador ---");
            System.out.println("1. Acessar nova página");
            System.out.println("2. Voltar");
            System.out.println("3. Avançar");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.print("Digite a URL da página: ");
                String url = scanner.next();
                navegador.acessarPagina(url);
                System.out.println("Você está no site: " + navegador.getPaginaAtual());
            } else if (opcao == 2) {
                navegador.voltar();
                System.out.println("Você está no site: " + navegador.getPaginaAtual());
            } else if (opcao == 3) {
                navegador.avancar();
                System.out.println("Você está no site: " + navegador.getPaginaAtual());
            } else if (opcao == 0) {
                System.out.println("Encerrando...");
            } else {
                System.out.println("Opção inválida!");
            }
        } while (opcao != 0);

        scanner.close();
    }
}

