public class Edital {
    
    private static Fila itensLeilao = new Fila();

    public static void adicionarItemLeilao(Item item){
        itensLeilao.push(item);
    }

    public static void removerItemLeilao(){
        itensLeilao.pop();
    }

    public static void passarProxItem(){
        int idDoComprador = Sessao.getIdComprador();
        ListaDeClientes.adicionarItemAoCliente(idDoComprador, itensLeilao.tail.data);
        itensLeilao.pop();
    }

    public static void adicionarLance(int id,double valor){
        if(itensLeilao.tail.data.getUltimolance()>=valor){
            System.out.println("Valor inferior ao lance atual.");
        }else{
            itensLeilao.tail.data.setultimolance(valor);
            Sessao.addIdentificador(id);
            System.out.println("Lance adicionado com sucesso!");
        }
    }
}
