package co.com.ensayoMVC.model;

import java.io.Serializable;

public class LugarDTO implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -8871651137376779965L;
	private int id;
	private String nombre;
	private String direccion;
	private Long alt;
	private Long lon;
	private String telefono;
	private String descripcion;
	private String horario;
	private String correo;
	
	/**
	 * Constructor
	 * @param nombre
	 * @param direccion
	 * @param alt
	 * @param lon
	 * @param telefono
	 * @param descripcion
	 * @param horario
	 * @param correo
	 */
	public LugarDTO(String nombre, String direccion, Long alt, Long lon, String telefono, String descripcion,
			String horario, String correo) {
		super();
		
		this.nombre = nombre;
		this.direccion = direccion;
		this.alt = alt;
		this.lon = lon;
		this.telefono = telefono;
		this.descripcion = descripcion;
		this.horario = horario;
		this.correo = correo;
	}
	
	public LugarDTO(){
		super();
	}

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
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	/**
	 * @return the alt
	 */
	public Long getAlt() {
		return alt;
	}
	/**
	 * @param alt the alt to set
	 */
	public void setAlt(Long alt) {
		this.alt = alt;
	}
	/**
	 * @return the lon
	 */
	public Long getLon() {
		return lon;
	}
	/**
	 * @param lon the lon to set
	 */
	public void setLon(Long lon) {
		this.lon = lon;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
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
	 * @return the horario
	 */
	public String getHorario() {
		return horario;
	}
	/**
	 * @param horario the horario to set
	 */
	public void setHorario(String horario) {
		this.horario = horario;
	}
	/**
	 * @return the correo
	 */
	public String getCorreo() {
		return correo;
	}
	/**
	 * @param correo the correo to set
	 */
	public void setCorreo(String correo) {
		this.correo = correo;
	}
}
