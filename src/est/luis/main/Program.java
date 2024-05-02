package est.luis.main;


public class Program{    

    public static void main(String[] args){
        
        Som teste = new Program().new Aguia();
        teste.reproduzirSom("UAAAAAAAA");
    }    
    
    public abstract class Som {
    
        public abstract void reproduzirSom(String texto);
    
    }
    
    public class Aguia extends Som{

        @Override
        public void reproduzirSom(String texto){
            System.out.println(texto);
        }

    } 
    
}


