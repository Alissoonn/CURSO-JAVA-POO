package primeiroprograma;

public class Operacoes {
    public static String contador(int i,int f){//Metodo para retornar uma STRING
        String resultado="";
        for(int cont = i; cont <= f; cont++){
            resultado+= cont + " ";//Aqui "resultado" recebe ele mesmo concatenado com o valor do contador
        }
        return resultado;
    }
}
