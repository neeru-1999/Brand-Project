package com.brandproject.demoexample;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Brand {
	
	public static void main(String[] args) {
        List<Biscuit> cl = new ArrayList<Biscuit>();
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        int ch;
        do{
            System.out.println("1.Add");
            System.out.println("2.View");
            System.out.println("3.Search");
            System.out.println("4.Update");
            System.out.println("5.Delete");
            System.out.println("Enter your Brand: ");
            ch = sc.nextInt();

            switch(ch){
                case 1:
                    System.out.println("Enter Biscuit number: ");
                    int Number = sc.nextInt();
                    System.out.println("Enter Biscuit name: ");
                    String Name = s1.nextLine();
                    System.out.println("Enter Biscuit price");
                    int Price = sc.nextInt();

                    cl.add(new Biscuit(Number, Name, Price));
                    System.out.println("Stock Added Successfully");
                break;
                case 2:
                    System.out.println("******************************");
                    Iterator<Biscuit> litr = cl.iterator();
                    while(litr.hasNext()){
                        Biscuit b = litr.next();
                        System.out.println(b);
                    }
                    System.out.println("Stock View Successfully");
                    System.out.println("--------------------------------");
                break;
                case 3:
                    boolean isThere = false;
                    System.out.println("Enter number to search: ");
                    int bnumber = sc.nextInt();
                    litr = cl.iterator();
                    while(litr.hasNext()){
                        Biscuit b = litr.next();
                        if(b.getStock()== bnumber){
                            System.out.println(b);
                            isThere = true;
                        }
                    }
                    if(!isThere){
                        System.out.println("Stock not there");
                    }
                break;


                case 4:
                    isThere = false;
                    System.out.println("Enter number to update: ");
                    bnumber = sc.nextInt();
                    ListIterator<Biscuit> ltr = cl.listIterator();
                    while(ltr.hasNext()){
                        Biscuit b = ltr.next();
                        if(b.getStock() == bnumber){
                            System.out.println("Enter new name");
                            Name = s1.nextLine();
                            System.out.println("Enter new price: ");
                            Price = sc.nextInt();


                            ltr.set(new Biscuit(bnumber, Name, Price));
                            isThere = true;
                        }
                    }
                    if(!isThere){
                        System.out.println("Recorded not there");
                    }else{
                        System.out.println("Stock updated successfully");
                    }
                    System.out.println("------------------------------------");
                break;
                case 5:
                    isThere = false;
                    System.out.println("Enter number to delete: ");
                    bnumber = sc.nextInt();
                    litr = cl.iterator();
                    while(litr.hasNext()){
                        Biscuit b = litr.next();
                        if(b.getStock() == bnumber){
                            litr.remove();
                            isThere = true;
                        }
                    }
                    if(!isThere){
                        System.out.println("Stock not there");
                    }else{
                        System.out.println("Stock deleted successfully");
                    }
                    System.out.println("------------------------------------");
                break;
            }
        }while(ch!=0);
    }

}
