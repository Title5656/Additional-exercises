package Q3;
abstract class ParcelService{
    String serviceName;
    double weightInKg;
    public ParcelService(double weightInKg, String serviceName){
        this.weightInKg = weightInKg;
        this.serviceName = serviceName;

        if (weightInKg < 0) {
            throw new IllegalArgumentException("Invalid weight: " + weightInKg);
        }
    }
    public abstract double getRatePerKg();
}