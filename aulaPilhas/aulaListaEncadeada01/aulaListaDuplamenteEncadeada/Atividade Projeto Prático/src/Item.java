public class Item {
    
    private String nome;
    private double ultimolance;

    public Item(String nome){
        this.nome = nome;
        this.ultimolance = 0.0;
    }

    public void setultimolance(double valor){
        this.ultimolance = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getUltimolance() {
        return ultimolance;
    }
    


}
