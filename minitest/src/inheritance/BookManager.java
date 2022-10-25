package inheritance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BookManager {
    public static List<Book> bookList = new ArrayList<>();


    public static void main(String[] args) {

        bookList.add(new ProgrammingBook(11111, "Clean Code", 335.000, "Robert Martin", "English", "A"));
        bookList.add(new ProgrammingBook(22222, "Code Complete", 269.000, "Steve McConnell", "English", "A"));
        bookList.add(new ProgrammingBook(33333, "The Pragmatic Programmer", 290.000, "Dave Thomas", "English", "B"));
        bookList.add(new ProgrammingBook(44444, "Head First Java", 200.000, "Kathy Sierra", "Java", "C"));
        bookList.add(new ProgrammingBook(55555, "Programming Pearls", 300.000, "Jon Bentley", "Java", "C"));

        bookList.add(new FictionBook(66666, "It Ends with Us", 329.000, "Colleen Hoover", "Novel"));
        bookList.add(new FictionBook(77777, "Verity", 300.000, "Colleen Hoover", "Novel"));
        bookList.add(new FictionBook(88888, "Fairy Tale", 350.000, "Stephen King", "Fiction"));
        bookList.add(new FictionBook(99999, "Frankenstein", 400.000, "Mary Shelley", "Fiction"));
        bookList.add(new FictionBook(10101, "The Time Machine", 58.000, "H. G. Wells", "Fiction"));
        display();
        sumPrice();
        countJava();
        countFiction();
        countPrice();


    }
    public static void display() {
        for (int i = 0; i < bookList.size(); i++) {
            System.out.println(bookList.get(i).toString());
        }
        System.out.println();
    }
    public static void sumPrice(){
        double sumPrice = 0;
        for (int i = 0; i < bookList.size(); i++) {
            sumPrice += bookList.get(i).getPrice();
        }
        System.out.println(sumPrice);
    }

    public static void countJava(){
        int count = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i) instanceof ProgrammingBook ){
                if(((ProgrammingBook) bookList.get(i)).getLanguage().equals("Java")){
                    count++;
                }
            }
        }
        System.out.println("Có " + count + " ProgammingBook có language 'Java'");
    }

    public static void countFiction(){
        int count = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i) instanceof FictionBook ){
                if(((FictionBook) bookList.get(i)).getCategory().equals("Fiction")){
                    count++;
                }
            }
        }
        System.out.println("Có " + count + " FictionBook có catelory 'Fiction'");
    }

    public static void countPrice(){
        int count = 0;
        for (int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i) instanceof FictionBook ){
                if(((FictionBook) bookList.get(i)).getPrice() < 100){
                    count++;
                }
            }
        }
        System.out.println("Có " + count + " FictionBook có giá < 100");
    }
}
