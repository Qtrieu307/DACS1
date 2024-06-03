package Dao;

import java.util.List;

import Model.Book_Model;
import Model.TheMuon;


public interface ThongKeDao {

	public List<TheMuon> getList();
	public List<Book_Model> getListSach();
}