import java.util.ArrayList.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.*;

class BookView extends JFrame{
private JTextField searchtext;
public 	BookView(){
		setSize(800,250);
		setTitle("PHONEBOOK VIEW FORM");
		setLocationRelativeTo(null);
	JPanel buttonpanel =new JPanel();
	JLabel imagelabel=new JLabel();
	ImageIcon searchimage=new ImageIcon("search.png");
	imagelabel.setIcon(searchimage);
	buttonpanel.add(imagelabel);
	JButton search=new JButton("Search");
	searchtext=new JTextField(20);
	buttonpanel.add(search);
	buttonpanel.add(searchtext);
	JButton delete=new JButton("Delete");
	JButton update=new JButton("Update");
	buttonpanel.add(update);
	buttonpanel.add(delete);
	add("South",buttonpanel);

		DefaultTableModel dtm=new DefaultTableModel(0,0);
		JTable table=new JTable(dtm);
		String tableheader[]={"Firstname","LastName","Address","Contact","Email Address"};
		dtm.setColumnIdentifiers(tableheader);
		table.setModel(dtm);
		JScrollPane pane=new JScrollPane(table);
		add(pane);
		for(PhoneBookDTO booktemp:ContactDataBase.ContactList){
			dtm.addRow(new Object[]{booktemp.getfirstnametext(),booktemp.getlastnametext(),booktemp.getaddresstext(),booktemp.getcontacttext(),booktemp.getemailaddresstext()});
			
			}
		
				update.addActionListener(new ActionListener(){
				public void  actionPerformed(ActionEvent e){
			    JOptionPane.showMessageDialog(null,"Try agin!","",JOptionPane.WARNING_MESSAGE);
				int selectindex=table.getSelectedRow();
			
					}
				
				});
////////////////////////////////////////////////////////////////////////

 delete.addActionListener(new ActionListener() {
         @Override
         public void actionPerformed(ActionEvent e) {
            if(table.getSelectedRow() != -1) {
               dtm.removeRow(table.getSelectedRow());
               JOptionPane.showMessageDialog(null, "Selected row deleted successfully");
            }else{
				JOptionPane.showMessageDialog(null,"Try agin!","",JOptionPane.WARNING_MESSAGE);
				}
         }
      });

//////////////////////////////////////////////////////////////////////
	search.addActionListener(new ActionListener(){
		int temp=0;
			public void  actionPerformed(ActionEvent e){
			   if(searchtext.getText().length()==0){
					JOptionPane.showMessageDialog(null,"Empty!");
			   }else{
				String text= searchtext.getText();
				int count=ContactDataBase.Counter();
					System.out.println(count);
					for (int i=0;i<10;i++){
				String temp=dtm.getValueAt(i, 0).toString();	
						if(temp.equals(text)){
						JOptionPane.showMessageDialog(null,"FOUND RESULT!");
							}
						}
				   }
			 }
				
	});	
	
	}

}
 class  PhoneBookViewForm{
public static void main(String args[]){
	BookView b1=new BookView();
	b1.setVisible(true);
	
	
	}	
	
	}
