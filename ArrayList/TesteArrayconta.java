package ArrayList;



public class TesteArrayconta {

	
	double saldo;
	int agencia;
	int numero;
	String titular;

	public  TesteArrayconta(double saldo, int agencia, int numero,String titular) {
		
		this.saldo=saldo;
		this.agencia=agencia;
		this.numero=numero;
		this.titular=titular;
		
	
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}
	
}
	
