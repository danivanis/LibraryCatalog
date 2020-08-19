package Library;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Is the book in paper format? (Yes/No)");
        String paperFormat = scan.nextLine();

        if(paperFormat.equalsIgnoreCase("yes")) {
            ArtAlbums artAlbums1 = new ArtAlbums();
            artAlbums1.add();
        }
        Novels novel1 = new Novels();
        novel1.add();


        Books books1 = new Books();
        System.out.println();
        books1.remove();

    }
}

