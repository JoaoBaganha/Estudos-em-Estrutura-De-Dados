public class Sessao {
    private static PilhaIdentificadores identificadores = new PilhaIdentificadores();

    public static void addIdentificador(int id){
        identificadores.push(id);
    }

    public static int getIdComprador(){
        int id = identificadores.head.data;
        clear();
        return id;
    }

    private static void clear(){
        identificadores = new PilhaIdentificadores();
    }
}
