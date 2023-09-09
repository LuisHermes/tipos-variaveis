import javax.print.DocFlavor.STRING;

public class TiposVariaveis {

    public static void main(String[] args) throws Exception {
        
            String meuNome = "Luis";

            double salarioMinino = 2500; //2.500 reais 

            short numeroCurto = 1;
            int numeroNormal = numeroCurto;
            short numeroCurto2 = (short) numeroNormal;

            int numero = 5;

            numero = 10;

            System.out.println(numero);
            System.out.println(meuNome);
    }
}
