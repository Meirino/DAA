import DyV.BusqBinaria.BusquedaBin;
import DyV.Floor.Floor;
import DyV.Ocurrencias.Ocurrences;

import java.util.Comparator;

public class MainClass {

    public static void main(String[] args) {

        Estudiante est1 = new Estudiante("Javier", 23, 177);
        Estudiante est2 = new Estudiante("Kinno", 23, 169);
        Estudiante est3 = new Estudiante("Pepe", 20, 175);
        Estudiante est4 = new Estudiante("Manolo", 21, 174);
        Estudiante est5 = new Estudiante("Ahmed", 22, 170);
        Estudiante est6 = new Estudiante("Laura", 19, 165);

        Integer[] arrayInt = {1, 2, 3, 5, 9, 12, 12, 12, 20, 22, 24, 25, 26, 29, 30};
        int[] arrayInt2 = {1, 2, 3, 5, 9, 12, 12, 12, 20, 22, 24, 25, 26, 29, 30};
        Estudiante[] arrayEst = {est1, est2, est3, est4, est5, est6};

        Comparator<Integer> comp1 = Comparator.naturalOrder();
        BusquedaBin b1 = new BusquedaBin<>(comp1);
        System.out.println(b1.BusqBinMetodo(arrayInt, 5));

        Comparator<Integer> comp2 = Comparator.naturalOrder();
        Floor f = new Floor<>(comp2);
        System.out.println(f.floor(arrayInt, 4));

        System.out.println(new Ocurrences(comp1).Ocurrencias(arrayInt, 12));
    }
}
