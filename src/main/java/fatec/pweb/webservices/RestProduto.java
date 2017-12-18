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
	
	   @POST
	   @Path("/save")
	   @Produces(MediaType.APPLICATION_JSON)
       public Produto save(Produto client){
             ProdutoService service = new ProdutoService();
             return service.salvar(client);
       }
	   
	   @GET
	   @Path("/all")
	   @Produces(MediaType.APPLICATION_JSON)
	   public List<Produto> getAllClients(){
		   List<Produto> clients;
		   ProdutoService service = new ProdutoService();
		   clients = service.getProdutos();
	       return clients;
	   }

	   @PUT
	   @Path("/update")
	   @Produces(MediaType.APPLICATION_JSON)
	   public Produto update(Produto user){
		   ProdutoService service = new ProdutoService();
		   user = service.alterar(user);
	       return user;
	   }
	   
	   @DELETE
		@Path("/delete")
		@Produces(MediaType.APPLICATION_JSON)
		public void delete(Produto produto) {
			ProdutoService service = new ProdutoService();
			service.remover(produto);
		}
}
