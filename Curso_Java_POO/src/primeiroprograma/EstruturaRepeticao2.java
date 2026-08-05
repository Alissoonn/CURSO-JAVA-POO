package primeiroprograma;
import java.util.Scanner;

public class EstruturaRepeticao2 {
    public static void main(String[] args) {
        /*
                                                🟢 NIVEL 1 - CONHECENDO O FOR
        Exercício 1
        Mostre os números de:
        1 até 10
         */

        /*
        for (int i = 1; i <= 10; i++)
        {
            System.out.println(i);
        }
         */
//--------------------------------------------------------------------------------------------------------------------
        /*
        Exercício 2
        Mostre os números:
        10 até 1
         */

        /*
        for(int i = 10; i>=1; i--)
        {
            System.out.println(i);
        }
        */
//--------------------------------------------------------------------------------------------------------------------
        /*
        Exercício 3
        Mostre apenas os números pares de:
        0 até 20
         */

        /*
        for(int i =0; i<=20; i++)
        {
            if (i%2==0)
            {
                System.out.println(i);
            }
        }
        */
//--------------------------------------------------------------------------------------------------------------------

        /*
            Exercício 4
            Mostre apenas os números ímpares entre:
            1 e 30

        for (int i = 0; i<=30; i++) {
            if(i % 2 != 0 ){
                System.out.println(i);
            }
        }
         */
//---------------------------------------------------------------------------------------------------------------------
/*
        Exercício 5
        Mostre a tabuada do número 7.
        Resultado esperado:
        7 x 1 = 7
        7 x 2 = 14
        7 x 10 = 70

        for (int i = 1; i<=10;i++) {
            System.out.println("7 x "+i+ " = "+i*7);
        }
        */
//---------------------------------------------------------------------------------------------------------------------

                                 //🟡 NIVEL 2 - UTILIZANDO O SCANNER
/*
        Exercício 6
        Leia um número
        Mostre a tabuada dele.
        Exemplo:
        Digite:
        8
        Saída:
        8 x 1 = 8
        8 x 2 =16

        Scanner sc = new Scanner(System.in);
       System.out.println("Qual a tabuada?");
        int tb = sc.nextInt();

        for (int i = 1; i <= 20453; i++) {
            System.out.println(tb+" X "+i+" = "+i*tb);
        }
*/
//----------------------------------------------------------------------------------------------------------------------

        /*
        Exercício 7
        Leia um número.
        Mostre todos os números de 1 até esse número.
        Exemplo:
        Digite:
        12
        Resultado:
        1,2,3...12


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero: ");
        int numero = sc.nextInt();

        for(int i = 0;i<=numero;i++ ){
            System.out.println("Numeros abaixo "+i);
        }
        */
//----------------------------------------------------------------------------------------------------------------------

        /*
        Exercício 8
        Leia um número.
        Calcule a soma de:
        1 +2 +3 +...+N
        Exemplo:
        Digite:
        5
        Resultado:
        15
        Porque:
        1+2+3+4+5

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um numero:");
        int numero = sc.nextInt();

        int soma = 0;
        for (int i = 1; i <= numero; i++) {
            soma = soma + i;
        }
        System.out.println("Resultado: " + soma);
        */
//---------------------------------------------------------------------------------------------------------------------

                      //  🟠 Nível 3 — Condicionais + Repetição
/*
        Exercício 9
        Leia 10 números.
        Conte quantos são positivos.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 numeros");
        int[] numeros = new int[10];
        int positivos =0;// Variável contador para armazenar a quantidade de positivos

        for(int i = 0; i <10; i++){//Numero de vezes que o laço vai rodar
            numeros[i] = sc.nextInt(); // Guarda o valor lido na posição 'i'

            if (numeros[i] > 0){
                System.out.println("POSITIVO");
                positivos++;
            }else if (numeros[i] == 0) {
                System.out.println("ZERO");
            }else {
                System.out.println("NEGATIVO");
            }
        }
        System.out.println("\nTotal de números positivos: " + positivos);
        //Ao final da chave para nao retornar no terminal junto com a função
*/
//----------------------------------------------------------------------------------------------------------------------

        /*
        Exercício 10
        Leia 10 números.Conte:
        positivos,negativos,zeros
*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 números");
        int[] numeros = new int[10];
        int positivos = 0;
        int negativos = 0;
        int zero = 0;


        for(int i = 0; i <10; i++){//Numero de vezes que o laço vai rodar
            numeros[i] = sc.nextInt(); // Guarda o valor lido na posição 'i'

            if (numeros[i] > 0){
                positivos++;
                System.out.println("Numero positivo");
            }else if (numeros[i] < 0){
                negativos++;
                System.out.println("Numero negativo");
            }else {
                zero++;
                System.out.println("Zero");
            }
        }
        System.out.println("Temos "+positivos+" POSITIVOS");
        System.out.println("Temos "+negativos+" NEGATIVOS");
        System.out.println("Temos "+zero+" ZERO");





    }
}
