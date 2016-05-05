package co.com.ensayoMVC.model;

/**
 * @author TEFAJARITA
 *
 */
public class BarberoDTO {

	private String cedula;
	private String nombre;
	private String apellido;
	private String telefono;	
	private String descripcion;
	private String direccion;	
	private String fotoperfil;
	
	private int lugar_id;

	/**
	 * @return the cedula
	 */
	public String getCedula() {
		return cedula;
	}

	/**
	 * @param cedula the cedula to set
	 */
	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
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

	public BarberoDTO(String cedula, String nombre, String apellido, String telefono, String descripcion,
			String direccion, String fotoperfil) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.fotoperfil = fotoperfil;
		
	}
	public BarberoDTO(){
		super();
	}
	
	

	public BarberoDTO(String cedula, String nombre, String apellido, String telefono, String descripcion,
			String direccion, String fotoperfil, int lugar_id) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.telefono = telefono;
		this.descripcion = descripcion;
		this.direccion = direccion;
		this.fotoperfil = fotoperfil;
		this.lugar_id = lugar_id;
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
	 * @return the fotoperfil
	 */
	public String getFotoperfil() {
		return fotoperfil;
	}

	/**
	 * @param fotoperfil the fotoperfil to set
	 */
	public void setFotoperfil(String fotoperfil) {
		this.fotoperfil = fotoperfil;
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
	
	
	
}
