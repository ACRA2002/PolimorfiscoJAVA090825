import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void adiciona(Conta c) {
        contas.add(c);
    }

    public Conta pegaConta(int indice) {
        return contas.get(indice);
    }

    public int pegaTotalDeContas() {
        return contas.size();
    }
}