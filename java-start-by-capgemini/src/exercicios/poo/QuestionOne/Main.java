package exercicios.poo.QuestionOne;

public class Main {

    public static void main(String[] args) {
        Pessoa camila = new Pessoa("Camila", 2002, 1.53);

        camila.imprimirDados();
        System.out.println(camila.calcularIdade());
    }

}
