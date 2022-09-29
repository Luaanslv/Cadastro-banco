package banco;

public class Cadastro {
	
	private int numeroConta;
	private String titular;
	private double saldo;
	
	
	public Cadastro() {
		
	}
	
	public Cadastro(int numeroConta, String titular, double initialValue) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		deposito(initialValue);
	}
	
	public Cadastro(int numeroConta, String titular) {
		this.numeroConta = numeroConta;
		this.titular = titular;
	}
	
	public int getNumeroConta() {
		return numeroConta;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public String getTitular() {
		return titular;
	}
	
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
	public double deposito(double deposito) {
		return saldo += deposito;
	}
	
	public double saque(double saque) {
		return saldo = (saldo - saque) - 5;
	}
	
	
	public String toString() {
		return "Account " + this.numeroConta + " Holder: "  + this.titular + ", Balance: $ " + String.format("%.2f",this.saldo);
	}
	
}
