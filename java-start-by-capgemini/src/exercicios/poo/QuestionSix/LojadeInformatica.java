package exercicios.poo.QuestionSix;

public class LojadeInformatica {

    public static void main(String[] args) {
        Invoice oq = new Invoice(12, "Escova de Dentes", -2, -9);

        System.out.println(oq.getInvoiceAmount());
        System.out.println(oq);
    }
}
