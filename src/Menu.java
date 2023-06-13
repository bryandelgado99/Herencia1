public class Menu {
    public static void main(String[] args) {

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
