package co.com.ensayoMVC.model;

import java.io.Serializable;



public class ServicioDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3149050681710040294L;


	public ServicioDTO() {
		super();
	}
	public ServicioDTO(String nombre, String descripcion, int precio, String foto_servicio) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.foto_servicio = foto_servicio;
	}
	private int id;
	
	private String nombre;
	
	private String descripcion;

	private int precio;
	
	private String foto_servicio;


	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	/**
	 * @return the foto_servicio
	 */
	public String getFoto_servicio() {
		return foto_servicio;
	}

	/**
	 * @param foto_servicio the foto_servicio to set
	 */
	public void setFoto_servicio(String foto_servicio) {
		this.foto_servicio = foto_servicio;
	}




}
