package primeiroprograma;
import java.util.Scanner;

public class EstruturaCondicional2 {
    public static void main(String[] args) {
        /*
        🟢 NIVEL 1 – if
        Exercício 1 - Leia um número inteiro.
        Se ele for positivo, imprima:
        Número positivo */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número: ");
        int n1 = sc.nextInt();
        System.out.println("Numero digitado foi: "+n1);

        if(n1 > 0 ){
            System.out.println("Numero Positivo");
        }else {
            System.out.println("Numero Negativo");
        }*/
//--------------------------------------------------------------------------------------------------------------------
        /*
        Exercício 2 - Leia a idade de uma pessoa.
        Se ela tiver 18 anos ou mais, imprima:
        Maior de idade      */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sua idade? ");
        int idade = sc.nextInt();

        if(idade >= 18){
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Menor de idade");
        }*/
//--------------------------------------------------------------------------------------------------------------
        /*
        Exercício 3 - Leia um número.
        Se ele for igual a zero, imprima:
        O número é zero                 */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número ");
        float n1 = sc.nextFloat();

        if(n1 == 0 ){
            System.out.println("O número é zero");
        }else{
            System.out.println("O numero não é zero");
        }
        */
//--------------------------------------------------------------------------------------------------------------
        /*
        🟡 Nível 2 – if + else
        Exercício 4
        Leia um número.
        Informe se ele é:
        Positivo
        Negativo
        */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite qualquer número: ");
        float n1 = sc.nextFloat();

        if(n1 > 0){
            System.out.println("Número positivo");
        }else {
            System.out.println("Numero negativo");
        }*/
//---------------------------------------------------------------------------------------------------------

        /*
        Exercício 5
        Leia uma nota.
        Se a nota for maior ou igual a 7:
        Aprovado
        Caso contrário:
        Reprovado
        */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a nota do aluno? ");
        int nota = sc.nextInt();

        if(nota >= 7){
            System.out.println("Aprovado");
        }else{
            System.out.println("Reprovado");
        }
         */
//--------------------------------------------------------------------------------------------------------------

        /*
        Exercício 6
        Leia dois números.
        Informe qual deles é o maior.*/

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeiro numero: ");
        int primeiro = sc.nextInt();
        System.out.println("Segundo numero: ");
        int segundo = sc.nextInt();

        if(primeiro > segundo){
            System.out.println("Número "+primeiro+" é maior");
        }else{
            System.out.println("Número "+segundo+" é maior");
        }
         */
//-------------------------------------------------------------------------------------------------------------

        /*
        🟠 Nível 3 – else if
        Exercício 7
        Leia uma nota.
        Mostre:
        Nota >= 9
        Excelente
        Nota >= 7
        Bom
        Nota >= 5
        Recuperação
        Menor que 5
        Reprovado
         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual a sua nota? ");
        int nota = sc.nextInt();
        if (nota >=9){
            System.out.println("Excelente");
        }else if(nota >= 7){
            System.out.println("Bom");
        }else if (nota >= 5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
        */
//-------------------------------------------------------------------------------------------------------------

        /*
        Exercício 8
        Leia a idade.
        Informe a categoria:
        Criança (até 12 anos)
        Adolescente (13 a 17)
        Adulto (18 a 59)
        Idoso (60 ou mais)
         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = sc.nextInt();

        if(idade <=12){
            System.out.println("CRIANÇA");
        }else if(idade <=17){
            System.out.println("ADOLESCENTE");
        }else if(idade >=18 && idade <=59){
            System.out.println("ADULTO");
        }else if(idade >=60){
            System.out.println("IDOSO");
        }
        */
//--------------------------------------------------------------------------------------------------------

        /*
        🔵 Nível 4 – Operadores lógicos
        Exercício 9
        Leia:
        idade
        possui carteira de motorista (true ou false)
        Informe se a pessoa pode dirigir.
        Dica: use o operador &&.
         */

        /*
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual sua idade? ");
        int idade = sc.nextInt();
        System.out.println("Possui carteira de motorista? ");
        boolean motorista = sc.nextBoolean();

        if(idade >= 18 && motorista == true){
            System.out.println("Você pode dirigir");
        } else{
            System.out.println("Não pode dirigir");
        }
        */
//-----------------------------------------------------------------------------------------------------------------------------

        /*
        Exercício 10
        Leia um ano.
        Verifique se ele é bissexto.
        Dica: um ano é bissexto se:
        é divisível por 4 e não por 100, ou
        é divisível por 400.
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Em que ano estamos? ");
        int ano = sc.nextInt();

        if(ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0){
            System.out.println("Ano bissexto");
        }else{
            System.out.println("Não é bissexto");
        }
    }
}
