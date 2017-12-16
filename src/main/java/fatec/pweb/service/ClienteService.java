package fatec.pweb.service;


import java.util.List;

import fatec.pweb.dao.ClienteDAO;
import fatec.pweb.model.Cliente;


public class ClienteService {

 	ClienteDAO clienteDAO = new ClienteDAO();
 	
	public Cliente salvar(Cliente cliente)
	{
		cliente = clienteDAO.save(cliente);
		clienteDAO.closeEntityManager();
		return cliente;
		
	}
	
	public List <Cliente> getClientes()
	{
		List <Cliente> list = clienteDAO.getAll(Cliente.class);
		clienteDAO.closeEntityManager();
		return list;
	}

	public void alterar(Cliente cliente) {
		clienteDAO.save(cliente);
		clienteDAO.closeEntityManager();
	}

	
	public void remover(Cliente cliente) {
		
		cliente = clienteDAO.getByString(Cliente.class, cliente.getCpf());
		clienteDAO.remove(cliente);
		clienteDAO.closeEntityManager();
	}
	
	public Cliente consultar(Cliente cliente) {
		cliente = clienteDAO.getById(Cliente.class, cliente.getCpf());
		clienteDAO.closeEntityManager();
		return cliente;
	}
}
