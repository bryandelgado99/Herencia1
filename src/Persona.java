public class Persona {
    private int CI;
    private String telefono;
    private String nombre;
    private String apellido;
    private String direccion;
    private int horas_entrenamiento;
    private String signo_zodiacal;


    public Persona(int CI, String telefono, String nombre, String apellido, String direccion, int horas_entrenamiento, String signo_zodiacal) {
        this.CI = CI;
        this.telefono = telefono;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.horas_entrenamiento = horas_entrenamiento;
        this.signo_zodiacal = signo_zodiacal;
    }

    public int getCI() {
        return CI;
    }

    public void setCI(int CI) {
        this.CI = CI;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = String.valueOf(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getHoras_entrenamiento() {
        return horas_entrenamiento;
    }

    public void setHoras_entrenamiento(int horas_entrenamiento) {
        this.horas_entrenamiento = horas_entrenamiento;
    }

    public String getSigno_zodiacal() {
        return signo_zodiacal;
    }

    public void setSigno_zodiacal(String signo_zodiacal) {
        this.signo_zodiacal = signo_zodiacal;
    }

    public void lambada(){
        System.out.println("Baila la lambada!");
    }
}
