package _ejercicioPractica;

import java.util.Stack;

public class IteratorEmpresa4 implements IIterator {

    private Stack<Persona> lista;

    public IteratorEmpresa4(Stack<Persona> lista){
        this.lista = lista;
    }

    @Override
    public Persona next() {
        return lista.pop();
    }

    @Override
    public boolean hasNext() {
        return !lista.isEmpty();
    }
}
