package hoon.practice.interface;


public class DeviceInit {

	DeviceInterface deviceInterface=null;
    
	public DeviceInit() {
		
		deviceInterface=new DeviceInput();
	}
	public DeviceInit(int type) {
		
		switch(type)
		{
			case 1:
				deviceInterface=new DeviceA();
				break;
			case 2:
				deviceInterface=new DeviceB();
				break;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		(new Device(1)).deviceInterface.print();
		(new Device(2)).deviceInterface.print();
		
	}

}
