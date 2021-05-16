package speedmaster.gold;

import java.util.ArrayList;
import java.util.List;

/**
 * Item
 */
class Item {
    int no;
    int qu;
    public Item(int no,int qu) {
        this.no=no;
        this.qu=qu;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return no+":"+qu;
    }
}
/**
 * G6_5_Stream
 */
public class G6_19_Stream {
    public static void main(String[] args) {
        List<Item> items=new ArrayList<>();
        items.add(new Item(1, 10));
        items.add(new Item(2, 30));
        items.add(new Item(2, 30));
        Item i=items.stream().reduce(new Item(4, 0), (i1,i2)->{
            i1.qu+=i2.qu;
            return new Item(i1.no, i1.qu);
        });
        items.add(i);
        items.stream().parallel().reduce((i1,i2)->i1.qu>i2.qu?i1:i2).ifPresent(System.out::println);
    }
}
/*
4:70
*/