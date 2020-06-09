package com.example.mylibrary;

import java.util.ArrayList;

public class Util {
    private static ArrayList<Book> button1;
    private static ArrayList<Book> button2;
    private static ArrayList<Book> button3;
    private static ArrayList<Book> button4;
    private static ArrayList<Book> button5;

    private static int id = 0;

    public Util() {
        if (button1 == null) {
            button1 = new ArrayList<>();
            initAllBooks();
        }

        if (button2 == null) {
            button2 = new ArrayList<>();
        }
        if (null == button3) {
            button3 = new ArrayList<>();
        }
        if (null == button4) {
            button4 = new ArrayList<>();
        }

    }


    public static ArrayList<Book> getButton1() {
        return button1;
    }

    public static ArrayList<Book> getButton2() {
        return button2;
    }

    public static ArrayList<Book> getButton3() {
        return button3;
    }

    public static ArrayList<Book> getButton4() {
        return button4;
    }

    public static ArrayList<Book> getButton5() {
        return button5;
    }

    public boolean addCurrentlyReadingBook(Book book) {
        return button2.add(book);
    }

    public boolean addWantToReadBook(Book book) {
        return button3.add(book);
    }

    public boolean addAlreadyReadBook(Book book) {
        return button4.add(book);
    }

    public boolean removeCurrentlyReadingBook(Book book) {
        return button2.remove(book);

    }

    public boolean removeWantToReadBook(Book book) {
        return button3.remove(book);

    }

    public boolean removeAlreadyReadBook(Book book) {
        return button4.remove(book);

    }

    private static void initAllBooks() {


        String name = "";
        String author = "";
        int pages = 0;
        String imageUrl = "";
        String description = "";

        id++;
        name = "Wings of fire";
        author = "APJ Abdul Kalam";
        pages = 576;
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcScif-JhKkirJZ6_Xo1VshaMATPafMHJtDh5Ql3WBhtMbK90DrW&usqp=CAU";
        description = "Very popular book";

        id++;
        name = "Street Zen: The Life and Work of Issan Dorsey";
        author = "David Schneider";
        pages = 116;
        imageUrl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1586222101l/48576307._SX98_.jpg";
        description = "Very popular book";

        id++;
        name = "Shirley Jackson: A Rather Haunted Life";
        author = "Ruth Franklin";
        pages = 776;
        imageUrl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1590514530l/30039170._SX98_.jpg";
        description = "Very popular book";

        id++;
        name = "The Diary of a Young Girl";
        author = "Anne Frank";
        pages = 276;
        imageUrl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1560816565i/48855._SY75_.jpg";
        description = "Very popular book";

        id++;
        name = "Everything Beautiful in Its Time";
        author = " Jenna Bush Hager ";
        pages = 676;
        imageUrl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1579614367l/51822870._SX98_SY160_.jpg";
        description = "Very popular book";

        id++;
        name = "Night (The Night Trilogy";
        author = "Elie Wiesel";
        pages = 376;
        imageUrl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1575073611i/1617._SY75_.jpg";
        description = "Very popular book";

        id++;
        name = "Wings of fire";
        author = "APJ Abdul Kalam";
        pages = 176;
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcScif-JhKkirJZ6_Xo1VshaMATPafMHJtDh5Ql3WBhtMbK90DrW&usqp=CAU";
        description = "Very popular book";

        id++;
        name = "Wings of fire";
        author = "APJ Abdul Kalam";
        pages = 536;
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcScif-JhKkirJZ6_Xo1VshaMATPafMHJtDh5Ql3WBhtMbK90DrW&usqp=CAU";
        description = "Very popular book";

        id++;
        name = "Wings of fire";
        author = "APJ Abdul Kalam";
        pages = 570;
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcScif-JhKkirJZ6_Xo1VshaMATPafMHJtDh5Ql3WBhtMbK90DrW&usqp=CAU";
        description = "Very popular book";

        id++;
        name = "Wings of fire";
        author = "APJ Abdul Kalam";
        pages = 575;
        imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcScif-JhKkirJZ6_Xo1VshaMATPafMHJtDh5Ql3WBhtMbK90DrW&usqp=CAU";
        description = "Very popular book";

        id++;
        name = "Shirley Jackson: A Rather Haunted Life";
        author = "Ruth Franklin";
        pages = 57;
        imageUrl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1590514530l/30039170._SX98_.jpg";
        description = "Very popular book";


        id++;
        name = "Shirley Jackson: A Rather Haunted Life";
        author = "Ruth Franklin";
        pages = 576;
        imageUrl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1590514530l/30039170._SX98_.jpg";
        description = "Very popular book";

        id++;
        name = "The Diary of a Young Girl";
        author = "Anne Frank";
        pages = 76;
        imageUrl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1560816565i/48855._SY75_.jpg";
        description = "Very popular book";
        id++;
        name = "The Diary of a Young Girl";
        author = "Anne Frank";
        pages = 579;
        imageUrl = "https://i.gr-assets.com/images/S/compressed.photo.goodreads.com/books/1560816565i/48855._SY75_.jpg";
        description = "Very popular book";

    }
}
