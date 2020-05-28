package _ejercicioPractica;

public class IteratorEmpresa2 implements IIterator {

    private int position;
    private Persona[] lista;

    public IteratorEmpresa2(Persona[] lista){
        this.lista = lista;
        position = 0;
    }

    @Override
    public Persona next() {
        return lista[position++];
    }

    @Override
    public boolean hasNext() {
        return lista.length != 0 && position < lista.length;
    }
}
