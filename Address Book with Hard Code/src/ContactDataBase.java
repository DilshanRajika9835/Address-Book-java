import java.util.ArrayList;
 class ContactDataBase{
	static ArrayList<PhoneBookDTO>ContactList=new ArrayList<>();
	static int count;
static {
	
	ContactList.add(new PhoneBookDTO("Dilshan","Rajika","No 237,colombo","0766681523","DilshanRajika100@gmail"));
	ContactList.add(new PhoneBookDTO("Nimal","paerera","No 237,colombo","0766681523","Nimal100@gmail"));
	ContactList.add(new PhoneBookDTO("Sunil","kodithuwakku","No 237,colombo","0766481528","Sunil100@gmail"));
	ContactList.add(new PhoneBookDTO("karunasena","bandara","No 237,colombo","0766581528","karunasena1200@gmail"));
	ContactList.add(new PhoneBookDTO("Ruwanth","soisa","No 237,colombo","0766681523","DilshanRajika100@gmail"));
	ContactList.add(new PhoneBookDTO("Bashi","witanachci","No 237,colombo","0766684528","DilshanRajika100@gmail"));
	ContactList.add(new PhoneBookDTO("Cathuri","waduge","No 237,colombo","0766681558","DilshanRajika100@gmail"));
	ContactList.add(new PhoneBookDTO("Oshini","dhinushika","No 237,colombo","0766651528","DilshanRajika100@gmail"));
	ContactList.add(new PhoneBookDTO("Amandhi","sathsarani","No 237,colombo","0766681528","DilshanRajika100@gmail"));
	ContactList.add(new PhoneBookDTO("Ramani","Dhurage","No 237,colombo","0766681578","DilshanRajika100@gmail"));

	
	}
	public static boolean save(PhoneBookDTO bookdto){

	boolean addcontact =ContactList.add(bookdto);//reference received
	count++;
	return addcontact;
	
	}
	public static int Counter(){
		return count;
		
		}
}
