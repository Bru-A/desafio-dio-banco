import java.util.ArrayList;
import java.util.List;

public class Cliente
{
	private String nome;
	private static List<String> listaCliente = new ArrayList<>();

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
		listaCliente.add(nome);
	}
	
	//Método para exibir a lista de clientes
	public static List<String> getListaClientes()
	{
		return listaCliente;
	}

	public static void exibeListaCliente()
	{
		System.out.println("\nLista de clientes");
		for(String x:listaCliente)
		{
			System.out.println(x);
		}
	}
}
