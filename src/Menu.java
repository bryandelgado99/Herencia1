import java.util.ArrayList;

public class Menu {
    public static void main(String[] args) {

        //Creacion de lista o array de datos  //Creacion de lista o array de datos
        ArrayList <Persona> integrantes = new ArrayList<Persona>();

        Persona Nohemi = new Persona(1750565414, "9887451521", "Nohemi", "Espinel",
                "Ciudadela Ibarra", 6, "Piscis");

        Persona Paul = new Persona(1750629980, "0987500764", "Paul", "Delgado",
                "S40D", 6, "Piscis");

        Persona Pamela = new Persona(1750823773, "0963703294", "Tiffany", "Morales",
                "S40D", 6, "Piscis");

        integrantes.add(Nohemi);
        integrantes.add(Paul);
        integrantes.add(Pamela);

        System.out.println("\n----------->Lista de estudiantes: \n");
        for (Persona integrante:integrantes){
            System.out.println(integrante.getNombre() + " " + integrante.getApellido() + "->");
            integrante.lambada();
        }

        System.out.println(" ");

        //Instancias-----------------------------------------------------------------------------------------------------------------------------
        Doctor Ana = new Doctor(1750629980, "099887485", "Ana", "Puentes", "S40D", 5, "Leo",
                1211185,"Dermatología", "HCAM", "10:00 - 15:00");

        Empleado Pablo = new Empleado(1750629980, "123456", "Pablo", "Puentes", "S40D", "5", 9,
                1211185,"Dermatología", "HCAM", "10:00 - 15:00");

        Futbolista Maritza = new Futbolista(1750629980, "099887485", "Maritza", "Puentes", "S40D", 5, "Leo",
                1211185,"Dermatología", "HCAM", "10:00 - 15:00");

        Estudiante Melani = new Estudiante(1750629980, "099887485", "Melani", "Puentes", "S40D", "Aries" , 5,
                1211185,3, "HCAM", "10:00 - 15:00");

        System.out.println(" ");
        Ana.datos();
        System.out.println(" ");
        Pablo.datos();
        System.out.println(" ");
        Maritza.datos();
        System.out.println(" ");
        Melani.datos();
    }

}
