public class Thermometer {
    double celsius;
    public void checkTemperature(double celsius){
        if (celsius < 0 || celsius > 50) {
            throw new IllegalArgumentException("Temperature out of safe range: " + celsius);
        }else{
            System.out.println("Temperature is OK: " + celsius);
        }
    }
}