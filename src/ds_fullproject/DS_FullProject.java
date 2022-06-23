package ds_fullproject;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DS_FullProject
{
    
    public static void main(String[] args)
    {
       Scanner input= new Scanner(System.in);
       methods obj= new methods();
       
       try
       {
           File make= new File("Record.txt");
           if(make.createNewFile())
           {
               try 
               {
                    FileWriter writer = new FileWriter("Record.txt");
                    writer.write("15713");
                    writer.close();
                } 
               catch (IOException ex) 
               {
                    System.out.println("error");
                    ex.printStackTrace();
               }
           }
           else
           {
               try 
               {
                    FileWriter writer = new FileWriter("Record.txt");
                    writer.write("15713");
                    writer.close();
                } 
               catch (IOException ex) 
               {
                    System.out.println("error");
                    ex.printStackTrace();
               }
           }
       }
       catch(IOException e)
       {
           System.out.println("Error");
           e.printStackTrace();
       }
       
       
       
       System.out.println("-----------------------------------------------------------------------------");
       System.out.println("-----------------Welcome To The Cell Phone Management System-----------------");
       System.out.println("-----------------------------------------------------------------------------");
                        
                      
       System.out.println("\n");
       System.out.println("\n");
       System.out.println("\n"); 
       System.out.println(":::::::::Login Here:::::::::");
       System.out.println("\n");
       System.out.println("\n * Kindly ptovide the credentials to proceed:");
        
        
        try
        {
            File obj1= new File("Record.txt");
            Scanner reader=new Scanner(obj1);
            while(reader.hasNextLine())
            {
                     String data=reader.nextLine();
                     String use=data.toString();
                    System.out.println("\n");
                    System.out.print("User Name: ");
                    String my_user_name= input.nextLine();
        
                    System.out.print("Password: ");
                    String my_password= input.nextLine();
        
                if("Zaki".equalsIgnoreCase(my_user_name) && use.equals(my_password))
                {
                    int a;
                    do 
                    {
                        System.out.println("\n---------MAIN MENU---------"
				+ "\nPress '1' to view the Cell Phone List"
				+ "\nPress '2' to Sell any Cell Phone"
				+ "\nPress '3' to Exit\n");
                
                        System.out.print("Enter Your Choice Here: ");
                
                        a = input.nextInt();
                        if(a==1)
                        {
                            obj.CellList();
                        }
                        else if(a==2)
                        {
			 obj.Sell();
                        }
                        else if(a==3)
                        {   
                            System.out.println("\n");
                        
                            System.out.println("::: GOOD BYE :) :::");
                    
                            System.out.println("\n");
                        }
                    
                    }	
                        while(a!=3);
                }
                else
                {
                    System.out.println("Invalid Login!");
                }
        
           }
            reader.close();
        }
        catch (FileNotFoundException ex) 
        {
            System.out.println("error");
            ex.printStackTrace();
        }
    }
    
}
