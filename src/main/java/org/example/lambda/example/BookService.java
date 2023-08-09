package org.example.lambda.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSortOrder(){
      List<Book> bookList =  new BookDAO().getBooks();
//      Collections.sort(bookList, new Comparator<Book>() {
//          @Override
//          public int compare(Book o1, Book o2) {
//              return o1.getDepartment().compareTo(o2.getDepartment());
//          }
//      });
//        return bookList;

        Collections.sort(bookList, (e1,e2)->e1.getDepartment().compareTo(e2.getDepartment()));

      return bookList;
    }

    public static void main(String[] args) {
        BookService bookService = new BookService();
        System.out.println(bookService.getBooksInSortOrder());
    }
}
