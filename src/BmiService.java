public class BmiService {
    public int calculate(int weight, double height) {
        int a = 2;
        double h = Math.pow(height, a);
        double index = weight / h;

        return (int) index;
    }
}
