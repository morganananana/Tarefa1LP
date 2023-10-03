package TrabalhoLP;

public class ContaBancaria {
	private double saldo;
	private String proprietario;
	private double limite;

	public ContaBancaria() {
		this.saldo = saldo;
		this.limite = limite;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public String getProprietario() {
		return proprietario;
	}

	public void setProprietario(String proprietario) {
		this.proprietario = proprietario;
	}

	public void depositar(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor menor que 0");
		} 
			double deposito = saldo + valor;
	}

	public void sacar(double valor) throws EstouroDeLimiteException {
		if (valor < 0) {
			throw new IllegalArgumentException("Valor menor que 0");
		}if (saldo + limite < valor) {
				throw new EstouroDeLimiteException("Limite estourado");
			}
			double saque  = saldo - valor;
		}	
		
	}

