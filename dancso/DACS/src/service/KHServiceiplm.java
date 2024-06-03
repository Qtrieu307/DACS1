/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;


import java.util.List;
import Dao.SachDao;
import Dao.SachDaoImplements;
import Dao.KHDaoImplements;

import Model.KhachHang_Model;
import java.util.Date;
import Dao.KHDao;

public class KHServiceiplm implements KHService{

	private KHDao userDao =null;
	public KHServiceiplm() {
             userDao = new KHDaoImplements();
	}
	@Override
	public List<KhachHang_Model> getList() {
		// TODO Auto-generated method stub
		return userDao.getList();
	}

    @Override
    public int createOrUpdate(KhachHang_Model kh) {
       return userDao.createOrUpdate(kh);
    }

    @Override
    public int delete(KhachHang_Model kh) {
        return userDao.delete(kh);
    }

    

}


