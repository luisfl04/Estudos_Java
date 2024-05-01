package est.luis.tvPoo;


public class Tv {

    public boolean estado_da_tv = false;
    public int canal_atual = 10;
    public int volume_atual = 15;

    // Criando método que liga a tv:
    public void ligarTv(){
        estado_da_tv = true;
    }

    // Método que desliga a tv:
    public void desligarTv(){
        estado_da_tv = false;
    }

    // método de aumenta o volume:
    public void aumentarVolume(){
        volume_atual++;
    }

    // Método que reduz volume:
    public void diminuirVolume(){
        volume_atual--;
    }

    // método que sobe um canal:
    public void subirCanal(){
        canal_atual++;
    }

    // método que reduz um canal:
    public void reduzirCanal(){
        canal_atual--;
    }

    // Método que insere o canal apartir do valor de parâmetro:
    public void escolherCanal(int canal_escolhido){
        canal_atual = canal_escolhido;
    }
}