package service;

import java.util.List;

import Dao.ThongKeDao;
import Dao.ThongKeDaoipl;
import Model.Book_Model;
import Model.TheMuon;

public class ThongKeServiceiplm implements Thongkeservice {
private ThongKeDao thongKeDao =null;

	public ThongKeServiceiplm() {
	super();
	this.thongKeDao = new ThongKeDaoipl();
}

	@Override
	public List<TheMuon> getList() {
		// TODO Auto-generated method stub
		return thongKeDao.getList();
	}

	@Override
	public List<Book_Model> getListSach() {
		// TODO Auto-generated method stub
		return thongKeDao.getListSach();
	}

}
