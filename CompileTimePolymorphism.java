public class Main
{


    class  FoodOrder{
        void calculateBill(int foodPrice){
           System.out.println("The Total Bill is:"+ foodPrice);
            
        }
        
        void calculateBill(int foodPrice, int delieveryCharge){
            System.out.println("The Total Bill is:" + (foodPrice+delieveryCharge));
        }
        
        void calculateBill(int foodPrice,int delieveryCharge, int discount){
            System.out.println("The Total Bill is:" + (delieveryCharge+foodPrice-discount) );
        }
    }
    
    public static void main(String[] args){
        Main outer =new Main();
        FoodOrder order =   outer.new FoodOrder();
        order.calculateBill(120);
        order.calculateBill(120,30);
        order.calculateBill(120,30,20);
    }




}
