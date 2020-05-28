package _ejercicioPractica;

public class Persona {

    private String nombre;
    private int codigo;

    public Persona(String nombre, int codigo){
        this.nombre = nombre;
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
}
