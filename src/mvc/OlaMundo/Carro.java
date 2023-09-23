package mvc.OlaMundo;

public class Carro {
	int quantidadeDeRodas;
	int aroDaRoda;
	String tipoDoMotor;
	String cor;
	String marca;
	String modelo;
	double velocidadeMaxima;
	boolean ligado;
	
	public boolean isLigado() {
		return this.ligado;
	}
	
	public void ligarOCarro() {
		if(!this.ligado) {
			this.ligado = true;
		}
	}
}
