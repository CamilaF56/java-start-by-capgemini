package exercicios.poo.QuestionThree;

public class Main {
    public static void main(String[] args) {
        BombaCombustivel carro1 = new BombaCombustivel("diesel", 5.6, 4);

        carro1.abastecerPorLitro();
        carro1.abastecerPorValor(23);

    }
}
