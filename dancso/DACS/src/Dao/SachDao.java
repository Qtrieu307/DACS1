/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dao;

import java.util.List;

import Model.Book_Model;

public interface SachDao {
	 public List<Book_Model> getList();
	  
	  public int createOrUpdate(Book_Model sach);
	  
	  public int delete (Book_Model sach);
}

