import java.util.LinkedList;
import java.util.Queue;

public class GeradorDeSenhas {
    private Queue<Integer> filaDeSenhas;
    private int contador;
    private LinkedList<Integer> historico;

    public GeradorDeSenhas() {
        filaDeSenhas = new LinkedList<>();
        contador = 1;
        historico = new LinkedList<>();
    }

    // Método para gerar uma nova senha e adicioná-la à fila
    public void gerarSenha() {
        filaDeSenhas.add(contador);
        System.out.println("Senha gerada: " + contador);
        contador++;
    }

    // Método para chamar o próximo paciente
    public void chamarProximo() {
        if (!filaDeSenhas.isEmpty()) {
            int senha = filaDeSenhas.poll();
            historico.add(senha);
            System.out.println("Próxima senha: " + senha);
        } else {
            System.out.println("Não há pacientes na fila.");
        }
    }

    // Método para exibir o histórico de chamadas
    public void exibirHistorico() {
        System.out.println("Histórico de chamadas:");
        for (int senha : historico) {
            System.out.println("Senha chamada: " + senha);
        }
    }
}
