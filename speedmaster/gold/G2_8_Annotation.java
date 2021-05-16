package speedmaster.gold;

import java.lang.annotation.Repeatable;

//MultiAnnotation cannot be resolved to a typeJava(16777218)
//Duplicate annotation of non-repeatable type @MultiAnnotation. Only annotation types marked @Repeatable can be used multiple times at one target.Java(16778113)
@G2_8_MultiAnnotation
@G2_8_MultiAnnotation
/**
 * G2_8_Annotation
 */
public class G2_8_Annotation {}

@Repeatable(G2_8_MultiAnnotationHandler.class)
@interface G2_8_MultiAnnotation {}
@interface G2_8_MultiAnnotationHandler{
	G2_8_MultiAnnotation[] value();
}
