/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author phamn
 */
import Dao.TaiKhoanDao.TaiKhoanDAO;
import Dao.TaiKhoanDaoImplement;
import Model.User;
import java.util.List;

public class TaiKhoanServiceImplements implements TaiKhoanService {

	private TaiKhoanDAO taiKhoanDAO =null;
	
	public TaiKhoanServiceImplements() {
		taiKhoanDAO = new TaiKhoanDaoImplement() {
                
                  
                };
	}

	@Override
	public User login(String tenDangNhap, String matKhau) {
        return taiKhoanDAO.login(tenDangNhap, matKhau);

	}

    @Override
    public int dangky(User user) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
      

 


}