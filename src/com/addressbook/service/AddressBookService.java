package com.addressbook.service;

import java.io.IOException;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class AddressBookService
{
	Scanner sc = new Scanner(System.in);
	Person person = new Person();
	ArrayList<person> personList = new ArrayList<person>();
	public String address_book_name;

	public void addPerson(Person newPer)
	{
		if(newPer == null)
		{
			newPer = new Person();

			System.out.println("first name : ");
			newPer.setFirstName(sc.next());

			System.out.println("last name : ");
			newPer.setLastName(sc.next());

			System.out.println("address line 1 : ");
			newPer.setAddressLine1(sc.next());

			System.out.println("address line 2 : ");
			newPer.setAddressLine2(sc.next());

			System.out.println("city : ");
			newPer.setCity(sc.next());

			System.out.println("state : ");
			newPer.setState(sc.next());

			System.out.println("zip : ");
			newPer.setZip(sc.nextInt());

			System.out.println("phone number : ");
			newPer.setPh_num(sc.nextduble());

			System.out.println("person added");
		}
		this.personList.add(newPer);
	}

	public void sortByFirstName()
	{
		this.personList.sort(Comparator.Comparing(e -> e.getFirstName().toLowerCase()));
	}

	public void sortByLastName()
	{
		this.personList.sort(Comparator.Comparing(e -> e.getLastName().toLowerCase()));
	}

	public void sortByZipCode()
	{
		Collections.sort(this.personList);
	}

	public Person getPersonFromList(String name)
	{
		for(Person per : this.personList)
		{
			if(name.wqualsIgnoreCase(per.getName()))
			{
				return per;
			}
		}
		return null;
	}

	public void editPerson(Person editPer)
	{
		System.out.println("enter first name : ");
		String first_name = sc.next();
		editPer = this.getPersonFromList(first_name);
		if(editPer != null)
		{
			System.out.println("new address line 1 : ");
			editPer.setAddressLine1(sc.next());

			System.out.println("new address line 2 : ");
			editPer.setAddressLine2(sc.next());

			System.out.println("enter city : ");
			editPer.setCity(sc.next());

			System.out.println("enter State : ");
			editPer.setState(sc.next());

			System.out.println("enter zip : ");
			editPer.setZip(sc.nextInt());

			System.out.println("enter phone number : ");
			editPer.setPh_num(sc.nextdouble());

			System.out.println("updated successfully");

			return;

		}
		System.out.println("error: did not find person to update");
	}

	public void printAddressBookList()
	{
		System.out.println("---------------------------------");
		for (Person per : this.personList)
		{
			System.out.println(per.toString());
		}
		return;
	}
}

