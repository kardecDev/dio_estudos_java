package edu.kardev.etapa.sintaxe;

public class MinhaClasse {
    public static void main(String[] args) {
        //entrada de dados
        String primeiroNome = "Allan";
        String SegundoNome = "Alves";
        //processamento (regra de negocio)
        String nomeCompleto = nomeCompleto(primeiroNome, SegundoNome);
        //saida
        System.out.println(nomeCompleto);

    }
    public static String nomeCompleto (String primeiroNome, String segundoNome){
        
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}

