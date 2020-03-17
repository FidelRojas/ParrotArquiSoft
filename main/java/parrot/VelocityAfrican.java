package parrot;

public class VelocityAfrican implements VelocityCalculator {

	@Override
	public double calculateVelocity(Parrot parrot) {
		return Math.max(0, parrot.getBaseSpeed() - parrot.getLoadFactor() * parrot.numberOfCoconuts);		
	}

}
