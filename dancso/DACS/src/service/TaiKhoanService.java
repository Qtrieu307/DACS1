/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author phamn
 */

import Model.User;
import java.util.List;

public interface TaiKhoanService {
	    
         public User login(String tenDangNhap, String matKhau);
         public int dangky(User user);
      
            
}