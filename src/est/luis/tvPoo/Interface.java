package est.luis.tvPoo;

public class Interface {

    // Criando método main para interações:
    public static void main(String[] args){

        // Criando instância da classe:
        Tv tvDoNenem = new Tv();
        
        // Campo onde faço as interações com os métodos:
        tvDoNenem.ligarTv();
        tvDoNenem.aumentarVolume();
        tvDoNenem.subirCanal();
        tvDoNenem.escolherCanal(12);
        tvDoNenem.aumentarVolume();
        // 

        // Interação de ligar e desligar tv:
        // Criando uma string que recebe o texto 'ligada' ou 'desligada' apartir do estado da tv:
        String estado_atual_da_tv = tvDoNenem.estado_da_tv == false ? "desligada" : "ligada";
        
        // Printando informações:
        System.out.print("\nA tv atualmente esta -> " + estado_atual_da_tv);
        System.out.print("\nCanal atual -> " + tvDoNenem.canal_atual);
        System.out.print("\nVolume atual -> " + tvDoNenem.volume_atual);

    }
}
