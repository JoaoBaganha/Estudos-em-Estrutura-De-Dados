public class Cliente{

    private int id;
    private Pilha itensComprados;


    public Cliente(int id){
        this.id = id;
        this.itensComprados = new Pilha();
    }

    public void darlance(double valor){
        Edital.adicionarLance(this.id, valor);
    }

    public void addItensComprados(Item item){
        this.itensComprados.push(item);
    }

    public int getid(){
        return id;
    }

}