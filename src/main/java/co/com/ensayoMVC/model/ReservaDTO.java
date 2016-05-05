package co.com.ensayoMVC.model;

import java.sql.Date;

public class ReservaDTO {

	
	public ReservaDTO(String hora_inicio, String hora_final, Date fecha) {
		super();
		this.hora_inicio = hora_inicio;
		this.hora_final = hora_final;
		this.fecha = fecha;
	}
	public ReservaDTO() {
		// TODO Auto-generated constructor stub
	}
	
	
	private int id;
	private String hora_inicio;
	private String hora_final;
	private Date fecha;
	
	//claves foraneas
	
	private int lugar_id;
	private int cliente_id;
	private String barbero_id;
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
	 * @return the hora_inicio
	 */
	public String getHora_inicio() {
		return hora_inicio;
	}
	/**
	 * @param hora_inicio the hora_inicio to set
	 */
	public void setHora_inicio(String hora_inicio) {
		this.hora_inicio = hora_inicio;
	}
	/**
	 * @return the hora_final
	 */
	public String getHora_final() {
		return hora_final;
	}
	/**
	 * @param hora_final the hora_final to set
	 */
	public void setHora_final(String hora_final) {
		this.hora_final = hora_final;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the lugar_id
	 */
	public int getLugar_id() {
		return lugar_id;
	}
	/**
	 * @param lugar_id the lugar_id to set
	 */
	public void setLugar_id(int lugar_id) {
		this.lugar_id = lugar_id;
	}
	/**
	 * @return the cliente_id
	 */
	public int getCliente_id() {
		return cliente_id;
	}
	/**
	 * @param cliente_id the cliente_id to set
	 */
	public void setCliente_id(int cliente_id) {
		this.cliente_id = cliente_id;
	}
	/**
	 * @return the barbero_id
	 */
	public String getBarbero_id() {
		return barbero_id;
	}
	/**
	 * @param barbero_id the barbero_id to set
	 */
	public void setBarbero_id(String barbero_id) {
		this.barbero_id = barbero_id;
	}
	
	

}
