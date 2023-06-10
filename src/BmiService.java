public class BmiService {
    public int calculate(int weight, double height) {
        double h = Math.pow(1.73,2);
        double index = weight/ h;

        return (int) index;
    }


}
