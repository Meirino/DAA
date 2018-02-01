package DyV.Ocurrencias;

import DyV.BusqBinaria.BusquedaBin;

import java.util.Comparator;

public class Ocurrences<T> {

    private Comparator<T> comp;

    public Ocurrences(Comparator<T> comp) {
        this.comp = comp;
    }

    public int Ocurrencias(T[] array, T busq) {
        return OcurrenciasGen(array, busq, 0, array.length - 1);
    }

    private int OcurrenciasGen(T[] array, T n, int inicio, int fin) {
        int mitad = (inicio + fin)/2;
        T mitadVal = array[mitad];

        if(comp.compare(n, array[inicio]) < 0 || comp.compare(n, array[fin]) > 0 || inicio > fin) return 0;

        if(mitadVal.equals(n)) {
            return 1 + OcurrenciasGen(array, n, inicio, mitad - 1) + OcurrenciasGen(array, n, mitad + 1, fin);
        } else if(comp.compare(n, mitadVal) > 0) {
            return OcurrenciasGen(array, n, mitad + 1, fin);
        } else {
            return OcurrenciasGen(array, n, inicio, mitad - 1);
        }
    }
}
