package Q3;

public class FlashService extends ParcelService implements Billable {
    final double ship = 100;
    public FlashService(double weightInKg){
        super(weightInKg, "Flash" );
        
    }   

    public double calculateBill(){
        return weightInKg * getRatePerKg();
    }
    
    public double getRatePerKg(){
        return ship;

    }
    public double getWeight(){
        return weightInKg;
    }
    
}
