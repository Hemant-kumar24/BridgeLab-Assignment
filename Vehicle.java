package OOPs;

public class vehicle {
    static class Vehicle{
        static int fee=100;
        final double regno = 123456;
        String ownername;
        String vehicletype;
        Vehicle(String ownername,String vehicletype){
            this.ownername=ownername;
            this.vehicletype=vehicletype;
            
        }

        void updateregfee(int regfee){
            System.out.println("the reg fee is updated to "+( Vehicle.fee+regfee));
        }
    }
    public static void main(String[] args) {
        Vehicle v = new Vehicle("BHAVTOSH", "BIKE");
        v.updateregfee(100);
        System.out.println(v instanceof Vehicle);
    }
    
}
