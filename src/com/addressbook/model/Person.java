package com.addressbook.model;
public class Person
{
	String name;
	String state;
	String city;
	String address;
	double ph_num;
	int zip;

	public void setName(String name){
		this.name=name;
	}
	public void setState(String state){
		this.state=state;
	}
	public void setCity(String city){
		this.city=city;
	}
	public void setAddress(String address){
		this.address=address;
	}
	public void setPh_num(double ph_num){
		this.ph_num=ph_num;
	}
	public void setZip(int zip){
		this.zip=zip;
	}

	public String getName(){
		return this.name;
	}
	public String getState(){
		return this.state;
	}
	public String getCity(){
		return this.city;
	}
	public String getAddress(){
		return this.address;
	}
	public double getPh_num(){
		return this.ph_num;
	}
	public int getZip(){
		return this.zip;
	}
}
