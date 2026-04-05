public class Main {
    public static void main(String[] args) {
        Thermometer thermometer = new Thermometer();
        double[] temperatures = {-5, 25, 55};
        for (double d : temperatures) {
            try {
                thermometer.checkTemperature(d);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println("Exception caught: " + e.getMessage());
            }
        }
    }
}
