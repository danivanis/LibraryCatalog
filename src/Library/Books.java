package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Books {

    public String name;
    public Integer page;
    public ArrayList<String> list;

    public Books(String name, Integer page){
        this.name = name;
        this.page = page;
    }

    public String getName() {
        return this.name;
    }

    public Integer getPage() {
        return this.page;
    }

    public void bookName{
        System.out.println("Please enter the name of the book:");
    }

    public void bookPage{
        System.out.println("Please enter the number of pages the book is having:");
    }

    public void add(){

        list = new ArrayList<String>();
        Scanner scan = new Scanner();

        System.out.println("Please specify the number of books you want to add:");
        int n = Integer.parseInt(scan.nextLine());
        int i = 0;

        while (i++ <= n){
            System.out.println(bookName);
            String name = scan.nextLine();
            System.out.println(bookPage);
            Integer page = scan.nextInt();
        }

    }

    public void display(){

        if (list.isEmpty()){
            System.out.println("There are no books in the list");
        } else {
            for (int i=0; i <= list.size(); i++){
                System.out.println(list.get(i));
            }
        }
    }

    public void remove(){
        System.out.println("Which book do you want to remove?");
        Scanner scan = new Scanner();
        String n = scan.nextLine();
        list.remove(n);

        System.out.println("The remaining books are:" + /n list);
    }

}

