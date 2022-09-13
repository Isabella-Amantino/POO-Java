package POO;

public class Paciente {
	
	//Exercício 7 - POO
	
	private String nomePaciente;
	private String sexo;
	private int idade;
	private double altura;
	private double peso;
	private String alergias;
	
	
	
	public Paciente(String nomePaciente,String sexo,int idade,double altura,double peso,String alergias) {
		
		this.nomePaciente = nomePaciente;
		this.sexo = sexo;
		this.alergias = alergias;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		
		
	}

	

	
	
	public String getNomePaciente() {
		return nomePaciente;
	}





	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}





	public String getSexo() {
		return sexo;
	}





	public void setSexo(String sexo) {
		this.sexo = sexo;
	}





	public int getIdade() {
		return idade;
	}





	public void setIdade(int idade) {
		this.idade = idade;
	}





	public double getAltura() {
		return altura;
	}





	public void setAltura(double altura) {
		this.altura = altura;
	}





	public double getPeso() {
		return peso;
	}





	public void setPeso(double peso) {
		this.peso = peso;
	}





	public String getAlergias() {
		return alergias;
	}





	public void setAlergias(String alergias) {
		this.alergias = alergias;
	}





	public void imprimirInfo() {
		System.out.println("\nNome do(a) Paciente: "+nomePaciente);
		System.out.println("\nSexo: "+sexo);
		System.out.println("\nIdade: "+idade+" anos");
		System.out.println("\nAltura: "+altura);
		System.out.println("\nPeso: "+peso+" Kg");
		System.out.println("\nAlergias: "+alergias);
	}

}
