package DyV.BusqBinaria;

import java.util.Comparator;

public class BusquedaBin<T> {

    private Comparator<T> comp;

    public BusquedaBin(Comparator<T> comp) {
        this.comp = comp;
    }

    public int BusqBinMetodo(T[] array, T busq) {
        return BusqBinRecGenerico(array, busq, 0, array.length - 1);
    }

    private int BusqBinRecGenerico(T[] array, T busq, int inicio, int fina1) {
        int mitad = (inicio + fina1)/2;
        T mitadVal = array[mitad];

        if(inicio > fina1) {
            return -1;
        } else {
            if(busq.equals(mitadVal)) {
                return mitad;
            } else if(this.comp.compare(busq, mitadVal) > 0) {
                return BusqBinRecGenerico(array, busq, mitad+1, fina1);
            } else {
                return BusqBinRecGenerico(array, busq, inicio, mitad-1);
            }
        }
    }

}
