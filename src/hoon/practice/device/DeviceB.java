package hoon.practice.device;

public class DeviceB implements DeviceInterface{

	public DeviceB() {
	}
	@Override
	public int print() {
		System.out.println(this.getClass().getName() + " Print");
		return 0;
	}
	@Override
	public int stop() {
		return 0;
	}
	@Override
	public int init() {
		return 0;
	}
	@Override
	public int getStatus() {
		return 0;
	}

}
