package POO;

public class PacienteTeste {

	public static void main(String[] args) {
		
		//Exercício 7 -  POO
		
		Paciente paciente1 = new Paciente("Lucas Silva","masculino",12,1.57,50.89,"Não possui alergias");
		Paciente paciente2 = new Paciente("Allana Moreira","feminino",38,1.70,95,"Alérgica a benzetacil");
		
		paciente1.imprimirInfo();
		System.out.println("\n\n");
		paciente2.imprimirInfo();

	}

}
