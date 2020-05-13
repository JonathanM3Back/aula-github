package oitentaexercicio;


public class Gerente {
	
	private int numerocont;
	private String nome;
	private double deposito;
	// Optional
	
	public Gerente(int numerocont,String nome, double deposito) {
		this.numerocont = numerocont;
		this.nome = nome;
		this.deposito = deposito;
		System.out.println("Conta Aberta com Sucesso");
		System.out.println("Nome: " + this.nome);
		System.out.println("Numero da Conta: " + this.numerocont);
		System.out.printf("Saldo em Conta: %.2f",this.deposito );
		
	}
	public Gerente(int numerocont,String nome) {
		this.numerocont = numerocont;
		this.nome = nome;
		System.out.println("Conta Aberta com Sucesso");
		System.out.println("Nome: " + this.nome);
		System.out.println("Numero da Conta: " + this.numerocont);
		System.out.printf("Saldo em Conta: %.2f\n",this.deposito );
		
	}
	
	
	
	// get and setter
	
	public int getNumerocont() {
		return this.numerocont; 
	}
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDeposito() {
		return this.deposito;
	}
	
	//metodo
	public void depositar(double dinheiro) {
		this.deposito += dinheiro;
		System.out.println("\nDeposito de: $" + dinheiro + " Feito com sucesso!");
		System.out.println("Saldo Atual: $" + this.deposito);
		
	}
	public void sacar(double dinheiro) {
		
		if(this.deposito < dinheiro) {
			System.out.println("\nImpossivel sacar, você nao possui dinheiro!");	
			
		}else {
			this.deposito -= dinheiro - 5;
			System.out.println("Saque de: $" + dinheiro + " Feito com sucesso!");
			System.out.println("Saldo Atual: $" + this.deposito);
			System.out.println("Taxa de 5 reias a cada saque");
		}
	}
	public void chequeespecial(double dinheiro) {
		this.deposito -= dinheiro - 10;
		System.out.println("Saque de: $" + dinheiro + " Feito com sucesso!");
		System.out.println("Saldo Atual: $" + this.deposito);
		System.out.println("Taxa de 10 reias por utilizar o cheque");
		
	}
	

}
