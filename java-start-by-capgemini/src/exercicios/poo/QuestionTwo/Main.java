package exercicios.poo.QuestionTwo;

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta1 = new ContaCorrente(12, "Camila", 89.90);
        conta1.alterarNome("Veronica");
        System.out.println(conta1);
        conta1.saque(34.90);
        System.out.println(conta1);
        conta1.deposito(34.9);
        System.out.println(conta1);


        ContaCorrente conta2 = new ContaCorrente(13, "Laila");
        System.out.println(conta2);
    }
}
