package speedmaster.gold;

@interface Customer{
	String name();
	String type() default "visitor";

	//@Customer
	//@Customer(name="Duke")
	//@Customer(name="Duke")
	@Customer(name="Duke",type="visitor")
	class test{}
}