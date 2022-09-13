package POO;

public class Funcionario {

	//Exercício 4 - POO
	
	private String nomeFuncionario;
	private int idade;
	private String sexo;
	private String setor;
	private String tipoCargo;
	private double salario;
	
	public Funcionario(String nomeFuncionario,int idade,String sexo,String setor,String tipoCargo,double salario) {
		
		this.nomeFuncionario = nomeFuncionario;
		this.idade = idade;
		this.sexo =  sexo;
		this.setor = setor;
		this.tipoCargo = tipoCargo;
		this.salario = salario;
				
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
	
	public String getTipoCargo() {
		return tipoCargo;
	}

	public void setTipoCargo(String tipoCargo) {
		this.tipoCargo = tipoCargo;
	}

	public void imprimirInfo() {
		System.out.println("\nNome do(a) Funcionário(a): "+nomeFuncionario);
		System.out.println("\nIdade: "+idade+" anos");
		System.out.println("\nSexo: "+sexo);
		System.out.println("\nSetor: "+setor);
		System.out.println("\nTipo do cargo: "+tipoCargo);
		System.out.println("\nSalário: "+salario+" reais");
	}
}
