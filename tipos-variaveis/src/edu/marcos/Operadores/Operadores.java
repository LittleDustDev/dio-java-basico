package edu.marcos.Operadores;
import java.util.Date;

public class Operadores {

    public static void main(String[] args) {

    //Operadores de atribuição
    String nome = "GLEYSON";
    int idade = 22;
    double peso = 68.5;
    char sexo = 'M';
    boolean doadorOrgao = false;
    Date dataNascimento = new Date();

    System.out.println(nome + ", " + idade + ", " + peso + ", " + sexo + ", " + doadorOrgao + ", " + dataNascimento);

    //Operadores aritméticos
    double soma = 10.5 + 15.7;
    int subtracao = 113 - 25;
    int multiplicacao = 20 * 7;
    int divisao = 15 / 3;
    int modulo = 18 % 3;
    double resultado = (10 * 7) + (20/4); 

    System.out.println(soma + ", " + subtracao + ", " + multiplicacao + ", " + divisao + ", " + modulo + ", " + resultado);

    //Caso o + seja usado em variáveis de texto ele realizará a concatenação e não a soma
    String nomeCompleto = "LINGUAGEM" + "JAVA";

    System.out.println(nomeCompleto);

    //Operadores unários
    int numero = 5;
		//Imprimindo o numero negativo
        System.out.println(- numero);

        //Incrementando numero em mais 1 numero, imprime 6
        numero ++;
        System.out.println(numero);

        //Incrementando numero em mais 1 numero, imprime 7
        System.out.println(numero ++);//Como o ++ está depois da variável, ele só aumentará na próxima impressão, pois a soma executará após a impressão da variável

        System.out.println(numero);//Agora sim, numero virou 7

        //Ordem de precedencia conta aqui, neste caso ele imprimirá 8, já somando pois o ++ está antes
        System.out.println(++ numero);

        boolean verdadeiro = true;

        System.out.println("Inverteu " + !verdadeiro);

    //Operadores ternários
    int a, b;

    a = 5;
    b = 6;
    String resultado2;

        //EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
            resultado2 = "verdadeiro";
                else
            resultado2 = "falso";

        System.out.println(resultado2);

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado3 = (a==b) ? "verdadeiro" : "false";

        System.out.println(resultado3);

    //Operadores relacionais
    int numero1 = 1;
    int numero2 = 2;

        if(numero1 > numero2)
	        System.out.print("Numero 1 maior que numero 2 \n");

        if(numero1 < numero2)
	        System.out.print("Numero 1 menor que numero 2 \n");

        if(numero1 >= numero2)
	        System.out.print("Numero 1 maior ou igual que numero 2 \n");

        if(numero1 <= numero2)
	        System.out.print("Numero 1 menor ou igual que numero 2 \n");

        if(numero1 != numero2)
	        System.out.print("Numero 1 é diferente de numero 2 \n");

    String nome1 = "JAVA";
    String nome2 = "JAVA";
            
    System.out.println(nome1 == nome2); //true
    
    String nome3 = new String("JAVA");
            
    System.out.println(nome1 == nome3); //false, pois ele analisa se as variáveis são a mesma, e como é uma nova string, mesmo tendo o mesmo conteúdo, não é a mesma
    
    String nome4 = nome3;
    
    System.out.println(nome3 == nome4); //true, neste caso a variávei 4 recebeu a variável 3 portanto é a mesma
            
        //Equals para verificar o CONTEÚDO das variáveis
        System.out.println(nome1.equals(nome2)); //true
        System.out.println(nome2.equals(nome3)); //true
        System.out.println(nome3.equals(nome4)); //true
    
    // Operadores lógicos
    boolean condicao1=true;

    boolean condicao2=false;

    /* Aqui estamos utilizando o operador lógico E para fazer a união de duas expressões. 
    É como se estivesse escrito:
    "Se Condicao1 e Condicao2 forem verdadeiras, executar código"
    */

    if(condicao1 && condicao2)
	    System.out.print("Os dois valores são verdadeiros");;

    //Se condicao1 OU condicao2 for verdadeira, executar código.
    if(condicao1 || condicao2)
	    System.out.print("Um dos valores é verdadeiro");
    }

}
