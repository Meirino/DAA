package DyV.Coincidencia;

public class Coincidencia {

    public int CoincidenciaMetodo (int[] array) {
        return Coincidencia(array, 0, array.length - 1);
    }

    private int Coincidencia(int[] array, int inicio, int fina1) {
        int mitad = (inicio + fina1)/2;

        if(inicio > fina1) {
            return -1;
        } else {
            if(mitad == array[mitad]) {
                return mitad;
            } else if(mitad > array[mitad]) {
                return Coincidencia(array, inicio, mitad-1);
            } else {
                return Coincidencia(array, mitad+1, fina1);
            }
        }
    }
}
