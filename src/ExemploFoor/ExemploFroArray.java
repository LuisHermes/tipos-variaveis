package ExemploFoor;

public class ExemploFroArray {
    public static void main(String[] args) {
        // Array sempre o vlor de x come;a com zero
        
        /*String alunos [] = {"LUIS", "LUANA", "IZABELA", "VIVIANE"};

        for (int x=0; x < alunos.length; x++){
            System.out.println("O alunos no indice x= " + x + "é" + alunos[x]);
        } */


        // Outra forma de Array 
        String alunos [] = {"LUIS", "LUANA", "IZABELA", "VIVIANE"};

        for (String aluno : alunos){
            System.out.println("Nome do aluno é : " + aluno);
        }
    }
}
