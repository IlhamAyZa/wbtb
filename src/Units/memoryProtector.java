package Units;

public class memoryProtector extends Unit implements Updatable {
	
	private double memoryLevel ;
	private boolean isHeld ;

	public memoryProtector(double price, double capacity, double memoryLevel) {
		super(price, capacity);
		
		if(memoryLevel <= 0) {
			this.memoryLevel = 0;
		}
		else {
			this.memoryLevel = memoryLevel;
		}
	}

	@Override
	public void update() {
		System.out.println("BEFORE: " + memoryLevel);
		
		memoryLevel += 256;
		
		System.out.println("AFTER: " + memoryLevel);
	}

	public double useMemory(double memoryUsage) {
		if(isHeld) {
			if(memoryLevel >= memoryUsage) {
				memoryLevel -= memoryUsage;
				return 0;
			}
			else {
				memoryLevel = 0;
				return memoryUsage - memoryLevel;
			}
		}
		else {
			return memoryUsage;
		}
	}

	@Override
	public boolean useUnit() {
		return false;
	}
		
}
