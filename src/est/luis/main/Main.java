package est.luis.main;
import java.util.Scanner;
import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;


public class Main{       
    
    // Método que retorna um valor de salário pretendido para os candidatos:
    public static double valor_de_salario_pretendido(){
        double salario_pretendido = ThreadLocalRandom.current().nextDouble(1800, 2200);
        return salario_pretendido; 
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in).useLocale(Locale.US);

        // Criando array com lista de candidatos:
        String candidatos[] = {"Luis", "Sarine", "Pedro", "João", "Acleucia", "Margarida", "Auricélia", "Flamar", "Maria do Carmo", "Sebastiana"};

        // Criando um array que armazena os valores de salários pretendidos de cada candidato:
        double salarios_pretendidos_dos_usuarios[] = new double[10];
        
        // Atribuindo valores de salários pretendidos para o array:
        for(int i = 0; i < candidatos.length; i++){
            salarios_pretendidos_dos_usuarios[i] = valor_de_salario_pretendido();
        }

        // Printando os usuários que querem salários menores ou iguais ao salario base:
        // Estes valores foram obtidos randomicamente.
        System.out.println("\nCandidatos selecionados para a intrevista");
        
        for(int i= 0; i < candidatos.length; i++){
            // Foi criada uma variável para controlar os valores informados em somente 5;
            int quantidade_de_candidatos_selecionados = 0;

            if(quantidade_de_candidatos_selecionados < 5){
                if(salarios_pretendidos_dos_usuarios[i] <= 2000){
                    System.out.println("\n" + candidatos[i]);
                    quantidade_de_candidatos_selecionados++;
                }   
            }

        }

        input.close();
    }

}


























