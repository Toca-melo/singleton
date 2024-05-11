import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Singleton singleton = Singleton.getConfigurador();
        List<String> listaDeCarros = singleton.getMarcaDeCarros();
        
        for (String carro: listaDeCarros){
            System.out.println(carro);
        }
    }
}
