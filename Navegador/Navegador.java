import java.util.Stack;

public class Navegador {
    private Stack<String> pilhaVoltar;
    private Stack<String> pilhaAvancar;
    private String paginaAtual;

    public Navegador() {
        pilhaVoltar = new Stack<>();
        pilhaAvancar = new Stack<>();
        paginaAtual = null; // Nenhum site no início
    }

    public void acessarPagina(String url) {
        if (paginaAtual != null) {
            pilhaVoltar.push(paginaAtual); // Adiciona à pilha do voltar
        }
        paginaAtual = url; // Atualiza a página atual
        pilhaAvancar.clear(); // Limpa pilha de avançar
    }

    public void voltar() {
        if (!pilhaVoltar.isEmpty()) {
            pilhaAvancar.push(paginaAtual); // Adiciona à pilha de avançar
            paginaAtual = pilhaVoltar.pop(); // Retorna ao site anterior
        }
    }

    public void avancar() {
        if (!pilhaAvancar.isEmpty()) {
            pilhaVoltar.push(paginaAtual); // Adiciona à pilha do voltar
            paginaAtual = pilhaAvancar.pop(); // Avança ao próximo site
        }
    }

    public String getPaginaAtual() {
        return paginaAtual != null ? paginaAtual : "Nenhuma página";
    }
}
