package Pizza.entidades;

public class Pizza {
    private String recheio_1;
    private String recheio_2;
    private String borda;
    private String tamanho;

    public void setRecheio_1(String recheio_1) {
        this.recheio_1 = recheio_1;
    }

    public void setRecheio_2(String recheio_2) {
        this.recheio_2 = recheio_2;
    }

    public void setBorda(String borda) {
        this.borda = borda;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Sua pizza será preparada com os seguintes ingredientes: \n\n" +

                "Tamanho: " + this.tamanho + " | " +
                "Recheio 1: " + this.recheio_1 + " | " +
                "Recheio 2: " + this.recheio_2 + " | " +
                "Borda: " + this.borda;

    }

}
