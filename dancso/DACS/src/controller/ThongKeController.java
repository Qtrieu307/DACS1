package Controller;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.List;

import javax.swing.JPanel;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.data.category.DefaultCategoryDataset;

import Dao.ThongKeDaoipl;
import Model.Book_Model;
import Model.TheMuon;
import java.awt.BorderLayout;
import org.jfree.data.general.DefaultPieDataset;
import service.ThongKeServiceiplm;
import service.Thongkeservice;

public class ThongKeController {
   private Thongkeservice thongkeservice =null;
   public ThongKeController() {
	   this.thongkeservice =new ThongKeServiceiplm();
	   
   }
   public void setdataToBieuDo(JPanel jpnItem) {
	    List<TheMuon> listItem = thongkeservice.getList();
	    DefaultCategoryDataset dataset = new DefaultCategoryDataset();

	    if (listItem != null) {
	        for (TheMuon item : listItem) {
	            // Assuming item.getName() returns the name of the card holder
	           dataset.addValue(item.getSosachdamuon(), "Số Sách Đã Mượn", "");
	           dataset.addValue(item.getSosachdatra(), "Số Sách Đã Trả", "");
	           dataset.addValue(item.getSosachdamuon()-item.getSosachdatra(),"Số Sách Chưa Trả","");
	           
	           
	        }
	        JFreeChart chart =ChartFactory.createBarChart("Thống Kê Số Lượng Mượn Và Trả", "Mượn Và Trả ", "Số Sách", dataset);
	        
	        ChartPanel chartPanel = new ChartPanel(chart);
	        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 150));

	        jpnItem.removeAll();
	        jpnItem.setLayout(new BorderLayout());
	        jpnItem.add(chartPanel, BorderLayout.CENTER);
	        jpnItem.validate();
	        jpnItem.repaint();
	    }

	 
	

   }
   public void setdataToBieuDo2(JPanel jpnItem) {
	   DefaultPieDataset dataset = new DefaultPieDataset();
	   List<Book_Model> listItem =thongkeservice.getListSach();
	   
	   if(listItem != null) {
		   for(Book_Model item :listItem) {
			   dataset.setValue(item.getTen(), item.getSoluong());
		   }
		   JFreeChart chart =ChartFactory.createPieChart("Biểu đồ tròn Số Lượng Sách", dataset, true, true, false);
		   ChartPanel chartPanel = new ChartPanel(chart);
                   	        chartPanel.setPreferredSize(new Dimension(jpnItem.getWidth(), 150));
		   jpnItem.removeAll();
	        jpnItem.setLayout(new BorderLayout());
	        jpnItem.add(chartPanel, BorderLayout.CENTER);
	        jpnItem.validate();
	        jpnItem.repaint();
	   }
	   
   }
}

