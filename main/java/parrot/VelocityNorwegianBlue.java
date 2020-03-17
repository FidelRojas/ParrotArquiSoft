package parrot;

public class VelocityNorwegianBlue implements VelocityCalculator {

	@Override
	public double calculateVelocity(Parrot parrot) {
		return (parrot.isNailed) ? 0 : parrot.getBaseSpeed(parrot.voltage);
	}

}
