package CaixaEletro;

import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner (System.in)) {
            System.out.println("Digite seu nome ");
            String nome = scanner.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = scanner.next();

            System.out.println("Ola , me chamo " + nome + " " + sobrenome);
        }
        


    }
}
