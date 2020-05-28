package _ejercicioPractica;

import java.util.ArrayList;
import java.util.List;

public class Empresa1 implements IAgregateList {

    private List<Persona> empleados;

    public Empresa1(){
        empleados = new ArrayList<>();
    }

    public void add(Persona p){
        empleados.add(p);
    }

    @Override
    public IIterator iterator() {
        return new IteratorEmpresa1(empleados);
    }
}
