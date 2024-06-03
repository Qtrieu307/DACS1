/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;





import Model.EmailStorage;
import Model.KhachHang_Model;
import Model.creatableKH;

import VIEW.JFrameThemKH;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.SwingUtilities;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import service.KHServiceiplm;
import service.KHService;
import ultil.Email;



public class PanelKHController {
    private JPanel jpnView;
    private JButton btnAdd;
    private JTextField jtfSearch;
    private creatableKH createtable;
    private JButton btnrefresh;
    private final String[] Colum = {"ID", "Họ Và Tên", "CCCD/CMND", "SDT", "Email", "Ngay sinh", "Gioi tinh"};
    private TableRowSorter<TableModel> rowSorter = null;
    private KHServiceiplm Service = new KHServiceiplm(); // Replace with your actual implementation

 
			public PanelKHController(JPanel jpnView, JButton btnAdd, JTextField jtfSearch,JButton btnrefresh ) {
		super();
		this.jpnView = jpnView;
		this.btnAdd = btnAdd;
		this.jtfSearch = jtfSearch;
		this.btnrefresh =btnrefresh;
		this.createtable =new creatableKH();
		
		this.Service = new KHServiceiplm();
	}
			


			public PanelKHController() {
				this.Service = new KHServiceiplm();
				
			}



			public void setDataToTable() {
		        List<KhachHang_Model> listItem = Service.getList();
		        DefaultTableModel model = createtable.setTableUser(listItem, Colum);
		        JTable table = new JTable(model);

		        rowSorter = new TableRowSorter<>(table.getModel());
		        table.setRowSorter(rowSorter);

		        jtfSearch.getDocument().addDocumentListener(new DocumentListener() {
		            @Override
		            public void insertUpdate(DocumentEvent e) {
		                String text = jtfSearch.getText();
		                if (text.trim().length() == 0) {
		                    rowSorter.setRowFilter(null);
		                } else {
		                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
		                }
		            }

		            @Override
		            public void removeUpdate(DocumentEvent e) {
		                String text = jtfSearch.getText();
		                if (text.trim().length() == 0) {
		                    rowSorter.setRowFilter(null);
		                } else {
		                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
		                }
		            }

		            @Override
		            public void changedUpdate(DocumentEvent e) {
		            }
		        });

		        
		        table.addMouseListener(new MouseListener() {
					
					@Override
					public void mouseReleased(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mousePressed(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseExited(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseEntered(MouseEvent e) {
						// TODO Auto-generated method stub
						
					}
					
					@Override
					public void mouseClicked(MouseEvent e) {
						// TODO Auto-generated method stub
                                                  if (SwingUtilities.isRightMouseButton(e)) {
                                                       int row = table.rowAtPoint(e.getPoint());
                                                       int col = table.columnAtPoint(e.getPoint());
						  if (col == 4 ) { // Check if the clicked column is the Email column
                                                String email = table.getValueAt(row, col).toString();
                                                System.out.println("Email: " + email);
                                                EmailStorage.getInstance().setEmail(email);
                                                Email frame=new Email();
                                                frame.setVisible(true);
                                                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
//          
                                                frame.setLocationByPlatform(false);
                                                frame.setResizable(false);
//                                                
                                                
                                                
                                                
                                               }
                                               }
						 if (e.getClickCount() == 2 && table.getSelectedRow() != -1) {
			                    DefaultTableModel model = (DefaultTableModel) table.getModel();
			                    int selectedRowIndex = table.getSelectedRow();
			                    selectedRowIndex = table.convertRowIndexToModel(selectedRowIndex);

                                            KhachHang_Model kh = new KhachHang_Model();
			                    kh.setID((int) model.getValueAt(selectedRowIndex, 0));
			                    kh.setTen(model.getValueAt(selectedRowIndex, 1).toString());
			                    System.out.println(selectedRowIndex);
                                            
			                    // Uncomment the lines below and update them according to your model
			                    kh.setCccd( model.getValueAt(selectedRowIndex, 2).toString());
			                    kh.setSdt( model.getValueAt(selectedRowIndex, 3).toString());
                                            kh.setEmail(model.getValueAt(selectedRowIndex, 4).toString());
//                                            kh.setNgaysinh(model.getValueAt(selectedRowIndex, 4).toString());
                                            kh.setNgaysinh(
			                    	    convertDateToDateSql(
			                    	        convertStringToDate(
			                    	            model.getValueAt(selectedRowIndex, 5).toString(),
			                    	            "yyyy-MM-dd"
			                    	        )
			                    	    )
			                    	);
			                    kh.setGioitinh(model.getValueAt(selectedRowIndex, 6).toString().equalsIgnoreCase("Nam") ? true : false);
//			                    theMuon.setNgaySinh(
//			                    	    convertDateToDateSql(
//			                    	        convertStringToDate(
//			                    	            model.getValueAt(selectedRowIndex, 5).toString(),
//			                    	            "yyyy-MM-dd"
//			                    	        )
//			                    	    )
//			                    	);

			                    JFrameThemKH frame =new JFrameThemKH(kh);
								frame.setTitle("Sửa/Xóa độc giả");
								frame.setVisible(true);
								frame.setLocationRelativeTo(null);
                                                              
								frame.setResizable(false);
                                                                  frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			                }
						
					}
		            	
		        });



		        
		        // design
		        table.getTableHeader().setFont(new Font("Arial", Font.BOLD, 14));
		        table.getTableHeader().setPreferredSize(new Dimension(100, 50));
		        table.setRowHeight(50);
		        table.validate();
		        table.repaint();
                        table.setBackground(new Color(204,255,255));
		        
		        JScrollPane scroll = new JScrollPane();
		        scroll.getViewport().add(table);
		        scroll.setPreferredSize(new Dimension(945, 361));
                        jpnView.setLayout(new  BorderLayout());
		        jpnView.removeAll();
		
		        jpnView.add(scroll, BorderLayout.CENTER);
		       
		        jpnView.validate();
		        jpnView.repaint();
				
		    }
			
				 public void setEvent() {
					btnAdd.addMouseListener(new MouseAdapter() {
						@Override
						public void mouseClicked(MouseEvent e) {
							JFrameThemKH frame =new JFrameThemKH(new KhachHang_Model());
                                                        frame.setTitle("Thêm độc giả");
							frame.setVisible(true);
							frame.setLocationRelativeTo(null);
							frame.setResizable(false);
                                                        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
							
						
						}
						@Override
						public void mouseEntered(MouseEvent e) {
							btnAdd.setBackground(new Color(0, 153, 255));
						}
						@Override
						public void mouseExited(MouseEvent e) {
							// TODO Auto-generated method stub
							btnAdd.setBackground(new Color(176,224,230));
							super.mouseExited(e);
						}
						
					});
				
		        btnrefresh.addMouseListener(new MouseAdapter() {
				   @Override
				public void mouseClicked(MouseEvent e) {
					
					   setDataToTable();
					super.mouseClicked(e);
				}
				   @Override
					public void mouseEntered(MouseEvent e) {
					
					   btnrefresh.setBackground(new Color(0, 153, 255));
						
					}
				   @Override
					public void mouseExited(MouseEvent e) {
					   btnrefresh.setBackground(new Color(176,224,230));
					}
		        });		
		        		
			}



    public static Date convertStringToDate(String dateString, String format) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        try {
            java.util.Date utilDate = dateFormat.parse(dateString);
            return new Date(utilDate.getTime());
        } catch (ParseException e) {
            e.printStackTrace(); // Handle the ParseException appropriately
            return null;
        }
    }

    public static java.sql.Date convertDateToDateSql(java.util.Date utilDate) {
        if (utilDate != null) {
            return new java.sql.Date(utilDate.getTime());
        } else {
            return null;
        }
    }
}
	

