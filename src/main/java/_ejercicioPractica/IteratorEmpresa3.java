package _ejercicioPractica;

import java.util.Vector;

public class IteratorEmpresa3 implements IIterator {

    private int position;
    private Vector<Persona> lista;

    public IteratorEmpresa3(Vector<Persona> lista){
        this.lista = lista;
        position = 0;
    }

    @Override
    public Persona next() {
        return lista.get(position++);
    }

    @Override
    public boolean hasNext() {
        return lista.size() != 0 && position < lista.size();
    }
}
