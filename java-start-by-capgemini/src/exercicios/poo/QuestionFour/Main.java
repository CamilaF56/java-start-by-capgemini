package exercicios.poo.QuestionFour;

public class Main {
    public static void main(String[] args) {
        Elevador e1 = new Elevador();
        e1.Inicializa(5, 7);

        System.out.println(e1.toString());
        e1.Desce();
        e1.Entra();
        e1.Subir();
        System.out.println(e1.toString());
        e1.Subir();
        e1.Subir();
        e1.Subir();
        e1.Subir();
        e1.Subir();

    }
}
