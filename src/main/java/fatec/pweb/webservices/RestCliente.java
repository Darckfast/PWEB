package fatec.pweb.webservices;


import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import fatec.pweb.model.Cliente;
import fatec.pweb.service.ClienteService;;

@Path("/cliente")
public class RestCliente {
	

       
	   @POST
	   @Path("/save")
	   @Produces(MediaType.APPLICATION_JSON)
       public Cliente save(Cliente client){
             ClienteService service = new ClienteService();
             return service.salvar(client);
       }
	   
	   @GET
	   @Path("/all")
	   @Produces(MediaType.APPLICATION_JSON)
	   public List<Cliente> getAllClients(){
		   List<Cliente> clients;
		   ClienteService service = new ClienteService();
		   clients = service.getClientes();
	       return clients;
	   }

	   @PUT
	   @Path("/update")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Cliente update(Cliente user){
		   ClienteService service = new ClienteService();
		   user = service.alterar(user);
	       return user;
	   }
	   
	   @DELETE
		@Path("/delete")
		@Produces(MediaType.APPLICATION_JSON)
		public void delete(Cliente cliente) {
			ClienteService service = new ClienteService();
			service.remover(cliente);
		}
	   
	   
 
}
