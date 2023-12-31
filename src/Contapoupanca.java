
public class Contapoupanca extends Conta
{

	public Contapoupanca(Cliente cliente) {
		super(cliente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void imprimirExtrato()
	{
		System.out.println("\n***Extrato Conta Poupança***");
		super.imprimirAtributos();
		
	}
	
}

