public class Doctor extends Persona{
    private int code;
    private String especialidad, hospital, horario;

    public Doctor(int CI, String telefono, String nombre, String apellido, String direccion, int horas_entrenamiento, String signo_zodiacal,
                  int code,
                  String especialidad,
                  String hospital,
                  String horario) {
        super(CI, telefono, nombre, apellido, direccion, horas_entrenamiento, signo_zodiacal);
        //Atributos de la clase
        this.code = code;
        this.especialidad = especialidad;
        this.horario = horario;
        this.hospital = hospital;
    }


    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getHospital() {
        return hospital;
    }

    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void examinar(){
        System.out.println("Este es el metodo examinar");
    }

    public void datos(){
        System.out.println(getNombre() + " es Doctora");
        System.out.println("Es de signo " + getSigno_zodiacal() );
        System.out.println("Tiene 33 años");
        examinar();
    }

}
