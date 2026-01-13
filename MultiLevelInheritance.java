class Device {
    void powerOn() {
        System.out.println("Device powered on");
    }
}

class Mobile extends Device {
    void call() {
        System.out.println("Making a phone call");
    }
}

class SmartPhone extends Mobile {
    void useInternet() {
        System.out.println("Browsing the internet");
    }
}

public class Main {
    public static void main(String[] args) {
        SmartPhone phone = new SmartPhone();
        phone.powerOn();
        phone.call();
        phone.useInternet();
    }
}
