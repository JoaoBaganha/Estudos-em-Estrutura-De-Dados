import java.util.HashMap;

public class App {
    public static void main(String[] args) throws Exception {
    
        HashMap<String, Double> tabela = new HashMap<>();

        tabela.put("Pera", 3.50);
        tabela.put("Uva", 4.0);
        tabela.put("Maçã", 5.0);
        tabela.put("Salada-Mista", 16.0);

        System.out.println(tabela.toString());

        System.out.println(tabela.get("Maçã"));






    }
}
