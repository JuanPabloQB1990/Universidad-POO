import java.util.ArrayList;

public class Profesor extends Persona {
    private String titulo;
    private ArrayList<String> materias;


    public Profesor(String nombre, int edad, String genero, String titulo) {
        super(nombre, edad, genero);
        this.titulo = titulo;
        this.materias = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void agregarMaterias(String materia) {
        this.materias.add(materia);
    }



}
