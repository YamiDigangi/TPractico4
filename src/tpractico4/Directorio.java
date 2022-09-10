package tpractico4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.JOptionPane;

public class Directorio {

    private HashMap<Long,Cliente> mapaCliente = new HashMap<>();
    private static Directorio direc =  null;

    
    private Directorio() {
    }
    
    public static Directorio getInstance() {
        if (direc == null){
            direc = new Directorio();
        }
        return direc;
    }
    
     HashMap<Long, Cliente> getMapaCliente() {
        return mapaCliente;
    }

    public void agragarCliente(long tel, Cliente clie) {
        mapaCliente.put(tel, clie);
        JOptionPane.showMessageDialog(null,"Cliente agregado Exitosamente");
    }

    public Cliente buscarCliente(long tel) {
       return mapaCliente.get(tel);
    }

    public Set<Long> buscarTelefono(String apell) {
        Set<Long> telefonos = new HashSet<>(); // conjunto de telefonos de ciertos apellidos.
        Set<Long> claves = mapaCliente.keySet(); // se guardan todos los telefonos.
        Iterator it = claves.iterator();
        Cliente clie;
        while(it.hasNext()){
            long tell = (Long)it.next();
            clie = mapaCliente.get(tell); //obtengo el cliente a partir de una clave. (de tipo telefono)
            if (clie.getApellido().equals(apell)){
               telefonos.add(tell);
            }  
        }
        return telefonos;
    }

    public ArrayList<Cliente> buscarClientes(String ciu) {
        ArrayList<Cliente> clientes = new ArrayList<>();//guardo los "clientes" de la cuidad que viene por parametro.
        Set<Long> claves = mapaCliente.keySet(); // se guardan todos los telefonos.
        Iterator it = claves.iterator();
        Cliente clie;
        while(it.hasNext()){  //recorro los telefonos 
            long tell = (Long)it.next();
            clie = mapaCliente.get(tell); //obtengo el cliente a partir de una clave. (de tipo telefono)
            if (clie.getCiudad().equals(ciu)){ //pregunto si las cuidades son iguales
               clientes.add(clie); //los agrego a la lista "clientes"
            }  
        }
        return clientes; //retorno la lista de mis clietes de la ciudad que consultamos.
        
    }

    public void borrarCliente(long tel) {
        if (mapaCliente.remove(tel) != null){
            JOptionPane.showMessageDialog(null,"Cliente Borrado");
        } else {
            JOptionPane.showMessageDialog(null,"El cliente no existe");
        }
    }
}
