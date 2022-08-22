package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {

        Book horstmann = new Book("Core Java", 928);
        Book martin = new Book("Clean Code", 464);
        Book sierra = new Book("Head first Java", 720);
        Book eckel = new Book("Thinking in Java", 1150);
        Book[] books = new Book[4];
        books[0] = horstmann;
        books[1] = martin;
        books[2] = sierra;
        books[3] = eckel;
        for (int i = 0; i < books.length; i++) {
            Book pr = books[i];
            System.out.println(pr.getName() + " " + pr.getNumbers());
        }
        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;
        for (int i = 0; i < books.length; i++) {
            Book pr = books[i];
            System.out.println(pr.getName() + " " + pr.getNumbers());
        }
        for (int i = 0; i < books.length; i++) {
            Book pr = books[i];
            if ("Clean Code".equals(pr.getName())) {
                System.out.println(pr.getName());
            }
        }
    }
}
