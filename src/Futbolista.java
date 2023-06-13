public class Futbolista extends Persona {
    private int num_camiseta;
    private String representante, posicion, equipo;

    public Futbolista(int CI, String telefono, String nombre, String apellido, String direccion,int horas_entrenameinto, String signo_zodiacal,
                      int num_camiseta,
                      String representante,
                      String posicion,
                      String equipo) {
        super(CI, telefono, nombre, apellido, direccion, horas_entrenameinto, signo_zodiacal);
        //Atributos de clase
        this.equipo = equipo;
        this.num_camiseta = num_camiseta;
        this.posicion = posicion;
        this.representante = representante;
    }


    public int getNum_camiseta() {
        return num_camiseta;
    }

    public void setNum_camiseta(int num_camiseta) {
        this.num_camiseta = num_camiseta;
    }

    public String getRepresentante() {
        return representante;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    private void correr(){
        System.out.println("Este es el metodo correr");
    }

    public void datos(){
        System.out.println(getNombre() + " es futbolista");
        System.out.println("Estrena " + getHoras_entrenamiento() + " horas diarias");
        correr();
    }
}

