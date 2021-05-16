package speedmaster.gold;

//import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * G3_1_try_catch_finally
 */
class G3_4_throws_super {
    void func() throws IOException{}
}
public class G3_04_throws extends G3_4_throws_super {
    void func(){}
}
/*
public class G3_4_throws_1 extends G3_4_throws_super {
    void func() throws IOException{}
}
public class G3_4_throws_2 extends G3_4_throws_super {
    void func() throws FileNotFoundException{}
}
*/
