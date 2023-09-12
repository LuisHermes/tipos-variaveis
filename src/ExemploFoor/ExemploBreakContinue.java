package ExemploFoor;

public class ExemploBreakContinue {
    public static void main(String[] args) {
        
            for (int numero = 1; numero <=5; numero ++){
                if (numero ==3)
                    continue;

                    System.out.println(numero);
            }
    }
}
// dessa forma com o continue; nao imprime
// se fosse o break; parava no 3