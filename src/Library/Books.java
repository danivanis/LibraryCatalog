package Library;

import javax.swing.*;
import java.awt.print.Book;
import java.sql.ClientInfoStatus;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Books {

    String name;
    Integer page;

    public Books (String name, Integer page){
        this.name = name;
        this.page = page;
    }

    public Books() {
        this.name = name;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public Integer getPage() {
        return page;
    }

    public void add(){

        ArrayList<Books> list = new ArrayList<Books>();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Please enter the name of the book (do write STOP when no entries are left): ");
            String name = scan.next();
            if(name.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.println("Please enter the number of pages from your book: ");
            Integer page = scan.nextInt();
            var x = new Books(name, page);
            list.add(x);
        }

        System.out.println("Below you can find the book details:");

        for (Books all : list){
            System.out.println(all.getName() + " - " + all.getPage() + " pages");
        }
    }


    public void remove(){

        List<String> list = new ArrayList<>();
        list.add("Alfa");
        list.add("Omega");
        list.add("Tetra");
        System.out.println("Now that you've added new books, some old ones need to be removed. \nThe old books are : " + list);
        System.out.println();
        Scanner scan = new Scanner(System.in);
        System.out.println("Which book do you want to remove?");
        String name = scan.nextLine();

        list.remove(name);

        System.out.println("The remaining books are : " + list);



    }

}
