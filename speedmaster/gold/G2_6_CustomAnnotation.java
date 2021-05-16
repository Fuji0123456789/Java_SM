package speedmaster.gold;

import java.lang.annotation.*;
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotation{
	int id() default 0;
}