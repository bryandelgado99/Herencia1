public class Estudiante extends Persona{
    private int cod_unico, semestre;
    private String correo_institucional, carrera;

    public Estudiante(int CI,
                      String telefono,
                      String nombre,
                      String apellido,
                      String direccion,
                      String signo_zodiacal,
                      int horas_entrenamiento,
                      int cod_unico,
                      int semestre,
                      String correo_institucional,
                      String carrera) {

        super(CI, telefono, nombre, apellido, direccion, horas_entrenamiento, signo_zodiacal);
        //Atributos propios de clase
        this.cod_unico = cod_unico;
        this.correo_institucional = correo_institucional;
        this.semestre = semestre;
        this.carrera = carrera;
    }


    public int getCod_unico() {
        return cod_unico;
    }

    public void setCod_unico(int cod_unico) {
        this.cod_unico = cod_unico;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public String getCorreo_institucional() {
        return correo_institucional;
    }

    public void setCorreo_institucional(String correo_institucional) {
        this.correo_institucional = correo_institucional;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void estudiar(){
        System.out.println("Aprobado");
    }



    private void leer(){
        System.out.println("Este es el metodo leer");;
    }

    public void datos(){
        System.out.println(getNombre() + " es estudiante");
        System.out.println("Esta en " + getSemestre() + "semestre");
        leer();
    }
}
