package Cadastro;

public class SistemaCadastro {
	public static void main(String[] args) {
		Pessoa Luis = new Pessoa();
		
		Luis.setEndereco("Luther King , Rua Peru 115 ");
		System.out.println("O Aluno mora no endereço : " + Luis.getEndereco());
		
		Luis.setCpf("063.415.847.87");
		System.out.println("Seu numero de Cpf : " + Luis.getCpf());
		
		Luis.setNome("Willian France Binelo");
		System.out.println("Seu nome é : " + Luis.getNome());
		 

	}
}
