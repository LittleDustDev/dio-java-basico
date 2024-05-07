package edu.marcos.Variaveis_E_Constantes;

public class Variaveis_E_Constantes {
    public static void main(String[] args) throws Exception {

        int idade; //Tipo "int", nome "idade", com nenhum valor atribuído. 
        int anoFabricacao = 2021; //Tipo "int", nome "anoFabricacao", com valor 2021.
        double salarioMinimo = 2500.00; //Tipo "double", nome "salarioMinimo", valor 2.500,00.

        byte idadeByte = 123;
		short ano = 2021;
		int cep = 21070333; //Se começar com zero, talvez tenha que ser do tipo String
		long cpf = 98765432109L; //Se começar com zero, talvez tenha que ser do tipo String
		float pi = 3.14F;
		double salario = 1275.33;

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal; //Foi necessário o uso de um "cast" para que valor não gerasse uma incoerência ao atribuir um int a um short

        /*
		 * ao usar a palavra reservada final, você determina que jamais
		 * esta variavel poderá obter outro valor;
		 * isso é considerado uma CONSTANTE na linguagem Java
		 */
		final double VALOR_DE_PI = 3.14;
        
    }
}
