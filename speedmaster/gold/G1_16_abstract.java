package speedmaster.gold;

abstract class G1_16_abstract {
	abstract void accel(double speed);
	abstract void stop(double speed);
}
/*abstract */class Car1 extends G1_16_abstract{
	@Override
	void accel(double speed) {}
	@Override
	void stop(double speed) {}
}