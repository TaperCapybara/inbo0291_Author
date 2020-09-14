package ru.mirea.inbo0219_2_1;
import java.lang.*;

public class TestAuthor {
    public static void main(String[] args) {
        Author a1 = new Author("Simon", "simon.i.v@gmail.com", 'M');
        Author a2 = new Author("Jess", "jess.email@email.com", 'F');
        Author a3 = new Author("Fiona", "helloimtrans@mail.ru", 'U');
        System.out.println(a1);
        System.out.println(a3);
    }
}
