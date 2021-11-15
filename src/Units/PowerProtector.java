package Units;

public class PowerProtector extends Unit implements Upgradable {

	protected double powerLevel;
	protected boolean isHeld;

	public PowerProtector(double unitPrice, double powerCapacity, double powerLevel) {
		super(unitPrice, powerCapacity);
		if( powerLevel <= 0){
			this.powerLevel = 0;
		}
		else{
			this.powerLevel = powerLevel;
		}
		isHeld = false;
	}

	public double getPowerLevel() {
		return powerLevel;
	}

	public boolean isHeld() {
		return isHeld;
	}

	@Override
	public boolean useUnit() {
		
		isHeld = true;

		return isHeld;
	}

	@Override
	public String toString() {
		return "PowerProtector => Power Level : " + powerLevel + "  |  unit Price : " + unitPrice
				+ "  |  Power Capacity : " + powerCapacity;
	}

	public double deCharge(double powerUsage) {
		if (isHeld){
			if (powerLevel >= powerUsage) {
				powerLevel -= powerUsage;

				return 0;
			} else {
				powerUsage -= powerLevel;
				powerLevel = 0;
				return powerUsage;
			}
		}
	}

	public void upgrade() {
		this.powerLevel += 100;
	}
}
