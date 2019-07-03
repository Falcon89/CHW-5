package com.cursor.wh5;

import java.util.*;
/**
 * Created by Vasyl Kachala on 03.07.2019.
 */
public class Library {
    Map<String, String> lib = new HashMap<>();
    Map<String, String> history = new HashMap<>();
    /**
     * Create method libraryBook Map lib.put
     */
    public void libraryBook() {
        lib.put("2019-02-03", "Number the Stars");
        lib.put("2018-01-06", "The Chronicles of Narnia");
        lib.put("2019-06-16", "Winnie-the-Pooh");
        lib.put("2018-02-23", "Bridge to Terabithia");
        lib.put("2018-12-21", "Mary Poppins");
        lib.put("2019-02-13", "Northern Lights");
        lib.put("2018-10-14", "The Ogre Downstairs");
        lib.put("2019-08-18", "The Marvelous Land of Oz");
        lib.put("2019-06-26", "Heights by Emily Bronte");
        lib.put("2018-02-10", "Twilight by Stephenie Meyer");
        lib.put("2018-01-10", "Leaving Time");
        lib.put("2019-04-19", "Until the End of Time");
    }
    /**
     * Create method showAllBookLibrary
     */
    public void showAllBookLibrary() {
        libraryBook();
        Set set = lib.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Book: " + entry.getKey() + " || " + entry.getValue());
        }
    }
    /**
     * Create method tookByBook
     */
    public void tookByBook() {
        history.put("2019-02-13", "Northern Lights");
        history.put("2018-10-14", "The Ogre Downstairs");
        history.put("2019-08-18", "The Marvelous Land of Oz");
        history.put("2018-02-10", "Twilight by Stephenie Meyer");
        System.out.println("You take book for name: " + history.values());
    }
    /**
     * Create method searchBookByDate
     */
    public void searchBookByDate() {
        libraryBook();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date like 2019-02-13");
        String dat = scanner.next();
        String value = lib.get(dat);
        if (value != null) {
            System.out.println(lib.get(dat));
        } else if (value == null) {
            System.out.println("For this date there were no books taken");
        }
    }
    /**
     * Create method showTookHistoryBookData
     */
    public void showTookHistoryBookData() {
        Set set = history.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Book take " + entry.getKey());
        }
        System.out.println("You don't have a book");
    }
    /**
     * Create method showTookHistoryBook
     */
    public void showTookHistoryBook() {
        Set set = history.entrySet();
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry entry = (Map.Entry) iterator.next();
            System.out.println("Book take " + entry.getValue());
        }
        System.out.println("You don't have a book");
    }
}

