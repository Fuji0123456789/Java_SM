package speedmaster.gold;

/**
 * G3_15_
 */
public class G3_15_assert {
    public static void main(String[] args) {
        int[] list=new int[5];
        list[0]=100;
        list[1]=200;
        list[2]=0;
        list[4]=500;
        assert(getCount(list)<list.length);
        System.out.print(getCount(list));
    }
    static int getCount(int[] list) {
        int count=0;
        for (int i : list) {
            if (i!=0) {
                count++;
            }
        }
        return count;
    }
}
/*
3
*/