package com.addressbook.test;
import com.addressbook.service.Person;
import com.addressbook.service.AddressBookManager;
import com.addressbook.service.AddressBookService;
import java.util.Scanner;

public class AddressBookTest
{
	public static void main(String[] args)
	{
		Person person = new Person();
		AddressBookManager abm = new AddressBookManager();
		AddressBookService abs = new AddressBookService();
		Scanner sc = new Scanner(System.in);


		System.out.println("choose your option");
		System.out.println("1. open address book");
		System.out.println("2. create new address book");
		System.out.println("3. open current address book");
		System.out.println("4. close address book");
		int choice = sc.nextInt();

		System.out.println("-----------------------------------------");
		switch(choice)
		{
			case 1:
				System.out.println("enter address book name");
				String address_book_Name = sc.next()
				abm.openAddressBook(String address_book_Name);
				break;
			case 2:
				System.out.println("enter address book name");
				String address_book_Name = sc.next();
				abm.createNewAddressBook(String address_book_Name);
				break;
			case 3:
				System.out.println("getting current address book name");
                                abm.getCurrentAddressBook();
				break;
			case 4:
				System.out.println("enter name to close addressbook");
				String address_book_Name = sc.next();
                                abm.closeAddressBook(String address_book_Name);
				break;
			default:
				System.out.println("enter correct choice");
		}

		System.out.println("----------------------------------------");

		System.out.println("enter your choice");
		System.out.println("1. add new person");
		System.out.println("2. sort person list by first name");
		System.out.println("3. sort person list by last name");
		System.out.println("4. sort person list by zip code");
		System.out.println("5. edit person details");
		System.out.println("6. print list of person");
		System.out.println("-----------------------------------------");

		choice = sc.nextInt();
		switch(choice)
		{
			case 1:
				System.out.println("adding person");
				abs.addPerson(Person newPer);
				break;
			case 2:
				System.out.println("sort person by first name");
				abs.sortByFirstName();
				break;
			case 3:
				System.out.println("sort person list by last name");
				abs.sortByLastName();
				break;
			case 4:
				System.out.println("sort person list by zip code");
				abs.sortByZipCode();
				break;
			case 5:
				System.out.println("edit person details");
				abs.editPerson(Person editPer);
				break;
			case 6:
				System.out.println("print list of person, enter name");
				String name = sc.next();
				abs.getPersonFromList(String name);
				break;
			default:
				System.out.println("enter correct number");
		}
		System.out.println("------------------------------------------------");

	}
}
