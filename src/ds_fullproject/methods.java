package ds_fullproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class methods 
{

    public class node 
    {

        String data;
        node next;

        public node(String data) 
        {
            this.data = data;
            this.next = null;

        }
    }

    public node head = null;
    public node tail = null;

    public void addNode(String data) 
    {
        node newnode = new node(data);
        if (head == null) 
        {
            head = newnode;
            tail = newnode;
        } 
        else 
        {

            tail.next = newnode;
            tail = newnode;

        }
    }

    public void display() 
    {
        node current = head;
        if (head == null) 
        {
            System.out.println("List is empty");
            return;
        }

        while (current != null) 
        {

            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println();

    }

    public void CellList() 
    {
        List<String> phones = new ArrayList<String>();
        System.out.println("\n\n-----Cell Phone List-----");
        phones.add("Samsung Galaxy A2 Core");
        phones.add("Samsung Galaxy AO1");
        phones.add("Nokia 3310");
        phones.add("Nokia 1");
        phones.add("Oppo A5s");
        phones.add("Oppo A7");
        phones.add("Huawei Y5 Prime");
        phones.add("Huawei Y6");
        phones.add("Apple iphone SE");
        phones.add("Apple iphone 6");

        Collections.sort(phones);
        String st=phones.toString();
        
        try 
        {
            FileWriter writer = new FileWriter("Record.txt");
            writer.write(st);
            writer.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("error");
            ex.printStackTrace();
        }
        
        try 
        {
            File obj= new File("Record.txt");
            Scanner reader=new Scanner(obj);
            while(reader.hasNextLine())
            {
                    String data=reader.nextLine();
                    System.out.println(data);
            }
            reader.close();
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("error");
            ex.printStackTrace();
        }
        
    }

    public void RateList() 
    {
        List<String> phones = new ArrayList<String>();
        System.out.println("\n\n-----Cell Phone Rate List-----");
        phones.add("Samsung Galaxy A2 Core: Rs. 15000/=");
        phones.add("Samsung Galaxy AO1: Rs. 16500/=");
        phones.add("Nokia 3310: Rs.7750/=");
        phones.add("Nokia 1: Rs. 9500/=");
        phones.add("Oppo A5s: Rs. 21000/=");
        phones.add("Oppo A7: Rs. 32000/=");
        phones.add("Huawei Y5 Prime: Rs. 16000/=");
        phones.add("Huawei Y6: Rs. 13500/=");
        phones.add("Apple iphone SE: Rs. 31500/=");
        phones.add("Apple iphone 6: Rs. 46900/=");

        Collections.sort(phones);
        String ab=phones.toString();
        try 
        {
            FileWriter writer = new FileWriter("Record.txt");
            writer.write(ab);
            writer.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("error");
            ex.printStackTrace();
        }
        
        try 
        {
            File obj= new File("Record.txt");
            Scanner reader=new Scanner(obj);
            while(reader.hasNextLine())
            {
                    String data=reader.nextLine();
                    System.out.println(data);
            }
            reader.close();
        } 
        catch (FileNotFoundException ex) 
        {
            System.out.println("error");
            ex.printStackTrace();
        }
        

       
    }

    public void Sell() 
    {
        Scanner input = new Scanner(System.in);
        methods sell = new methods();
        System.out.print("\nEnter cell phone details from the below mentioned rate list:\n ");
        sell.RateList();
        System.out.print("\nEnter The Model of the Cell Phone: ");
        String model = input.nextLine();
        System.out.print("\nEnter the Rate of the Cell Phone: ");
        String rate = input.nextLine();
        int a = Integer.parseInt(rate);
        System.out.print("\nEnter the Quantity of the Cell Phone: ");
        String quantity = input.nextLine();
        int b = Integer.parseInt(quantity);
        int c = a * b;
        String amount = Integer.toString(c);

        sell.addNode("Phone Model: " + model + "\nRate: Rs. " + rate + "/=\nQuantity: " + quantity + "\nTotal Amount: Rs." + amount + "/=");
        System.out.println("\n:::::::: Bill ::::::::");
        sell.display();
        
        try 
        {
            FileWriter writer = new FileWriter("Record.txt");
            writer.write("Phone Model: " + model + "\nRate: Rs. " + rate + "/=\nQuantity: " + quantity + "\nTotal Amount: Rs." + amount + "/=");
            writer.close();
        } 
        catch (IOException ex) 
        {
            System.out.println("error");
            ex.printStackTrace();
        }

    }
}
