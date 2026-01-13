public class Main {
    
    interface OnlinePayment {
       
        void makePayment();
    }
    
    
    static class Person {
        
        void login() {
            System.out.println("User has logged in");
        }
    }
    
    static class Customer extends Person {
        void placeOrder() {
            System.out.println("User placed the order");
        }
    }
    
    static class DeliveryApp extends Customer implements OnlinePayment {
        @Override
        public void makePayment() {
            System.out.println("Payment done online");
        }

        void trackOrder() {
            System.out.println("Tracking order");
        }
    }
    
    public static void main(String[] args) { 
        DeliveryApp app = new DeliveryApp();
        app.login();
        
        app.placeOrder(); 
        
        app.makePayment();
        app.trackOrder();
    }
}
