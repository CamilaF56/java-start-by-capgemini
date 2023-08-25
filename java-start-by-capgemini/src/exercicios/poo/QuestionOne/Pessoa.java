package exercicios.poo.QuestionOne;

public class Pessoa {
    private String name;

    public Pessoa(String name, int anoNascimento, double altura) {
        this.name = name;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }

    private int anoNascimento;

    private double altura;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void imprimirDados(){
        System.out.println("Nome: " + name + "\nNascimento: " + anoNascimento + "\nAltura: " + altura);
    }

    public int calcularIdade(){
        return 2023 - anoNascimento;
    }

}
