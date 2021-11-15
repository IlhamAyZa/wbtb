package Units;

public class Instrument extends Unit {

	protected double powerAmount;
	protected double memory;

	public Instrument(double unitPrice, double powerCapacity, double powerAmount, double memory) {
		super(unitPrice, powerCapacity);

		if (powerAmount < 0) {
			powerAmount = 0;
		} else {
			this.powerAmount = powerAmount;
		}
		
		this.memory = memory;
	}
	
	public Instrument(double unitPrice, double powerCapacity, double powerAmount) {
		super(unitPrice, powerCapacity);

		if (powerAmount < 0) {
			powerAmount = 0;
		} else {
			this.powerAmount = powerAmount;
		}
	}

	public double getPowerAmount() {
		return powerAmount;
	}

	@Override
	public String toString() {
		return "instrument price : " + super.getUnitPrice() + "  |  capacity : " + super.getPowerCapacity()
				+ "  |  powerAmount : " + powerAmount;
	}

	@Override
	public boolean useUnit() {
		return false;
	}
}
