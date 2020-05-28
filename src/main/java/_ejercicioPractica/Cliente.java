package _ejercicioPractica;

import java.util.HashMap;
import java.util.Map;

public class Cliente {
    public static void main(String[] args) {
        Empresa1 e1 = new Empresa1();
        Empresa2 e2 = new Empresa2();
        Empresa3 e3 = new Empresa3();
        Empresa4 e4 = new Empresa4();
        Map<Integer, Persona> todos = new HashMap<>();

        e1.add(new Persona("Juan1", 1));
        e1.add(new Persona("Juan2", 2));
        e1.add(new Persona("Juan3", 3));
        e1.add(new Persona("Juan4", 4));
        e1.add(new Persona("Juan5", 5));
        e2.add(new Persona("Pedro1", 6));
        e2.add(new Persona("Pedro2", 7));
        e2.add(new Persona("Pedro3", 8));
        e2.add(new Persona("Pedro4", 9));
        e2.add(new Persona("Pedro5", 10));
        e3.add(new Persona("Jose1", 11));
        e3.add(new Persona("Jose2", 12));
        e3.add(new Persona("Jose3", 13));
        e3.add(new Persona("Jose4", 14));
        e3.add(new Persona("Jose5", 15));
        e4.add(new Persona("Maria1", 16));
        e4.add(new Persona("Maria2", 17));
        e4.add(new Persona("Maria3", 18));
        e4.add(new Persona("Maria4", 19));
        e4.add(new Persona("Maria5", 20));

        IIterator iterator = e1.iterator();

        while (iterator.hasNext()){
            Persona p = iterator.next();
            todos.put(p.getCodigo(),p);
        }

        iterator = e2.iterator();

        while (iterator.hasNext()){
            Persona p = iterator.next();
            todos.put(p.getCodigo(),p);
        }

        iterator = e3.iterator();

        while (iterator.hasNext()){
            Persona p = iterator.next();
            todos.put(p.getCodigo(),p);
        }

        iterator = e4.iterator();

        while (iterator.hasNext()){
            Persona p = iterator.next();
            todos.put(p.getCodigo(),p);
        }

        for(Integer key : todos.keySet()){
            System.out.println(todos.get(key).getNombre());
        }
    }
}
