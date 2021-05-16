package speedmaster.gold;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class G6_03_Stream{
    public static void main(String[] args) {
        List<Book> b=Arrays.asList(
            new Book("Platinum:"),
            new Book("Gold:"),
            new Book("Silver:")
        );
        Stream<Book> str=b.stream();

        //gold.Book@63961c42gold.Book@65b54208gold.Book@1be6f5c3
        //str.forEach(System.out::print);

        //str.forEachOrderd(System.out::print);

        //Platinum:Gold:Silver:
        str.map(a->a.title).forEach(System.out::print);

        //str.map(a->a).forEachOrderd(System.out::print);
    }
}
class Book{
    String title;
    Book(String title){
        this.title=title;
    }
}
/*
Platinum:Gold:Silver:
*/