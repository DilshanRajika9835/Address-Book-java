
class PhoneBookDTO{
private String firstnametext;
private String lastnametext;
private String addresstext;
private String contacttext;
private String emailaddresstext;	

//defaul constructor
PhoneBookDTO(){}
PhoneBookDTO(String firstnametext,String lastnametext,String addresstext,String contacttext,String emailaddresstext){
	this.firstnametext=firstnametext;
	this.lastnametext=lastnametext;
	this.addresstext=addresstext;
	this.contacttext=contacttext;
	this.emailaddresstext=emailaddresstext;
	}	
	public void setfirstnametext(String firstnametext){
		this.firstnametext=firstnametext;
	}
	public void setlastnametext(String lastnametext){
		this.lastnametext=lastnametext;
	}	
	public void setaddresstext(String addresstext){
		this.addresstext=addresstext;
	}	
	public void setcontacttext(String contacttext){
	this.contacttext=contacttext;
	}	
	public void setemailaddresstext(String emailaddresstext){
		this.emailaddresstext=emailaddresstext;
	}		
	public  String getfirstnametext(){
		return firstnametext;
		
		}
	public  String getlastnametext(){
		return lastnametext;
		
		}
	public  String getaddresstext(){
		
		return addresstext;
		}
	public  String getcontacttext(){
		return contacttext;
		
		}
	public  String getemailaddresstext(){
		
		return emailaddresstext;
		}
  @Override	
public String toString(){
	return "PhoneBookDTO{" +
                "firstnametext='" + firstnametext + '\'' +
                ", name='" + lastnametext + '\'' +
                ", address='" + addresstext + '\'' +
                ", address='" + contacttext + '\'' +
                ", salary=" + emailaddresstext +
                "}";
    }
			
	
	}	
	
