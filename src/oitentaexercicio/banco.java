package oitentaexercicio;

public class banco {

	public static void main(String[] args) {
		Gerente jonathan = new Gerente(999,"Jonathan");
		System.out.println();
		jonathan.depositar(100);
		System.out.println();
		jonathan.sacar(200);
		jonathan.setNome("Jonathan Pereira");
		System.out.println("Update nome: " + jonathan.getNome());
		System.out.println();
		jonathan.chequeespecial(200);
		
		

	}

}
