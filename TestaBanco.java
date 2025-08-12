public class TestaBanco {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Conta c1  = new Conta();
        Conta c2  = new ContaCorrente();
        Conta c3  = new ContaPoupanca();

        c1.deposita(1000);
        c2.deposita(1000);
        c3.deposita(1000);

        banco.adiciona(c1);
        banco.adiciona(c2);
        banco.adiciona(c3);

        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);

        for (int i = 0; i < banco.pegaTotalDeContas(); i++) {
            Conta conta = banco.pegaConta(i);
            adc.roda(conta);
        }

        System.out.println("Saldo Total do Banco: " + adc.getSaldoTotal());
    }
}