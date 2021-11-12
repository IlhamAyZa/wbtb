package Units;

public abstract class Unit {

	protected static int num_0f_units = 0;
	protected double unitPrice;
	protected double powerCapacity;

	public Unit(double unitPrice, double powerCapacity) {

		if (unitPrice <= 0) {
			this.unitPrice = 0;
		} else {
			this.unitPrice = unitPrice;
		}

		if (powerCapacity <= 0) {
			this.powerCapacity = 0;
		} else {
			this.powerCapacity = powerCapacity;
		}

		num_0f_units++;
	}

	public static int getUnitQuantity() {
		return num_0f_units;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public double getPowerCapacity() {
		return powerCapacity;
	}

	public void setPowerCapacity(double powerCapacity) {
		this.powerCapacity = powerCapacity;
	}

	public abstract boolean useUnit();
}