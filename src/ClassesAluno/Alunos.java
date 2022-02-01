package ClassesAluno;

public class Alunos {
	
	
	private String Nome;
	private int idade;
	private String sexo;
	private String CPF;
	
	public Alunos() {
		
	}
	
	
	
	

	public Alunos(String nome, int idade, String sexo, String cPF) {
		super();
		Nome = nome;
		this.idade = idade;
		this.sexo = sexo;
		CPF = cPF;
	}





	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
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
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	
	
	
}


