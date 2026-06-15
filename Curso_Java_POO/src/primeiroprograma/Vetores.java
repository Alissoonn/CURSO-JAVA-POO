package primeiroprograma;
import java.util.Arrays;

public class Vetores {
    public static void main(String[] args) {

//------------------------------------VETOR PADRAO----------------------------------------------------------------------------

       /* int n[] = {2,4,5,6,32,1};//Declaração de vetor ja com o valor definido na posição
        for(int c=0; c<=5; c++){
 //Aqui iremos mostrar o N na posição C no FOR, para as 6 posições do FOR existe um valor em N para ser mostrado através do C
 //o C exibe o N de acordo com sua posição rodada no FOR

            System.out.println("Na posição " +c+ " temos o valor " +n[c]);
        }
*/

//-----------------------------------VETOR COM FOR IT--------------------------------------------------------------------------
/*
    double v[] = {3.5,2.75,9, -4.5};
        Arrays.sort(v);//Serve para exibir os itens do vetor em ordem
    for(double valor: v){ //Para cada elemento de V, coloque dentro de VALOR, todos os itens de vetor foram para dentro de VALOR
        System.out.println("Os valores inseridos do vetor V são: " + valor);
    }
*/

   int i[] = new int[20]; //Vetor i com 20 posições
    Arrays.fill(i,0);// Essa função preenche todos os espaços em "i" com valor zero
        for(int valor:i){
            System.out.print(" " +valor);
        }

    }
}
