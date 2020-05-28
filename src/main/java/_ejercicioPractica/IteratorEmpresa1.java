package _ejercicioPractica;

import java.util.List;

public class IteratorEmpresa1 implements IIterator {

    private int position;
    private List<Persona> lista;

    public IteratorEmpresa1(List<Persona> lista){
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
