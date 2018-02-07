package DyV.Skylines;

import java.util.Comparator;

public class Punto implements Comparable {

    int x, altura;

    public String toString() {
        return "(" + this.getX() + ", " + this.getAltura() + ")";
    }

    public Punto(int x, int altura){
        this.x = x;
        this.altura = altura;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public int compareTo(Object o) {
        Punto p = (Punto) o;

        if(this.equals(p)) {
            return 0;
        }
        if(this.getX() > p.getX() || (this.getX() == p.getX() && this.getAltura() > p.getAltura())) {
            return 1;
        } else {
            return -1;
        }
    }
}
