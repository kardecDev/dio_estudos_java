package edu.kardev.etapa.sintaxe;

public class Operadores {
    public static void main(String[] args) {
        //Operador de Concatenação e string +
        String nomeCompleto = "Linguagem" + "Java";
        System.out.println("Nome Completo: " + nomeCompleto);
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.err.println("Concatenação: " + concatenacao);
        concatenacao = 1+"1"+1+1;
        System.err.println("Concatenação: " + concatenacao);
        concatenacao = 1+"1"+1+"1";
        System.err.println("Concatenação: " + concatenacao);
        concatenacao = 1+1+1+"1";
        System.err.println("Concatenação: " + concatenacao);
        concatenacao = "1"+(1+1+1);
        System.err.println("Concatenação: " + concatenacao);
        
        //Operador 
        
        //(operador unário de incremento e decremento)
        //Incremento
        int numero = 5;
        System.err.println(++ numero);
        System.out.println(numero);
        System.err.println(numero ++);
        System.out.println(numero);
        //Decremento
        System.err.println(-- numero);
        System.out.println(numero);
        System.err.println(numero --);
        System.out.println(numero);

        //Operador negação
        boolean variavel = true;
        System.out.println(!variavel);
        variavel = !variavel;
        System.out.println(variavel);  

        //Operador ternario ?:
        //Estrutura de utilização
        // <Expressao Condicional> ? <Caso condição seja true> : <Caso condição seja falsa>
        int a, b;
        a = 5;
        b = 6;
        /* EXEMPLO DE CONDICIONAL UTILIZANDO ESTRUTURA IF/ELSE */
        /*
        String resultado = "";
        if (a==b)
            resultado = "Verdadeiro";
        else
            resultado = "falso";   
        */    
        String resultado = a==b ? "verdadeiro" : "falso";
        System.out.println("Resultado: " +resultado);


    }
}
