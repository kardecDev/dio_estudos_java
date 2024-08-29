package edu.kardev.etapa.sintaxe;

public class TiposVariaveis {
    public static void main(String[] args) {
        //Variavel do tipo double
        double salarioMinimo = 1412.10;
        //Variavel do tipo short
        short numeroCurto = 1;
        // Ao declarar uma variavel do tipo float, quando for atribuir o 
        // seu valor é necessario informar um f após o valor
        float pi =3.14f;
        //Variavel tipo int recebendo um tipo short
        int numeroNormal = numeroCurto;
        //Variavel tipo short recebendo uma tipo int, não funciona
        //Neste caso é necessário utilizar o recurso de cast entre tipos de dados diferentes 
        short numeroCurto2 = (short)numeroNormal;
        
        //Alterando um valor declarado em uma variável
        int numero = 5;
        System.out.println(numero);
        numero = 10;
        //Para definir constantes é necessário  usar caixa alta e a a instrução final no inicio da declaração
        final double VALOR_DE_PI = 3.14;
        
        System.out.println(salarioMinimo);
        System.out.println(numeroCurto2);
        System.out.println(numeroNormal);
        System.out.println(pi);
        System.out.println(numero);
        System.out.println(VALOR_DE_PI);

    }
    
}
