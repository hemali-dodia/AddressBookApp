package com.addressbook.service;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import java.io.ObjectInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;
import java.io.FileInputStream;

public class AddressBookManager
{
	Scanner sc = new Scanner(System.in);
	File file = null;
	FileOutputStream outputStream = null;
	FileInputStream inputStream = null;
	ObjectOutputStream objOutStream = null;
	ObjectInputStream objInStream = null;
	AddressBookService currentAddressBook = null;

	public AddressBookService getCurrentAddressBook()
	{
		return this.currentAddressBook;
	}

	public void createNewAddressBook(String address_book_Name)
        {
                file = new File("./"+address_book_Name);
                boolean result;
                try
                {
                        if (result)
                        {
                                System.out.println("File created: "+ new_book.getCanonicalPath());
                        }
                        else
                        {
                        System.out.println("File exist"+new_book.getCanonicalPath());
                        }
                }
                catch(IOException e)
                {
			System.out.println("error occured");
                        e.printStackTrace();    //prints exception if any
                }
        }

	public void openAddressBook(String address_book_Name)
	{
		try
		{
			currentAddressBook = new AddressBookService(address_book_Name);
			file = new File("./"+address_book_Name);
			inputStream = new FileInputStream(address_book_Name);
			objInStream = new ObjectInput1Stream(address_book_Name);
			boolean count = true;
			while(count)
			{
				if(inputStream.available() != 0)
				{
					Person per = (Person) objInStream.readObject();
					currentAddressBook.addPerson(per);
				}
				else
				{
					count = false;
				}
			}
			System.out.println("file opened succesfully");
    		}
		catch (IOException e)
		{
      			System.out.println("An error occurred.");
      			e.printStackTrace();
    		}
	}

	public void closeAddressBook(String address_book_Name)
	{
		try
		{
			file = new File("./"+address_book_Name);
			outputStream = new FileOutputStream("./"+address_book_Name);
			objOutStream = new ObjectOutputStream("./"+address_book_Name);
			if(file.canWrite() && file != null)
			{
				outputStream.close();
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occurred.");
                        e.printStackTrace();
		}
	}
}
