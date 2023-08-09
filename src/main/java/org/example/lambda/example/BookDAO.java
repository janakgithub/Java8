package org.example.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List getBooks(){
        List<Book> book = new ArrayList<>();
        book.add(new Book(101,"IT Dept", 4800));
        book.add(new Book(45,"HR Dept", 3067));
        book.add(new Book(32,"ABC Dept", 3670));
        book.add(new Book(154,"OPP Dept", 3000));

        return book;
    }

}
