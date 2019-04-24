package hoon.practice.device;


public class DeviceInit {

	DeviceInterface deviceInterface=null;
    
	public DeviceInit() {
		
		deviceInterface=new DeviceA();
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
		(new DeviceInit(1)).deviceInterface.print();
		(new DeviceInit(2)).deviceInterface.print();
		
	}

}
