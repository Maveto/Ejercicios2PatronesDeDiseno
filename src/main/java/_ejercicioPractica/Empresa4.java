package _ejercicioPractica;

import java.util.Stack;

public class Empresa4 implements IAgregateList {

    private Stack<Persona> empleados;

    public Empresa4(){
        empleados = new Stack<>();
    }

    public void add(Persona p){
        empleados.push(p);
    }

    @Override
    public IIterator iterator() {
        return new IteratorEmpresa4(empleados);
    }
}
