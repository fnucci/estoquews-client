package br.com.caelum.estoquews.cliente;

public class TesteClienteSoap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EstoqueWS cliente = new EstoqueWS_Service().getEstoqueWSPort();

		Filtro filtro = new Filtro();
		filtro.setNome("IPhone");
		filtro.setTipo("Celular");
		
		Filtros filtros = new Filtros();
		filtros.getFiltro().add(filtro);

		ListaItens lista = cliente.todosOsItens(filtros);
		
		System.out.println("Resposta do serviço: " + lista);
	}

}
