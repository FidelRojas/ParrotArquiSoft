package parrot;

public class VelocityEuropean implements VelocityCalculator {

	@Override
	public double calculateVelocity(Parrot parrot) {
		return parrot.getBaseSpeed();
	}

}
