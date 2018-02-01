import DyV.BusqBinaria.BusquedaBin;

import java.util.Comparator;

public class MainClass {

    private static Integer[] arrayInt = {1, 2, 3, 5, 9, 12, 20, 22, 24, 25, 26, 29, 30};

    public static void main(String[] args) {
        Comparator<Integer> comp = Comparator.naturalOrder();
        BusquedaBin b = new BusquedaBin<>(comp);
        System.out.println(b.BusqBinMetodo(arrayInt, 5));
    }
}
