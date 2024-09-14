import java.util.ArrayList;

public class ListaDeClientes {
    public static ArrayList<Cliente> clientes = new ArrayList<>();

    public static void adicionarCliente(int id){
        clientes.add(new Cliente(id));
    }

    public static Cliente procurarClientePorId(int id){
        for(int i=0; i<clientes.size();i++){
            if(clientes.get(i).getid() == id){
                return clientes.get(i);
            }
        }
        return null;
    }

    public static void adicionarItemAoCliente(int id,Item item){
        for(int i=0; i<clientes.size();i++){
            if(clientes.get(i).getid() == id){
                clientes.get(i).addItensComprados(item);
            }
        }
    }





}
