
public class Main {

	public static void main(String[] args)
	{
	
		
		Cliente cliente1 = new Cliente();
		cliente1.setNome("amanda");
		
		Cliente cliente2 = new Cliente();
		cliente1.setNome("Barbara");
		
		Conta cc = new ContaCorrente(cliente1);
		Conta cp = new Contapoupanca(cliente1);
		
		Conta cc2 = new ContaCorrente(cliente2);
		Conta cp2 = new Contapoupanca(cliente2);
		
		cc.depositar(15000);
		cc.transferir(1200,cp);
		cc.imprimirExtrato();
		cp.imprimirExtrato();
		
		cc2.depositar(13000);
		
		Cliente.exibeListaCliente();
		
		
		
		

	}

}
