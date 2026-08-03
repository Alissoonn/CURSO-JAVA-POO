package primeiroprograma;
import java.util.Scanner;


public class EstrutuCondicional {
    public static void main(String[] args) {
//-------------------------------Media de notas------------------------------------------
        /*
        Scanner teclado = new Scanner(System.in); //teclado é o nome da variavel que armazena o objeto SCANNER
        System.out.println("Digite o primeiro valor: ");
        float n1 = teclado.nextFloat(); //teclado.nextFloat() converte o valor digitado para Float
        System.out.println("Digite o segundo valor: ");
        float n2 = teclado.nextFloat();
        float media = (n1 + n2) / 2;
        System.out.println("Media: " + media);

        if (media >= 7) {
            System.out.println("Você foi aprovado");
        } else if (media >= 5) {
            System.out.println("Esta de recuperação");
        } else {
            System.out.println("Esta reprovado");
        }
    }
}
*/
//-------------------------------Maior/Menor de idade------------------------------------------
/*
        System.out.println("Em que ano voce nasceu?");
        Scanner teclado = new Scanner(System.in);
        int nasci = teclado.nextInt();
        int ano = 2026;
        int idade = ano - nasci;
        System.out.println("Sua idade é: " + idade);

        if (ano - nasci >= 18) {
            System.out.println("Voce ja é maior de idade");
        } else {
            System.out.println("Voce é menor de idade");
        }
    }
}
*/
//-------------------------------Pode ou nao votar------------------------------------------


        System.out.println("Digite seu ano de nascimento: ");
        Scanner teclado  = new Scanner(System.in);
        int nasci =  teclado.nextInt();
        int idade = 2026 - nasci;

        if(idade < 16){
            System.out.println("Não vota");
        } else if (idade >= 16 && idade < 18 || idade > 70){
            System.out.println("Voto opcional");
        }else{
            System.out.println("Voto obrigatório");
        }
    }
}