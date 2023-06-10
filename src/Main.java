public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weight = 51;
        double height = 1.73;
        int index = (int) service.calculate(51, 1.73);
        System.out.println(index);


    }
}