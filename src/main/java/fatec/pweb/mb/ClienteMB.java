package fatec.pweb.mb;

import javax.faces.bean.ManagedBean;

import org.primefaces.event.RowEditEvent;

import fatec.pweb.model.Cliente;
import fatec.pweb.service.ClienteService;

import java.util.List;

@ManagedBean

public class ClienteMB {
	private Cliente cliente = new Cliente();
	private List<Cliente> clientes;
	private ClienteService service = new ClienteService();
	
	//Edição de um Cliente na Tabela
	public void onRowEdit(RowEditEvent event) {
		Cliente cli = ((Cliente) event.getObject());
		service.alterar(cli);
	}
	
	public void salvar() {
		cliente = service.salvar(cliente);
		
		if (clientes != null)
			clientes.add(cliente);
		
		cliente = new Cliente();
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	// Retorna a Lista de Clientes para a Tabela
	public List<Cliente> getClientes() {
		if (clientes == null)
			clientes = service.getClientes();
		return clientes;
	}
	
	public void remover(Cliente cliente) {
		service.remover(cliente);
		clientes.remove(cliente);
	}
	
	public Cliente consultar(Cliente cliente) {
		cliente = service.consultar(cliente);
		return cliente;
	}
}