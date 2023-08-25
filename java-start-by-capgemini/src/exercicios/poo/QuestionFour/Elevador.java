package exercicios.poo.QuestionFour;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidadedoElevador;
    private int quantPessoasAtual;

    public void Inicializa(int totalAndares, int capacidadedoElevador) {
        this.andarAtual = 0; // Terreo
        this.totalAndares = totalAndares;
        this.capacidadedoElevador = capacidadedoElevador;
        this.quantPessoasAtual = 0;
    }

    public void Inicializa(int andarAtual, int totalAndares, int capacidadedoElevador, int quantPessoasAtual) {
        this.andarAtual = andarAtual;
        this.totalAndares = totalAndares;
        this.capacidadedoElevador = capacidadedoElevador;
        this.quantPessoasAtual = quantPessoasAtual;
    }

    public void Entra(){
        if (quantPessoasAtual<capacidadedoElevador) {
            quantPessoasAtual++;
            System.out.println("Pessoa entrou com sucesso agora tem " + quantPessoasAtual+" pessoas no elevador");
        }else{
            System.out.println("Pessoa não conseguiu entrar no elevador, pois está cheio. Tem :" + quantPessoasAtual+" pessoas no elevador");
        }
    }

    public void Sai(){
        if (quantPessoasAtual>0){
            quantPessoasAtual--;
            System.out.println("Pessoa saiu com sucesso agora tem " + quantPessoasAtual+" pessoas no elevador");
        }else{
            System.out.println("Pessoa não conseguiu sair do elevador, pois está vazio.");
        }
    }

    public void Subir(){
        if(andarAtual>=0 && andarAtual<totalAndares){
            andarAtual++;
            System.out.println("Pessoa subiu um andar com sucesso. Agora está no " + andarAtual+" andar");
        }else {
            System.out.println("Pessoa não conseguiu subir, pois está no último andar");
        }
    }

    public void Desce(){
        if(andarAtual>0){
            andarAtual--;
            System.out.println("Pessoa desceu um andar com sucesso. Agora está no " + andarAtual+" andar");
        }else{
            System.out.println("Pessoa não conseguiu descer, pois está no térreo");
        }
    }

    @Override
    public String toString() {
        return "Elevador{" +
                "andarAtual=" + andarAtual +
                ", totalAndares=" + totalAndares +
                ", capacidadedoElevador=" + capacidadedoElevador +
                ", quantPessoasAtual=" + quantPessoasAtual +
                '}';
    }

}
