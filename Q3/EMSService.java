package Q3;

public class EMSService extends ParcelService implements Billable {
    final double ship = 50;
    public EMSService(double weightInKg){
        super(weightInKg, "EMS" );
        
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
