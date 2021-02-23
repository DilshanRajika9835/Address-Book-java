import java.awt.Color;
import java.util.ArrayList.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.util.*;
class Book extends JFrame{
private  JLabel title;
private JButton newcontact;
private JLabel newcontactlabel;
private JButton view;
private JButton delete;
private JButton search;
private JButton update;

private JLabel firstname;
private JLabel lastname;
private JLabel address;
private JLabel contact;
private JLabel emailaddress;

private JTextField firstnametext;
private JTextField  lastnametext;
private JTextField  addresstext;
private JTextField  contacttext;
private JTextField  emailaddresstext;

Book(){
	setSize(670,400);
	//setTitle("Address Book");
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLocationRelativeTo(null);
	setLayout(null);
	title=new JLabel("Address Book");
	title.setBounds(250,10,200,30);
	title.setFont(new Font("",1,20));
	add(title);
	ImageIcon image1=new ImageIcon("add.png");
	newcontact=new JButton();
	newcontact.setBounds(10,10,60,60);
	newcontact.setIcon(image1);
	add(newcontact);

	firstname=new JLabel("First Name");
	firstname.setBounds(10,100,100,30);
	firstname.setFont(new Font("",1,15));
	add(firstname);
	firstnametext=new JTextField(10);
	firstnametext.setBounds(150,100,300,30);
	add(firstnametext);
	
	lastname=new JLabel("Last Name");
	lastname.setBounds(10,140,100,30);
	lastname.setFont(new Font("",1,15));
	add(lastname);
	lastnametext=new JTextField(10);
	lastnametext.setBounds(150,140,300,30);
	add(lastnametext);

	address=new JLabel("Address ");
	address.setBounds(10,180,100,30);
	address.setFont(new Font("",1,15));
	add(address);
	addresstext=new JTextField(10);
	addresstext.setBounds(150,180,300,30);
	add(addresstext);

	contact=new JLabel("Contact ");
	contact.setBounds(10,220,100,30);
	contact.setFont(new Font("",1,15));
	add(contact);
	contacttext=new JTextField(10);
	contacttext.setBounds(150,220,300,30);
	add(contacttext);

	emailaddress=new JLabel("Email Address ");
	emailaddress.setBounds(10,260,150,30);
	emailaddress.setFont(new Font("",1,15));
	add(emailaddress);
	emailaddresstext=new JTextField(10);
	emailaddresstext.setBounds(150,260,300,30);
	add(emailaddresstext);
	////button set/////////////////
	view=new JButton("View");
	view.setBounds(550,140,80,30);
	add(view);
	search=new JButton("Search");
	search.setBounds(550,180,80,30);
	add(search);
	delete=new JButton("Delete!");
	delete.setBounds(550,220,80,30);
	add(delete);
	update=new JButton("Update");
	update.setBounds(550,260,80,30);
	add(update);

	JLabel labelphoto=new JLabel();
	ImageIcon wallpaper=new ImageIcon("wallaper.png");
	labelphoto.setBounds(550,10,200,100);
	labelphoto.setIcon(wallpaper);
	add(labelphoto);
	///////////////////
	 Color c = Color.decode("#80DEEA");
    getContentPane().setBackground(c);
 
		
	
newcontact.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	
		if((firstnametext.getText().length()>0||lastnametext.getText().length()>0)&&contacttext.getText().length()>0){
			PhoneBookDTO tempbook=new PhoneBookDTO(
				firstnametext.getText(),
				lastnametext.getText(),
				addresstext.getText(),
				contacttext.getText(),
				emailaddresstext.getText()
			);
			
		//	System.out.println(tempbook);
		if(contacttext.getText().length()!=10){
			JOptionPane.showMessageDialog(null,"Invalid Number!","",JOptionPane.WARNING_MESSAGE);
			}else{
			if(ContactDataBase.save(tempbook)){
			JOptionPane.showMessageDialog(null,"Saved!");
			firstnametext.setText(null);
			lastnametext.setText(null);
			addresstext.setText(null);
			contacttext.setText(null);
			emailaddresstext.setText(null);
		    }
			}
			}else{	
			JOptionPane.showMessageDialog(null,"Form is Empty!");
				}
		
		}

	});

	//create event for view 
	view.addActionListener(new ActionListener(){
	public void actionPerformed(ActionEvent e){
	PhoneBookViewForm pvf= new PhoneBookViewForm ();
	BookView b1=new BookView();
		b1.setVisible(true);
	
	}

	});


}

}
class PhoneBookViewForm extends Book{
	PhoneBookViewForm(){
		
	DefaultTableModel dtm=new DefaultTableModel(0,0);
		JTable table=new JTable(dtm);
		String tableheader[]={"Firstname","LastName","Address","Contact","Email Address"};
		dtm.setColumnIdentifiers(tableheader);
		table.setModel(dtm);
		JScrollPane pane=new JScrollPane(table);
		add(pane);	
		
		
		
		
		}
	
	
	
	}

class Demo{
public static void main(String args[]){
	Book b1=new Book();
	b1.setVisible(true);
	}	
	
	}
