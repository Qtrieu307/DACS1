/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import java.util.List;

import Dao.TheMuonDao;
import Dao.TheMuonDaoimplements;
import Model.TheMuon;

public class TheMuonSeriviceiplm implements TheMuonService {

	private TheMuonDao theMuonDao =null;
	
	

	public TheMuonSeriviceiplm() {
		theMuonDao=new TheMuonDaoimplements();
	}


	 @Override
	public List<TheMuon> getList() {
		
		return theMuonDao.getList();
	}
	 @Override
	    public int createOrUpdate(TheMuon theMuon) {
	        return theMuonDao.createOrUpdate(theMuon);
	    }


	@Override
	public int delete(TheMuon theMuon) {
		    return theMuonDao.delete(theMuon);
	
	}
}

