package mvc.OlaMundo;

public class Pessoa {
private	String nome;
private	long cpf;
private	Endereco enderecoDaPessoa;
private	double altura;
private	String corDoCabelo;
private	String dataDeNascimento;

//Construtor
public Pessoa() {}

	public Pessoa(String nome, long cpf, Endereco enderecoDaPessoa, double altura, String corDoCabelo,
		String dataDeNascimento) {
	super();
	this.nome = nome;
	this.cpf = cpf;
	this.enderecoDaPessoa = enderecoDaPessoa;
	this.altura = altura;
	this.corDoCabelo = corDoCabelo;
	this.dataDeNascimento = dataDeNascimento;
}
	
	//Métodos magicos

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getCpf() {
		return cpf;
	}

	public void setCpf(long cpf) {
		this.cpf = cpf;
	}

	public Endereco getEnderecoDaPessoa() {
		return enderecoDaPessoa;
	}

	public void setEnderecoDaPessoa(Endereco enderecoDaPessoa) {
		this.enderecoDaPessoa = enderecoDaPessoa;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public String getCorDoCabelo() {
		return corDoCabelo;
	}

	public void setCorDoCabelo(String corDoCabelo) {
		this.corDoCabelo = corDoCabelo;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
}



	
























	


