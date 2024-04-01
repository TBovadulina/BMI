public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double height = 1.87;
        double weight = 98;
        double index = service.calculate(height, weight); // должно получится 28
        int bmi = (int) Math.round(index);
        System.out.println("bmi = " + bmi);
    }
}