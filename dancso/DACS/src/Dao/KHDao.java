/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.util.List;

import Model.KhachHang_Model;
import service.KHServiceiplm;

public interface KHDao {
    
	 public List<KhachHang_Model> getList();
	  
	  public int createOrUpdate(KhachHang_Model kh);
	  
	  public int delete (KhachHang_Model kh);
}

