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

import fatec.pweb.model.Vendedor;
import fatec.pweb.service.VendedorService;;

@Path("/vendedor")
public class RestVendedor {
	
	   @POST
	   @Path("/save")
	   @Produces(MediaType.APPLICATION_JSON)
       public Vendedor save(Vendedor client){
             VendedorService service = new VendedorService();
             return service.salvar(client);
       }
	   
	   @DELETE
		@Path("/delete")
		@Produces(MediaType.APPLICATION_JSON)
		public void delete(Vendedor vendedor) {
			VendedorService service = new VendedorService();
			service.remover(vendedor);
		}
	   
	   @GET
	   @Path("/all")
	   @Produces(MediaType.APPLICATION_JSON)
	   public List<Vendedor> getAllClients(){
		   List<Vendedor> clients;
		   VendedorService service = new VendedorService();
		   clients = service.getVendedors();
	       return clients;
	   }

	   @PUT
	   @Path("/update")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Vendedor update(Vendedor user){
		   VendedorService service = new VendedorService();
		   user = service.alterar(user);
	       return user;
	   }
	   
	   
 
}
