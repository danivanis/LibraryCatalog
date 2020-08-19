package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Novels extends Books {

    @Override
    public void add() {

        ArrayList<Books> list = new ArrayList<Books>();
        Scanner scan = new Scanner(System.in);

        while(true){
            System.out.println("Please enter the name of the novel (do write STOP when no entries are left): ");
            String name = scan.next();
            if(name.equalsIgnoreCase("stop")) {
                break;
            }
            System.out.println("Please enter the number of pages from your novel: ");
            Integer page = scan.nextInt();
            var x = new Books(name, page);
            list.add(x);
        }

        System.out.println("Below you can find the novel details:");

        for (Books all : list){
            System.out.println(all.getName() + " - " + all.getPage() + " pages");
        }

    }
}
