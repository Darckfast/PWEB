package fatec.pweb.model;

import java.util.ArrayList;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Pedido {
	@Id
    private int numero;
    private String dataEmissaoPedido;
    private String dataPagto;
    private boolean status;
    @ManyToOne
    private Cliente cliente;
    @ManyToOne
    private Vendedor vendedor;
    @OneToMany(mappedBy="pedido")
    private ArrayList<ItemPedido> itens;

    public Pedido() {
        itens = new ArrayList<ItemPedido>();
    }
    
    public ArrayList<ItemPedido> getItens() {
		return itens;
	}

	public void setItens(ArrayList<ItemPedido> itens) {
		this.itens = itens;
	}

	public void setDataEmissaoPedido(String dataEmissaoPedido) {
		this.dataEmissaoPedido = dataEmissaoPedido;
	}

	public int getNumero() {
        return numero;
    }

    public String getDataEmissaoPedido() {
        return dataEmissaoPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        cliente.addPedido(this);
    }
    
    public String getDataPagto() {
        return dataPagto;
    }

    public void setDataPagto(String dataPagto) {
        this.dataPagto = dataPagto;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
    
    public void addItem(ItemPedido item) {
        itens.add(item);
        cliente.setLimiteDisp(cliente.getLimiteDisp() - (item.getProduto().getPrecoUnit() * item.getQtdeVendida()));
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
        vendedor.addPedido(this);
    }

	public void setNumero(int numero) {
		this.numero = numero;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dataEmissaoPedido == null) ? 0 : dataEmissaoPedido.hashCode());
		result = prime * result + numero;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pedido other = (Pedido) obj;
		if (dataEmissaoPedido == null) {
			if (other.dataEmissaoPedido != null)
				return false;
		} else if (!dataEmissaoPedido.equals(other.dataEmissaoPedido))
			return false;
		if (numero != other.numero)
			return false;
		return true;
	}

}