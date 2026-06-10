package primeiroprograma;
import java.util.Scanner;

public class TiposprimiManipudeDados {
    public static void main(String[] args) {

/*      String nome = "Alisson";
        float nota = 8.5f;
        System.out.println("Sua nota é " + nota);//com valor Float
        System.out.printf("Parabens %s , sua nota é %.2f " ,nome, nota);//retorna o tipo de dado referenciando pela %
*/
//-------------------------------------ENTRADA DE DADOS STRING VIA TECLADO------------------------------------------------------------------------------------
/*      Scanner teclado = new Scanner(System.in);//System.in serve para monitorar a entrada feita no scanner(teclado)
        System.out.print("Digite o nome do aluno: ");
        String nome = teclado.nextLine();//para digitar uma linha de texto
        System.out.print("Digite a nota do aluno: ");
        float  nota = teclado.nextFloat();//para digitar um numero com ponto
        System.out.println(("O aluno " + nome+" tirou " + nota+ " na prova"));
*/
//------------------------ENTRADA DE DADOS FLOAT VIA TECLADO------------------------------------------------
        /*
        Scanner teclnume = new Scanner(System.in);//System.in serve para monitorar a entrada feita no scanner(teclado)
        System.out.print("Digite o primeiro valor: ");
        float primeValor = teclnume.nextFloat();
        System.out.print("Digite o segundo valor: ");
        float segundoValor = teclnume.nextFloat();
        var total = primeValor + segundoValor;
        System.out.println("A soma de ambos números são: " + total);
        */
//-------------------------ENTRADA DE DADOS COM FUNÇÃO SOMA-------------------------------------------------------------

        Scanner calculadora = new Scanner(System.in);
        var Anoatual = 2026;
        System.out.println("Em que ano você nasceu? ");
        int AnoNascimento = calculadora.nextInt();
        var Idade = Anoatual -  AnoNascimento;
        System.out.println("Sua idade é: " + Idade);

    }
}
