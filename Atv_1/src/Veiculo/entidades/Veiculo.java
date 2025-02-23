package Veiculo.entidades;

public class Veiculo {
    private String tipo = "";
    private String cor = "";
    private int qtdRodas;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setQtdRodas(int qtdRodas) {
        this.qtdRodas = qtdRodas;
    }

    @Override
    public String toString() {
        return "Seu veiculo ficou configurado da seguinte forma: \n\n" +
                "Tipo: " + this.tipo + " | " +
                "Cor: " + this.cor + " | " +
                "Quantidade de rodas: " + this.qtdRodas;

    }
}
