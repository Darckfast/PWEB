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
	
	   //Instalar o Chrome Advanced REST Client
	   //Para abrir: chrome://apps/  -> Escolha o ARC
       //Referencia: http://o7planning.org/en/11207/simple-crud-example-with-java-restful-web-service

       
	   //Exemplo: http://localhost:8080/ProjetoWSRestJSON/rest/client/findById?id=9999
	   /*@GET
	   @Path("/findById")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Vendedor findById(@QueryParam("cpf") String cpf){
           VendedorService service = new VendedorService();
           return service.consultar(cpf);
	   }*/
	   //Exemplo: http://localhost:8080/ProjetoWSRestJSON/rest/client/save
	   @POST
	   @Path("/save")
	   @Produces(MediaType.APPLICATION_JSON)
       public Vendedor save(Vendedor client){
             VendedorService service = new VendedorService();
             return service.salvar(client);
       }
	   
	  //Exemplo: http://localhost:8080/ProjetoWSRestJSON/rest/client/delete?id=99999
	   @DELETE
	   @Path("/delete")
	   @Produces(MediaType.APPLICATION_JSON)
       public void delete(@QueryParam("cpf") String id){
             VendedorService service = new VendedorService();
             //service.remover(id);
       }
	   
	   //http://localhost:8080/ProjetoWSRestJSON/rest/user/client/all
	   @GET
	   @Path("/all")
	   @Produces(MediaType.APPLICATION_JSON)
	   public List<Vendedor> getAllClients(){
		   List<Vendedor> clients;
		   VendedorService service = new VendedorService();
		   clients = service.getVendedors();
	       return clients;
	   }

	   //http://localhost:8080/ProjetoWSRestJSON/rest/user/update
	   @PUT
	   @Path("/update")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Vendedor update(Vendedor user){
		   VendedorService service = new VendedorService();
		   user = service.alterar(user);
	       return user;
	   }
	   
	   
 
}
