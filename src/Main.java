// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Estudiante estudiantePedro = new Estudiante("Pedro", 18, "masculino", "123456");
        Estudiante estudianteMaria = new Estudiante("Maria", 20, "femenino", "789654");
        Profesor profesorJuan = new Profesor("Juan", 40, "masculino", "Licenciado en programacion");
        Profesor profesorJose = new Profesor("Jose", 60, "masculino", "Licenciado en Historia");
        CursoPresencial cursoProgramacionPresencial = new CursoPresencial("programacion", profesorJuan, "mañana");
        CursoVirtual cursoHistoria = new CursoVirtual("Historia", profesorJose, "Zoom");
        cursoProgramacionPresencial.inscripcion(estudiantePedro);
        cursoProgramacionPresencial.agregarEstudiante(estudianteMaria);

    }
}