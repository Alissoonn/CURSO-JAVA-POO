package primeiroprograma;

public class EstrutuRepeticao {
    public static void main(String[] args) {

//-------------------------------------ESTRUTURA WHILE------------------------------------------------------
       /*
        int cc = 1;
        while (cc < 12) { //Executa o bloco enquanto a condição for verdadeira
            cc = cc + 1;
        if (cc==7){
            break;
        }
            System.out.println("Cambalhota " + cc);
        }
        */

//-------------------------------------ESTRUTURA DO------------------------------------------------------
      /*
        int cc = 0;
        do {
            System.out.println(cc); //Código executa pelo menos uma vez, mesmo com a condição retorne falsa
            cc++;
        }while (cc <= 5);
---------------------------------------------------------------------------------------------------------------
        int x = 10;
        do {
           System.out.println("Executou"); //Código executa pelo menos uma vez, mesmo com a condição retorne falsa
        } while (x < 5);

       */
//-------------------------------------ESTRUTURA FOR------------------------------------------------------

        for(int cc = 100; cc >= 1; cc-=10){//no FOR a declaração da variavel deve ser dentro do laço
            System.out.println(cc);// quase mesma coisa do WHILE mas deve ser feito quando sabe quantas repetições ira fazer
        }


  }
}