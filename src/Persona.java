import java.util.ArrayList;

public class Persona {
    private String nombre;
    private int edad;
    private String genero;

    public Persona(String nombre, int edad, String genero) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
    }

    public String getDatos() {
        return "nombre= " + nombre + ", edad= " + edad + ", genero= " + genero;
    }

}
