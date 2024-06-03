package controller;

import Model.DanhMucBean;
import VIEW.JPanelBook;
import VIEW.JPanelTM;
import VIEW.JPanelTrangchu;
import VIEW.JPanelKH;
import VIEW.PanelThongKe;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;
import javax.swing.JLabel;
import javax.swing.JPanel;
//import View.ThongKePanel;



public class ChuyenMangHinh {

	private JPanel root;
	private String kindSelected="";
	private List<DanhMucBean> listItem;
	
	
	public ChuyenMangHinh(JPanel jpnRoot) {
		this.root=jpnRoot;
		
	}
	public void setView(JPanel jpnItem,JLabel jlbItem) {
	    kindSelected="TrangChu";
	    root.removeAll();
	    root.add(jpnItem);
	    root.validate();
           
	    root.repaint();
             root.setVisible(true);
             System.out.println("controller.ChuyenMangHinh.setView()");
	     
		
	}
	public void setEvent(List<DanhMucBean> listItem){
		this.listItem=listItem;
		for(DanhMucBean item : listItem) {
			  item.getJlb().addMouseListener(new LabelEvent( item.getKind(), item.getJpn(), item.getJlb()));
			
		}
		
	}
	class LabelEvent implements MouseListener{

		
		private JPanel node;
		private String kind;
		private JPanel jpnItem;
		private JLabel jlbItem;
		
		
		public LabelEvent(String kind, JPanel jpnItem, JLabel jlbItem) {
			
			this.node = node;
			this.kind = kind;
			this.jpnItem = jpnItem;
			this.jlbItem = jlbItem;
			
		}
		  

		@Override
		public void mouseClicked(MouseEvent e) {
			// TODO Auto-generated method stub
			switch (kind) {
			case "TrangChu":
				node =new JPanelTrangchu();
				break;
			case "QuanLyTheMuon":
				node = new JPanelTM();
				break;
			case "QuanLySach":
				node=new  JPanelBook();
				break;
                        case "user":
                                node=new  JPanelKH();
				break;
			case "ThongKe":
				node=new  PanelThongKe();
				break;
//				
			default:
				break;
			}
			root.removeAll();
			root.setLayout(new BorderLayout());
			root.add(node);
			root.validate();
			root.repaint();
	     	setChangeBackground(kind);
			
			
		}

		@Override
		public void mousePressed(MouseEvent e) {
			// TODO Auto-generated method stub
			
			 
		}

		@Override
		public void mouseReleased(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void mouseEntered(MouseEvent e) {
			// TODO Auto-generated method stub
			jpnItem.setBackground(new Color(192,192,192));
	        jlbItem.setBackground(new Color(192,192,192));
	      
		}

		@Override
		public void mouseExited(MouseEvent e) {
			// TODO Auto-generated method stub
			if (!kindSelected.equalsIgnoreCase(kind)) {
                jpnItem.setBackground(new Color(76, 175, 80));
                jlbItem.setBackground(new Color(76, 175, 80));
          }
		
			
		}
		private void setChangeBackground(String kind) {
			for (DanhMucBean item :listItem) {
				if (item.getKind().equalsIgnoreCase(kind)) {
					 jpnItem.setBackground(new Color(192,192,192));
					
					 jlbItem.setBackground(new Color(192,192,192));
					
				}else {
					 jpnItem.setBackground(new Color(76,175,80));
					 jlbItem.setBackground(new Color(76,175,80));
				}
			}
		}
		
	}
}
