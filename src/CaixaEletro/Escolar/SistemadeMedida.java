package CaixaEletro.Escolar;

public class SistemadeMedida {
    public static void main(String[] args) {
        // else if 
        String sigla = "M";

        if(sigla == "P")
            System.out.println("PEQUENA");
        else if(sigla == "M")
            System.out.println("MEDIO");
        else if(sigla == "G")
            System.out.println("GRANDE");
        else 
            System.out.println("INDEFINIDO");    
    }
}
