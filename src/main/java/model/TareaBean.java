package model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class TareaBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private String codigo;
	private String nombre;
	private String encargado;
	private String estado;
	
	private static List<TareaBean> tareas = null;
	
	public TareaBean() {}

	public TareaBean(String codigo, String nombre, String estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.estado = estado;
	}

	public TareaBean(String codigo, String nombre, String encargado, String estado) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.encargado = encargado;
		this.estado = estado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEncargado() {
		return encargado;
	}

	public void setEncargado(String encargado) {
		this.encargado = encargado;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "TareaBean [codigo=" + codigo + ", nombre=" + nombre + ", encargado=" + encargado + ", estado=" + estado
				+ "]";
	}
	
	public void create(TareaBean tarea) {
		this.getTareas().add(tarea);
	}
	
	public List<TareaBean> getTareas(){
		if (tareas == null) {
			tareas = new ArrayList<TareaBean>();
		}
		return tareas;
	}
	
}
