package basic.c08_oop.inheritanceExer;

public class DeviceExer {
    
    public static class Device {
        public Device() {
            System.out.println("Device created");
        }
    }
    
    public static class Phone extends Device {
        public Phone() {
            super();
            System.out.println("Phone ready");
        }
    }
}
