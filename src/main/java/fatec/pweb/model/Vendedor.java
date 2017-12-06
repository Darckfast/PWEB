package fatec.pweb.model;

import java.util.ArrayList;

public class Vendedor extends Pessoa {
	private double salarioBase;
    private double comissao;
    private ArrayList<Pedido> pedidos;
    public Vendedor(String cpf, String nome, double salarioBase) {
        super(cpf, nome);
        this.salarioBase = salarioBase;
        pedidos = new ArrayList<Pedido>();
    }

    public double getSalarioBase() {
        return salarioBase;
    }
    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = 1 + comissao / 100;
    }
    public void addPedido (Pedido p){
        pedidos.add(p);
        p.setVendedor(this);
    }
}
