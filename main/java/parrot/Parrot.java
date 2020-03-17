package parrot;

public class Parrot {

    public ParrotTypeEnum type;
    public int numberOfCoconuts = 0;
    public double voltage;
    public boolean isNailed;


    public Parrot(ParrotTypeEnum _type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = _type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public double getSpeed() {
    	VelocityCalculator v = createVelocityCalculator();
        
        return v.calculateVelocity(this);
    }
    private VelocityCalculator createVelocityCalculator() {
    	VelocityCalculator v =null;
    	switch(type) {
        case EUROPEAN:
        	v= new VelocityEuropean();
        	return v;
        case AFRICAN:
        	v= new VelocityAfrican();
        	return v;
        case NORWEGIAN_BLUE:
        	v= new VelocityNorwegianBlue();
        	return v;
    	}
    	throw new RuntimeException("Should be unreachable");
    	
    	
    }; 

    public double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage*getBaseSpeed());
    }

    public double getLoadFactor() {
        return 9.0;
    }

    public double getBaseSpeed() {
        return 12.0;
    }


}
