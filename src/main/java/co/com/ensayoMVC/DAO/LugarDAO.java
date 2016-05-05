package co.com.ensayoMVC.DAO;

import java.util.List;

import co.com.ensayoMVC.model.LugarDTO;
/**
 * Interface 
 * @author TEFAJARITA
 */
public interface LugarDAO {
	
	public LugarDTO findLugarById(int lugarId);
	
	public List<LugarDTO> listLugar();

}
