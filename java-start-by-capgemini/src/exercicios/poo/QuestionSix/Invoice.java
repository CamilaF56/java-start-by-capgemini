package exercicios.poo.QuestionSix;

public class Invoice {
    private int numerodoItem;
    private String description;
    private int quantComprada;
    private double precoUnitario;

    public Invoice(int numerodoItem, String description, int quantComprada, double precoUnitario) {
        this.numerodoItem = numerodoItem;
        this.description = description;
        this.quantComprada = quantComprada < 0 ? 0 : quantComprada;
        this.precoUnitario = precoUnitario < 0 ? 0 : precoUnitario;
    }

    public int getNumerodedoItem() {
        return numerodoItem;
    }

    public void setNumerodoItem(int numerodoItem) {
        this.numerodoItem = numerodoItem;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getQuantComprada() {
        return quantComprada;
    }

    public void setQuantComprada(int quantComprada) {
        this.quantComprada = quantComprada;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "numerodoItem=" + numerodoItem +
                ", description='" + description + '\'' +
                ", quantComprada=" + quantComprada +
                ", precoUnitario=" + precoUnitario +
                '}';
    }

    public double getInvoiceAmount(){
        double total = precoUnitario*quantComprada;
        return total;
    }
}
