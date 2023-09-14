package Contratar;

import java.util.concurrent.ThreadLocalRandom;


public class ProcessoSeletivo {

	public static void main(String[] args) {
		selecaoCandidatos();
	}
	
		static void selecaoCandidatos() {
			String [] candidatos = {"LUIS","LUANA","WILLIAN","BRUNO","IZABELA","ORTENILA","SONIA","VIVIANE","LUIZ"};
			
			int condidatosSelecionados = 0;
			int candidatosAtual = 0;
			double salarioBase = 2000.0;
			while (condidatosSelecionados <5 && candidatosAtual < candidatos.length) {
				String candidato = candidatos[candidatosAtual];
				double salarioPretendido = valorPretendido();
				
				System.out.println("O candidato " + candidato + "Solicitou este valor de salario " + salarioPretendido) ;
				if(salarioBase >= salarioPretendido) {
					System.out.println("O candidato " + candidato + "Foi selecionado para a vaga");
					condidatosSelecionados++;
					
				}
				candidatosAtual++;
			}
		}
		static double valorPretendido() {
			return ThreadLocalRandom.current().nextDouble(1800, 2200);
		}
	
	static void analisarCantidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if (salarioBase==salarioPretendido)
			System.out.println("LIGAR PARA O CANTIDADO COM CONTRA PROPOSTA");
		else {
			System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
}
