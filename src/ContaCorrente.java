
public class ContaCorrente extends Conta
{
	public ContaCorrente(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	private static int SEQUENCIAL = 1; //static pq tem relacao com a classe, ñ com a estância

	@Override
	public void imprimirExtrato() {
		System.out.println("***Extrato Conta Corrente***");
		super.imprimirAtributos();
		
	}

	

	

}
