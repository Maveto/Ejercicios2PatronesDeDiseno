package _ejercicioPractica;

public class Empresa2 implements IAgregateList{

    private int position;
    private Persona[] empleados;

    public Empresa2(){
        empleados = new Persona[5];
        position = 0;
    }

    public void add(Persona p){
        empleados[position] = p;
        position++;
    }

    @Override
    public IIterator iterator() {
        return new IteratorEmpresa2(empleados);
    }
}
