package DyV.Skylines;

public class Edificio {

    int altura, inicio, fin;

    public Edificio(int altura, int inicio, int fin) {
        this.altura = altura;
        this.inicio = inicio;
        this.fin = fin;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getInicio() {
        return inicio;
    }

    public void setInicio(int inicio) {
        this.inicio = inicio;
    }

    public int getFin() {
        return fin;
    }

    public void setFin(int fin) {
        this.fin = fin;
    }
}
