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

@Path("/client")
public class RestCliente {
	
	   //Instalar o Chrome Advanced REST Client
	   //Para abrir: chrome://apps/  -> Escolha o ARC
       //Referencia: http://o7planning.org/en/11207/simple-crud-example-with-java-restful-web-service

       
	   //Exemplo: http://localhost:8080/ProjetoWSRestJSON/rest/client/findById?id=9999
	   @GET
	   @Path("/findById")
	   @Produces(MediaType.APPLICATION_JSON)
	   /*public Cliente findById(@QueryParam("cpf") String cpf){
           ClienteService service = new ClienteService();
           return service.consultar(cpf);
	   }*/ 
	   public Cliente findById(Cliente cliente){
         ClienteService service = new ClienteService();
         return service.consultar(cliente.getCpf());
	   }	
	   

	   //Exemplo: http://localhost:8080/ProjetoWSRestJSON/rest/client/save
	   @POST
	   @Path("/save")
	   @Produces(MediaType.APPLICATION_JSON)
       public Cliente save(Cliente client){
             ClienteService service = new ClienteService();
             return service.salvar(client);
       }
	   
	   
	  //Exemplo: http://localhost:8080/ProjetoWSRestJSON/rest/client/delete?id=99999
	   @DELETE
	   @Path("/delete")
	   @Produces(MediaType.APPLICATION_JSON)
       /*public void delete(@QueryParam("cpf") String id){
             ClienteService service = new ClienteService();
             service.remover(id);
       }*/
       public void delete(Cliente cliente){
           ClienteService service = new ClienteService();
           service.remover(cliente.getCpf());
       }
	   
	   //http://localhost:8080/ProjetoWSRestJSON/rest/user/client/all
	   @GET
	   @Path("/all")
	   @Produces(MediaType.APPLICATION_JSON)
	   public List<Cliente> getAllClients(){
		   List<Cliente> clients;
		   ClienteService service = new ClienteService();
		   clients = service.getClientes();
	       return clients;
	   }
	   

	   //http://localhost:8080/ProjetoWSRestJSON/rest/user/update
	   @PUT
	   @Path("/update")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Cliente update(Cliente user){
		   ClienteService service = new ClienteService();
		   user = service.alterar(user);
	       return user;
	   }
	   
	   
 
}
