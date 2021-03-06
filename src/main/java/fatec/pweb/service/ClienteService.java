package fatec.pweb.service;

import java.util.List;

import fatec.pweb.dao.model.ClienteDao;
import fatec.pweb.model.Cliente;

public class ClienteService {
	ClienteDao clienteDao = new ClienteDao();
	
	public Cliente salvar(Cliente cliente) {
		cliente = clienteDao.save(cliente);
		clienteDao.closeEntityManager();
		return cliente;
	}
	
	public List<Cliente> getClientes() {
		List<Cliente> list = clienteDao.getAll(Cliente.class);
		clienteDao.closeEntityManager();
		return list;
	}
	
	public Cliente alterar(Cliente cliente) {
		clienteDao.save(cliente);
		clienteDao.closeEntityManager();
		return cliente;
	}
	
	public void remover(Cliente cliente) {
		cliente = clienteDao.getById(Cliente.class, cliente.getCpf());
		clienteDao.remove(cliente);
		clienteDao.closeEntityManager();
	}
	
	public Cliente consultar(String cpf) {
        Cliente cliente = clienteDao.getById(Cliente.class, cpf);
        clienteDao.closeEntityManager();
        return cliente;
	}
}