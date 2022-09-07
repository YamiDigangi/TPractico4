package tpractico4;

import java.util.ArrayList;
import java.util.Map;


public class Practico4 {

    public static void main(String[] args) {
        
        Directorio direc = new Directorio();
        direc.agragarCliente(2546812, new Cliente(12456,"Marta","Sosa","Santa Fe","Mitre 123"));
//        direc.agragarCliente(5425, new Cliente(12456,"Clemente","Sosa","San Luis","Rivadavia 583"));
//        direc.agragarCliente(8574, new Cliente(12456,"Jaime","Sosa","Cordoba","Santa fe 523"));
//        direc.agragarCliente(2985, new Cliente(12456,"Anastacio","Romero","San Luis","ituzango 754"));
//        direc.agragarCliente(5824, new Cliente(12456,"Giulana","Gil","San Juan","Mitre 123"));
        System.out.println(direc.buscarCliente(2546812));
//        System.out.println();
        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes = direc.buscarClientes("San Luis");
        direc.borrarCliente(2985);
//        for (Cliente clien:clientes){ //recorremos la lista de los que son de la misma ciudad "San Luis".
//            System.out.println("Clientes de San Luis " + clien);
//        }
       for (Map.Entry<Long,Cliente> e:direc.getMapaCliente().entrySet()){
//          int clave= e.getKey();
//          Empleado valor= e.getValue();


//        // TODO code application logic here
//        HashMap<Integer, Empleado> mapa= new HashMap<>();
//         Cliente =new Empleado("Marta Sosa", 43225.220);
//        mapa.put(432532, new Empleado("Juan Perez",12000.434));
//        mapa.put(12345,e1);
//        mapa.put(3333, new Empleado("Javier Torres",220000.434));
//       Set claves= mapa.keySet();
//       Collection valores= mapa.values();
//        for (Map.Entry<Integer,Empleado> e:mapa.entrySet()){
//          int clave= e.getKey();
//          Empleado valor= e.getValue();
         }
            
    }
}

