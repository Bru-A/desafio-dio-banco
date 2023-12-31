import java.util.List;

public abstract class Conta implements IConta
{
	protected static final int agencia_padrao=0001;
	private static int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int numero;
	protected double saldo;
	private Cliente cliente;
	
	//Construtor
	public Conta(Cliente cliente)
	{
		this.agencia = Conta.agencia_padrao;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	//Implementando os métodos da Interface

	@Override
	public void sacar(double valor)
	{
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) 
	{
		saldo += valor;
		
	}

	@Override
	public void transferir(double valor, Conta contadestino)
	{
		this.sacar(valor);
		contadestino.depositar(valor);
		
	}
	
	protected void imprimirAtributos()
	{
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
	

