package Units;

public class PowerProtector extends Unit implements Upgradable {

	protected double powerLevel;
	protected boolean isHeld;

	public PowerProtector(double unitPrice, double powerCapacity, double powerLevel) {
		super(unitPrice, powerCapacity);
		this.powerLevel = powerLevel;
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
		if (isHeld) {
			isHeld = false;
		} else {
			isHeld = true;
		}

		return isHeld;
	}

	@Override
	public String toString() {
		return "PowerProtector => Power Level : " + powerLevel + "  |  unit Price : " + unitPrice
				+ "  |  Power Capacity : " + powerCapacity;
	}

	public double DeCharge(double powerUsage) {
		if (powerLevel >= powerUsage) {
			powerLevel -= powerUsage;

			return 0;
		} else {
			powerUsage -= powerLevel;
			powerLevel = 0;
			return powerUsage;
		}
	}

	public void upgrade() {
		this.powerLevel += 100;
	}
}
