package OOPs;

public class Product {
    static class product{
        static int discount;
        String productname;
        int price;
        int quantity;

        product(String productname,int price,int quantity){
            this.productname=productname;
            this.price=price;
            this.quantity=quantity;
        }

        static void updatediscount(int disc){
           
            discount+=disc;
            
            System.out.println("the updated discount is "+product.discount);
        }
        void realprice(){
            System.out.println("the total price is "+this.price*this.quantity);
            
        }
        void updatedprice(){
            System.out.println("updated price is "+((this.price*this.quantity)-(this.price*this.quantity)*discount/100));


        }
    }
    public static void main(String[] args) {
        product p1 = new product("clothes", 200, 3);
        p1.updatediscount(10);
        p1.realprice();
        p1.updatedprice();
        System.out.println(p1 instanceof product);
    }
    
}
