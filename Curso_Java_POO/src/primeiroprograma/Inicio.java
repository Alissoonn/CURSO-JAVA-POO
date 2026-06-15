package primeiroprograma;
import java.util.Date;
import java.util.Scanner;

public class Inicio {
    public static void main(String[] args) {
//-------------------------------OPERADOR TERNARIO/COMPARAÇÃO-------------------------------------------------------------
        /*int n1,n2,r;
        n1 = 4;
        n2 = 5;
        r = (n1>n2)?1:2;//N1 é maior que N2? se for SIM(?) R vira 1 SENAO(:) R vira 2
        System.out.println(r);
         */

       /* int x,y,z;
        x = 4;
        y = 7;
        z = 12;
        boolean  r ;
        r = (x < y ^ y == z)?true:false;
        System.out.println(r);
        */
//----------------------------Exercício 1 - Número Positivo ou Negativo -----------------------------------------
/*
        Scanner number=new Scanner(System.in);
        System.out.println("Digite um numero e irei dizer se é POSITIVO ou NEGATIVO: ");
        int n1 = number.nextInt();
        String resultado = (n1 % 2 ==0)?"Positivo":"Negativo";
        System.out.println(resultado);
 */

 //----------------------------Exercício 2 - Número Par ou Ímpar -----------------------------------------
        /*
        System.out.println("Digite um numero e irei dizer se é PAR ou IMPAR");
        Scanner number = new Scanner(System.in);
        int n1 = number.nextInt();
        String resultado = (n1 % 2 ==0)?"Par":"Impar";
        System.out.println("O número é " + resultado);
        */
//----------------------------Exercício 3 - Maior Número----------------------------------------------------------------
        /*
        System.out.print("Digite um numero: ");
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        System.out.print("Digite outro numero: ");
        int n2 = sc.nextInt();
        int maior = (n1>n2)?n1:n2;
        System.out.println("O maior numero é: " + maior);
*/
//----------------------------Exercício 4 - Média de Notas----------------------------------------------------------------
        /*
        Scanner nota = new Scanner(System.in);
        System.out.println("Digite sua primeira nota:  ");
        float nota1 = nota.nextFloat();
        System.out.println("Digite sua segunda nota:  ");
        float nota2 = nota.nextFloat();
        float media = (nota1 + nota2) / 2;

        System.out.println("Sua média é: " + media);
        if(media >= 7 )
        {;
            System.out.println("Aprovado");
        }else if(media >= 5)
        {
            System.out.println("Recuperação");
        }
        else
        {
            System.out.println("Reprovado");
        }
        */

//----------------------------Exercício 5 - Operador Ternário-------------------------------------------------------------------------

        /*
        Scanner voto = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = voto.nextInt();
        String pd = (idade >= 18)?"Pode votar":"Não pode votar";
        System.out.println(pd);
        */

        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;
        System.out.println(v0 );


    }

    }

