package fatec.pweb.model;
import java.util.ArrayList;

public class Cliente extends Pessoa{
	 	private double limiteCred;
	    private double limiteDisp;
	    private ArrayList<Pedido> pedidos;
	    
	    public Cliente() {
	        pedidos = new ArrayList<Pedido>();
	    }
	    public double getLimiteCred() {
	        return limiteCred;
	    }

	    public double getLimiteDisp() {
	        return limiteDisp;
	    }

	    public void setLimiteDisp(double limiteDisp) {
	        this.limiteDisp = limiteDisp;
	    }
	    
	    public void addCliente(Pedido p){
	        pedidos.add(p);
	        p.setCliente(this);
	    }
}
