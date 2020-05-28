package _ejercicioPractica;

import java.util.Vector;

public class Empresa3 implements IAgregateList {

    private Vector<Persona> empleados;

    public Empresa3(){
        empleados = new Vector<>();
    }

    public void add(Persona p){
        empleados.add(p);
    }

    @Override
    public IIterator iterator() {
        return new IteratorEmpresa3(empleados);
    }
}
