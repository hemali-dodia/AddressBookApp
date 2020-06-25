package com.addressbook.test;
import com.addressbook.model.Person;
public class AddressBookTest
{
	public static void main(String[] args)
	{
		Person person = new Person();
		person.setName("Hemali Dodia");
		person.setCity("Mumbai");
		person.setZip(400092);

		System.out.println("person name = "+person.getName());
		System.out.println("city = "+person.getCity());
		System.out.println("zip code = "+person.getZip());
	}
}
