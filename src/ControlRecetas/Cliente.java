package ControlRecetas;

public class Cliente {
	
	private  String nombre;
	private  int  mesa;
	private  int  pedido;
	
	public Cliente(String nombre, int mesa, int pedido) {
		super();
		this.nombre = nombre;
		this.mesa = mesa;
		this.pedido = pedido;
	}
	public Cliente(int i, String string, int pedido2) {
		// TODO Auto-generated constructor stub
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getMesa() {
		return mesa;
	}
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	public int getPedido() {
		return pedido;
	}
	public void setPedido(int pedido) {
		this.pedido = pedido;
	}
	
	

}
