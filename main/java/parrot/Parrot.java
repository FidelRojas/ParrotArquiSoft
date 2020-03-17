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
        switch(type) {
            case EUROPEAN:
            	VelocityEuropean velocityEuropian= new VelocityEuropean();
            	return velocityEuropian.calculateVelocity(this);
            case AFRICAN:
            	VelocityAfrican velocityAfrican= new VelocityAfrican();

                return velocityAfrican.calculateVelocity(this);
            case NORWEGIAN_BLUE:
            	VelocityNorwegianBlue velocityNorwegianBlue= new VelocityNorwegianBlue();

                return velocityNorwegianBlue.calculateVelocity(this);
                
        }
        throw new RuntimeException("Should be unreachable");
    }

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
