package Units;

import java.util.ArrayList;

public class IoTDevice extends Instrument implements Upgradable, Updatable {

	private int numOfIoTDevice;
	private ArrayList<Integer> capacityOfIoTDevice = new ArrayList<>(2);

	public IoTDevice(double price, double capacity, double power, int numOfIoTDevice) {
		super(price, capacity, power);
		if (numOfIoTDevice < 0) {
			this.numOfIoTDevice = 0;
		} else {
			this.numOfIoTDevice = numOfIoTDevice;
		}
		this.capacityOfIoTDevice.add(1);
	}

	public IoTDevice(double unitPrice, double powerCapacity, double powerAmount, double memory, int numOfIoTDevice,
			ArrayList<Integer> capacityOfIoTDevice) {
		super(unitPrice, powerCapacity, powerAmount, memory);
		if (numOfIoTDevice < 0) {
			this.numOfIoTDevice = 0;
		} else {
			this.numOfIoTDevice = numOfIoTDevice;
		}
		this.capacityOfIoTDevice.add(1);
	}

	public int getNumOfIoTDevice() {
		return numOfIoTDevice;
	}

	public void setNumOfIoTDevice(int numOfIoTDevice) {
		this.numOfIoTDevice = numOfIoTDevice;
	}

	public ArrayList<Integer> getCapacityOfIoTDevice() {
		return capacityOfIoTDevice;
	}

	public void setCapacityOfIoTDevice(ArrayList<Integer> capacityOfIoTDevice) {
		this.capacityOfIoTDevice = capacityOfIoTDevice;
	}

	public int calcPowerUsage() {
		int total = 0;
		
		for (int i = 1; i <= capacityOfIoTDevice.size() ; i++) {
			total += i * super.powerAmount;
		}
		
		return total;
	}

	@Override
	public boolean useUnit() {

		System.out.println("The IoTDevice is used and its power decreased as "+ calcPowerUsage() +" points.");

		if (numOfIoTDevice == 0) {
			return false;
		}

		return true;
	}

	public void upgrade() {

		if (numOfIoTDevice == 1) {
			if (capacityOfIoTDevice.size() <= 5) {
				capacityOfIoTDevice.add(1);
			} else {
				numOfIoTDevice++;
			}
		} else {
			capacityOfIoTDevice.add(1);
		}
	}

	@Override
	public String toString() {
		return "IoTDevice => numOfIoTDevice : " + numOfIoTDevice + "  |  capacityOfIoTDevice : " + capacityOfIoTDevice.size()
				+ "  |  powerAmount : " + powerAmount + "  |  memory : " + memory + "  |  unitPrice : " + unitPrice
				+ "  |  powerCapacity : " + powerCapacity + "]";
	}

	@Override
	public void update() {
		System.out.println("Memory before update: " + super.memory);
		super.memory += 20;
		System.out.println("Memory after update: " + super.memory);
	}
}