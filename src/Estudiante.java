public class Estudiante implements Comparable {

    private String nombre;
    private int edad, altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    @Override
    public boolean equals(Object obj) {
        Estudiante est = (Estudiante) obj;

        if(this.getNombre().equals(est.getNombre()) && this.getAltura() == est.getAltura() && this.getEdad() == est.getEdad()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(Object o) {
        Estudiante est = (Estudiante) o;

        if(this.getAltura() > est.getAltura()) {
            return 1;
        }
        if(this.getAltura() < est.getAltura()) {
            return -1;
        } else {
            return 0;
        }
    }
}
