public class Empleado extends Persona {
    private int reg_cod;
    private String cargo, entidad, puesto;

    public Empleado(int CI, String telefono, String nombre, String apellido, String direccion, String signo_zodiacal, int horas_entrenamiento,
                    int reg_cod,
                    String puesto,
                    String cargo,
                    String entidad) {
        super(CI, telefono, nombre, apellido, direccion, horas_entrenamiento, signo_zodiacal);
        //Atributos propios de la clase
        this.cargo = cargo;
        this.reg_cod = reg_cod;
        this.entidad =entidad;
    }


    public int getReg_cod() {
        return reg_cod;
    }

    public void setReg_cod(int reg_cod) {
        this.reg_cod = reg_cod;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String pusto) {
        this.puesto = pusto;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEntidad() {
        return entidad;
    }

    public void setEntidad(String entidad) {
        this.entidad = entidad;
    }

    public void trabajar(){
        System.out.println("Nunca lo hacen, solo roban");
    }

    public void tramitar(){
        System.out.println("Este es el metodo tramitar");
    }

    public void datos(){
        System.out.println(getNombre() + "es empleado publico");
        System.out.println("Su telefono es " + getTelefono());
        tramitar();
    }
}
