package speedmaster.gold;

@interface CustomAnnotation{
	String value();

	//@CustomAnnotation
	//@CustomAnnotation("Test")
	@CustomAnnotation(value="Test")
	//@CustomAnnotation(value()="Test")
	class test{}
}