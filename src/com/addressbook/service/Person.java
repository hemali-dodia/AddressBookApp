import java.lang.Comparable;
import java.io.Serializable;

class Person implements Comparable<Person>,Serializable
{
	private static final long serialVersionUID = 1L;

	String first_name;
	String last_name;
	String state;
	String city;
	String addressLine1;
	String addressLine2;
	double ph_num;
	int zip;

	Person(){}
	Person(String first_name, String last_name, String state, String city, String addressLine1, String addressLine2, double ph_num, int zip)
	{
		this.first_name=first_name;
		this.last_name=last_name;
		this.state=state;
		this.city=city;
		this.addressLine1=addressLine1;
		this.addressLine2=addressLine2;
		this.ph_num=ph_num;
		this.zip=zip;
	}

	public void setFirstName(String first_name){
		this.first_name=first_name;
	}
	public void setLastName(String last_name){
		this.last_name=last_name;
	}
	public void setState(String state){
		this.state=state;
	}
	public void setCity(String city){
		this.city=city;
	}
	public void setAddressLine1(String addressLine1){
		this.addressLine1=addressLine1;
	}
	public void setAddressLine2(String addressLine2){
		this.addressLine2=addressLine2;
	}
	public void setPh_num(double ph_num){
		this.ph_num=ph_num;
	}
	public void setZip(int zip){
		this.zip=zip;
	}

	public String getFirstName(){
		return this.first_name;
	}
	public String getLastName(){
		return this.last_name;
	}
	public String getState(){
		return this.state;
	}
	public String getCity(){
		return this.city;
	}
	public String getAddressLine1(){
		return this.addressLine1;
	}
	public String getAddressLine2(){
		return this.addressLine2;
	}
	public double getPh_num(){
		return this.ph_num;
	}
	public int getZip(){
		return this.zip;
	}

	public String toString(){
		return this.first_name+" "+ this.last_name+ "-\n"+ this.ph_num+"\n"+this.addressLine1+"\n"+this.addressLine2;
	}

	@Override
	public int CompareTo(Person person){
		return ((person.this.getZip())).compareTo(person.getZip());
	}
}
