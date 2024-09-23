import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        float media = 0;

        int tamanhoArrei = 4;
        float[] notas = new float[tamanhoArrei];

        System.out.println("Informe a frequência do aluno: ");
        int freq = leia.nextInt();

        for(int n = 0;n < tamanhoArrei;n++){
            System.out.println("Digite a nota: ");
            float n1 = leia.nextFloat();
            notas[n] = n1;
            media += n1;
        }
        media = media/4;
        boletim(media,freq,notas);
    }
    public static void boletim (float media,int freq,float[] notas){
        if (freq > 74 && media > 6 && media < 11){
            System.out.println("Aluno aprovado com uma frequência de "+freq+" e as notas "+notas[0]+", "+notas[1]+", "+notas[2]+", "+notas[3]+" dando uma media de "+media);
        }else if (freq > 74 && media < 7 && media > 4){
                   System.out.println("Aluno de recuperação");
        }else if(freq > 74 && media < 5 && media > -1){
            System.out.println("Aluno retido");
        }else{
            System.out.println("Insira uma nota valida");
        }
    }
}
