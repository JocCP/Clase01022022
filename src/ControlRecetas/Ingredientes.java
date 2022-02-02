package ControlRecetas;

public class Ingredientes {
	
	private String Nombre;
	private String tipo;
	
	
	public String getNombre() {
		return Nombre;
	}


	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public Ingredientes(String nombre, String tipo) {
		super();
		Nombre = nombre;
		this.tipo = tipo;
	}
	
	
	

	
		
	}

	

