package exercicios.poo.QuestionTwo;

public class ContaCorrente {
    private int numeroConta;

    private String nome;

    private double saldo;

    public ContaCorrente(int numeroConta, String nome) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = 0;
    }

    public ContaCorrente(int numeroConta, String nome, double saldo) {
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.saldo = saldo;
    }

    public void alterarNome(String nome) {
        this.nome = nome;
    }

    public String deposito(double valor){
        saldo = saldo + valor;
        return "Valor atual na conta: " + saldo;
    }

    public String saque(double valor){
        saldo = saldo - valor;
        return "Valor atual na conta: " + saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" +
                "numeroConta=" + numeroConta +
                ", nome='" + nome + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}
