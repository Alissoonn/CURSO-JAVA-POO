package primeiroprograma;

public class MetodosProcedimentos {


    public static void main(String[] args) {//O METODO MAIN sempre sera o primeiro a ser executado
     //   System.out.println("Começou o programa");
     //    soma(5,2);//Aqui a MAIN executa o metodo SOMA, que é responsavel por fazer a soma de dois valores(a,b)
                        //Todos os metodos devem ser criados fora da main e somente chamados para serem executados por ela


        System.out.println("Vai começar a contagem");
        //Assim é possivel chamar uma função de outra classe
        System.out.println(Operacoes.contador(1,5));//(1,5) são os parametros da classe Operacoes, são eles i,j
        // (chamando a classe Operacoes)

    }

//Esse metodo só é usado quando chamado na MAIN, por isso ele fica fora do escopo da MAIN
  static void soma(int a, int b){
      int s = a+b;
      System.out.println("A soma é: " + s);
  }

}
