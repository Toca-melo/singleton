import java.util.ArrayList;
import java.util.List;

public class Singleton {
    private List<String> marcaDeCarro;
    public static Singleton singleton;


    private Singleton(){
        marcaDeCarro = new ArrayList<>();
        marcaDeCarro.add ("audi");
        marcaDeCarro.add ("mercedes");
        marcaDeCarro.add ("renault");

    }



    public static synchronized Singleton getConfigurador(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
    
    public List<String> getMarcaDeCarros(){
        return marcaDeCarro;
    }

}