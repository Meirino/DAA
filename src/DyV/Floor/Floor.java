package DyV.Floor;

import java.util.Comparator;

public class Floor<T> {

    private Comparator<T> comp;

    public Floor(Comparator<T> comp) {
        this.comp = comp;
    }

    public int floor(T[] array, T n) {
        return floorRec(array, n, 0, array.length - 1);
    }

    private int floorRec(T[] array, T n, int inic, int fin) {
        int mitad = (inic + fin)/2;
        T valorMitad = array[mitad];

        if(inic > fin) return -1;
        if(comp.compare(n, array[fin]) > 0) return fin;

        if(n.equals(valorMitad)) {
            return mitad;
        }
        if(mitad > 0 && comp.compare(array[mitad - 1], n) <= 0 && comp.compare(n, valorMitad) < 0) {
            return mitad - 1;
        }
        if(comp.compare(valorMitad, n) > 0) {
            return floorRec(array, n, inic, mitad - 1);
        } else {
            return floorRec(array, n, mitad + 1, fin);
        }
    }
}
