package speedmaster.gold;

import java.lang.annotation.*;
@Target(ElementType.METHOD)
@interface CheckAnnotation{
	int id();
	String name() default "-";
}
/**
 * G2_7_CustomAnnotation
 */
public class G2_7_CustomAnnotation {
	@CheckAnnotation(name = "Duke",id = 100)
	public void func(){}
}