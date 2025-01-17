package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

	public static void main(String[] args) {
		System.out.println("Processo seletivo");
		
		/*
		 * analisarCandidato(1900.0); analisarCandidato(2200.0);
		 * analisarCandidato(2000.0);
		 */
		selecaoCandidatos();
	}
	
	static void imprimirSelecionados() {
		
	}
	
	static void selecaoCandidatos() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
			int candidatosSelecionados = 0;
			int candidatoAtual = 0;
			double salarioBase = 2000.0;
			while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
				String candidato = candidatos[candidatoAtual];
				double salarioPretendido = valorPretendido();
				
				System.out.println("O canditado " + candidato + " solicitou este valor de salário " + salarioPretendido);
				if(salarioBase >= salarioPretendido) {
					System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
					candidatosSelecionados++;
				}
				candidatoAtual++;
			}
		
	}
	static double valorPretendido() {
		
		return ThreadLocalRandom.current().nextDouble(1800, 2000);
	}


	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO");
		}else if(salarioBase==salarioPretendido) {
			System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
		}else {
			System.out.println("AGUARDANDO RESULTADO DOS DEMAIS CANDIDATOS");
		}
	}
	
	

}
