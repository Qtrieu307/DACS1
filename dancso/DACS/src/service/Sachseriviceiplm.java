/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import java.util.List;
import Dao.SachDao;
import Dao.SachDaoImplements;
import Model.Book_Model;

public class Sachseriviceiplm implements SachService{

	private SachDao sachDao =null;
	public Sachseriviceiplm () {
		sachDao =new SachDaoImplements();
	}
	@Override
	public List<Book_Model> getList() {
		// TODO Auto-generated method stub
		return sachDao.getList();
	}

	@Override
	public int createOrUpdate(Book_Model sach) {
		// TODO Auto-generated method stub
		return sachDao.createOrUpdate(sach);
	}

	@Override
	public int delete(Book_Model sach) {
		return sachDao.delete(sach);
	}

}

