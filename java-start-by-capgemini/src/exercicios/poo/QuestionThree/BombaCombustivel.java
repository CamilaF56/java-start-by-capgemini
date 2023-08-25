package exercicios.poo.QuestionThree;

public class BombaCombustivel {
    private String tipoCombustivel;

    private double valorPorLitro;

    private int quantidadeCombustivel;

    public BombaCombustivel(String tipoCombustivel, double valorPorLitro, int quantidadeCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
        this.valorPorLitro = valorPorLitro;
        this.quantidadeCombustivel = quantidadeCombustivel;
    }
    public void abastecerPorValor(double total){
        System.out.printf("\nQuantidade de combustivel colocada: %.2f", total/valorPorLitro);
    }

    public void abastecerPorLitro(){
        System.out.printf("\nValor a ser pago: %.2f",  quantidadeCombustivel*valorPorLitro);
    }

    public void alterarValor(double valorPorLitro) {
        this.valorPorLitro = valorPorLitro;
    }

    public void alterarCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }

    public void alterarQuantidadeCombustivel(int quantidadeCombustivel) {
        this.quantidadeCombustivel = quantidadeCombustivel;
    }

}
