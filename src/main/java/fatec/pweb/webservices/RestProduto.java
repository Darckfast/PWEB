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

import fatec.pweb.service.ProdutoService;

import fatec.pweb.model.Produto;

@Path("/produto")
public class RestProduto {
	
	   //Instalar o Chrome Advanced REST Client
	   //Para abrir: chrome://apps/  -> Escolha o ARC
       //Referencia: http://o7planning.org/en/11207/simple-crud-example-with-java-restful-web-service

       
	   //Exemplo: http://localhost:8080/ProjetoWSRestJSON/rest/client/findById?id=9999
	   /*@GET
	   @Path("/findById")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Produto findById(@QueryParam("cpf") String cpf){
           ProdutoService service = new ProdutoService();
           return service.consultar(cpf);
	   }*/
	   //Exemplo: http://localhost:8080/ProjetoWSRestJSON/rest/client/save
	   @POST
	   @Path("/save")
	   @Produces(MediaType.APPLICATION_JSON)
       public Produto save(Produto client){
             ProdutoService service = new ProdutoService();
             return service.salvar(client);
       }
	   
	  //Exemplo: http://localhost:8080/ProjetoWSRestJSON/rest/client/delete?id=99999
	   @DELETE
	   @Path("/delete")
	   @Produces(MediaType.APPLICATION_JSON)
       public void delete(@QueryParam("numero") int numero){
             ProdutoService service = new ProdutoService();
             service.remover(numero);
       }
	   
	   //http://localhost:8080/ProjetoWSRestJSON/rest/user/client/all
	   @GET
	   @Path("/all")
	   @Produces(MediaType.APPLICATION_JSON)
	   public List<Produto> getAllClients(){
		   List<Produto> clients;
		   ProdutoService service = new ProdutoService();
		   clients = service.getProdutos();
	       return clients;
	   }

	   //http://localhost:8080/ProjetoWSRestJSON/rest/user/update
	   @PUT
	   @Path("/update")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Produto update(Produto user){
		   ProdutoService service = new ProdutoService();
		   user = service.alterar(user);
	       return user;
	   }
}
