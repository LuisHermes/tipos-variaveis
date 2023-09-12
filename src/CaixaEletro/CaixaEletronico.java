package CaixaEletro;

import java.util.Locale;
import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner (System.in);

        System.out.println("Digite seu nome ");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome");
        String sobrenome = scanner.next();

        System.out.println("Ola , me chamo " + nome + " " + sobrenome);
        


    }
}
