package com.cursor.wh5;

import java.util.Scanner;
/**
 * Created by Vasyl Kachala on 03.07.2019.
 */
public class LibraryService {
    /**
     * Create method libraryCase add case menu:
     */
    public static void libraryCase() {
        Library library = new Library();
        System.out.println("Library");
        System.out.println("/*********************/");
        System.out.println("1 Show all books");
        System.out.println("2 Take book(s)");
        System.out.println("3 Search books if You took by date");
        System.out.println("4 All the books if you took by name(s)");
        System.out.println("5 All the books if you took by date");
        System.out.println("6 Exit");
        Scanner details = new Scanner(System.in);
        int switchCase = details.nextInt();
        do {
            switch (switchCase) {
                case 1:
                    library.showAllBookLibrary();
                    break;
                case 2:
                    library.tookByBook();
                    break;
                case 3:
                    library.searchBookByDate();
                    break;
                case 4:
                    library.showTookHistoryBookData();
                    break;
                case 5:
                    library.showTookHistoryBook();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Error case");
                    break;
            }
            details = new Scanner(System.in);
            switchCase = details.nextInt();
        }
        while (switchCase > 0 && switchCase < 6);
    }
}

