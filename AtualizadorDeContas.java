public class AtualizadorDeContas {
    private double saldoTotal = 0;
    private double selic;

    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }

    public void roda(Conta c) {
        double saldoAntes = c.getSaldo();
        System.out.println("Saldo anterior:       " + saldoAntes);
        c.atualiza(selic);
        double saldoDepois = c.getSaldo();
        System.out.println("Saldo após atualização: " + saldoDepois);
        this.saldoTotal += saldoDepois;
    }

    public double getSaldoTotal() {
        return this.saldoTotal;
    }
}