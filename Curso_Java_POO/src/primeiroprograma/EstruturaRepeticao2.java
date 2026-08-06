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
*/
//-------------------------------------------------------------------------------------------------------------------------

        /*
        Exercício 11
        Leia 5 notas.
        Calcule a média.


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite as 5 notas");

        float[]notas  = new float[5];//Vetor com 5 números
        float soma = 0;//variavel responsavel por armazenar todos os valores


        for (int i=0; i<5 ; i++){//laço para perguntar 5x
            notas[i]= sc.nextFloat();// Guarda o valor lido na posição 'i'
            soma += notas[i];//Acumula a soma (soma = soma + notas[i])
        }
        float media = soma/5;//variavel media pega o valor da SOMA e divide por 5
        if(media >7){
            System.out.println("Parabens APROVADO");
        } else if (media >=5 ) {
            System.out.println("Esta de RECUPERAÇÃO");
        }else {
            System.out.println("REPROVADO");
        }
*/
//--------------------------------------------------------------------------------------------------------

        /*
        Exercício 12
        Leia 10 idades.
        Informe:
        maior idade
        menor idade


        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade");
        int [] idade = new int[10];

        for (int i = 0; i < 10; i++) {
            idade[i] = sc.nextInt();
            System.out.println("Sua idade é: " + idade[i]);

            //As vezes o IF fica dentro da condição mesmo, normal
            if (idade[i] >= 18){//Enquanto o valor de idade(que foi pro "i")for menor que 17
                System.out.println("MAIOR DE IDADE");
            }else {
                System.out.println("MENOR DE IDADE");
            }
        }
        */
 //---------------------------------------------------------------------------------------------------------------
        /*
                                    🔵 Nível 4 — While
            Exercício 13
            Crie um programa que mostre na tela os números de 1 até 10 utilizando apenas o while.
            Saída esperada:
            1
            2
            3
            4
            5
            6
            7
            8
            9
            10



        int i = 0;
        while(i<=10){
            System.out.println(i);
            i++;
        }
         */
//-------------------------------------------------------------------------------------------------------------------
        /*
        Exercício 2 – Contagem regressiva ⭐
        Mostre os números de 10 até 1 utilizando while.
        Saída esperada:
        10
        9
        8
        7
        6
        5
        4
        3
        2
        1


        int i = 10;
        while(i>0){
            System.out.println(i);
            i--;
        }
*/
//---------------------------------------------------------------------------------------------------------------------
        /*
        Exercício 3 – Números pares ⭐⭐
        Mostre apenas os números pares de 0 até 20 usando while.
        Saída esperada:
        0
        2
        4
        6
        8
        10
        12
        14
        16
        18
        20


        int n1 =0;
        while(n1<20){
            n1+=2;
            System.out.println(n1);
        }
        */
//----------------------------------------------------------------------------------------------------------------------

                

    }
}
