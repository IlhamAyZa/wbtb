package work;

/* *********** Pledge of Honor ************************************************


*

* I hereby certify that I have completed this lab assignment on my own

* without any help from anyone else. I understand that the only sources of authorized

* information in this lab assignment are (1) the course textbook, (2) the

* materials  posted at the course website and (3) any study notes handwritten by myself.

*

* I have not used, accessed or received any information from any other unauthorized

* source in taking this lab assignment. The effort in the assignment thus belongs

* completely to me.

*

*  READ AND SIGN BY WRITING YOUR NAME SURNAME AND STUDENT ID

*  SIGNATURE:   <Ilham Aydazada, 0074562>

* 

********************************************************************************/

import java.util.ArrayList;
import java.util.List;

import Units.IoTDevice;
import Units.Laptop;
import Units.PowerProtector;
import Units.Unit;
import Units.Upgradable;
import Units.memoryProtector;

public class Test {

	public static void main(String[] args) {

		System.out.println("Total number of Instruments before creating units: " + Unit.getUnitQuantity());
		System.out.println();

		List<Unit> Units = new ArrayList<Unit>();

		// Initialize PowerProtector, Laptop and IoTDevice objects
		PowerProtector Pow = new PowerProtector(200, 800, 500);
		Laptop Lap = new Laptop(60, 100, 20);
		IoTDevice IoT = new IoTDevice(30, 50, 10, 1);

		Units.add(Pow);
		Units.add(Lap);
		Units.add(IoT);

		System.out.println("Total number of Instruments after creating units: " + Unit.getUnitQuantity());
		System.out.println();

		// print all the units
		for (int i = 0; i < Units.size(); ++i) {
			System.out.println(Units.get(i));
			System.out.println();
		}

		// use powerProtector
		Pow.useUnit();
		Pow.deCharge(50);
		System.out.println(Pow);
		System.out.println();

		// Upgrade the powerProtector and print its information
		Pow.upgrade();
		System.out.println();
		System.out.println("powerProtector is upgraded");
		System.out.println(Pow);
		System.out.println();

		// Use the Laptop and print its information
		Lap.useUnit();
		System.out.println(Lap);
		System.out.println();

		// Use the IoTDevice
		IoT.useUnit();

		// Print the IoTdevice(s)'s information before and after an upgrade
		System.out.println(IoT);
		System.out.println();
		IoT.upgrade();
		System.out.println("IoTDevice(s) is upgraded");
		System.out.println(IoT);

		System.out.println();

		// Define an IoTDevice object with no IoTdevice

		IoTDevice IoT1 = new IoTDevice(50, 30, 8, 0);
		System.out.println(IoT1);
		System.out.println();

		// upgrade it
		IoT1.upgrade();
		System.out.println("IoTDevice is upgraded");
		System.out.println(IoT1);

		System.out.println();

		// Upgrade until a second IoTDevice is given

		for (int i = 0; i <= 5; ++i) {
			IoT1.upgrade();
			System.out.println("IoTDevice is upgraded");
		}

		System.out.println();

		System.out.println(IoT1);

		///////////////// IN LAB //////////////

		System.out.println("____________________ In lab assignment ____________________");

		// 1
		System.out.println();

		memoryProtector memP = new memoryProtector(150, 420, 275);

		System.out.println(memP.useUnit());
		System.out.println(memP.useMemory(512));
		memP.update();

		// 3

		System.out.println();
		ArrayList<Upgradable> arrLofUnits = new ArrayList<>();

		arrLofUnits.add(new IoTDevice(40, 60, 10, 1));
		arrLofUnits.add(new IoTDevice(50, 80, 12, 1));
		arrLofUnits.add(new IoTDevice(60, 100, 14, 2));
		arrLofUnits.add(new IoTDevice(70, 120, 16, 2));

		arrLofUnits.add(new PowerProtector(360, 1500, 800));

		for (Upgradable ugr : arrLofUnits) {

			System.out.println("Before PolyUpgrade: ");
			System.out.println(ugr.toString());

			polyUpgrade(ugr);
			System.out.println();

			System.out.println("After PolyUpgrade: ");
			System.out.println(ugr.toString());
			System.out.println();
		}
	}

	public static Upgradable polyUpgrade(Upgradable obj) {

		obj.upgrade();
		obj.upgrade();
		obj.upgrade();
		obj.upgrade();
		obj.upgrade();

		return obj;
	}
}
