package CaixaEletro.Escolar;

public class PlanoOperadora {
    public static void main(String[] args) {
        
        String plano = "B";

        switch (plano) {
            case"T": {
                System.out.println("5GB Youtube");
               // break;
            }
            case"M": {
                System.out.println("whats e Instagram gratis");
            }
            case"B": {
                System.out.println("100 minutos de ligacao");
            }
        }
    }
}
