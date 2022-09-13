package POO;

public class FuncionarioTeste {

	public static void main(String[] args) {
		
		// Exercício  4 - POO
		
		Funcionario func1 = new Funcionario("Sergio Cruz",37,"Masculino","Vendas","Analista Pleno",5000);
		Funcionario  func2 = new Funcionario("Melissa Alvez",25,"Feminino","Logística","Estagiária",1850.20);
		
		func1.imprimirInfo();
		System.out.println("\n\n");
		func2.imprimirInfo();


	}

}
