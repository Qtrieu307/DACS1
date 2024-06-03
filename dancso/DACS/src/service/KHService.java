/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import Model.KhachHang_Model;
import java.util.List;



public interface KHService {
	 public List<KhachHang_Model> getList();
	  
	  public int createOrUpdate(KhachHang_Model kh);
	  
	  public int delete (KhachHang_Model kh);
}
