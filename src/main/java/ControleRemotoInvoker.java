import java.util.ArrayList;
import java.util.List;

public class ControleRemotoInvoker {
    private List<Operacao> operacoes = new ArrayList<>();

    public void adicionarOperacao(Operacao operacao) {
        operacoes.add(operacao);
    }

    public void executarOperacoes() {
        for (Operacao operacao : operacoes) {
            operacao.realizar();
        }
        operacoes.clear();
    }
}