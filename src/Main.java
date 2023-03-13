import BmiService.BmiService;

public class Main {

    public static void main(String[] args) {
        BmiService service = new BmiService();
        int weightInKg = 100;
        double heightInMetr = 1.80;
        int imt = service.calculate(weightInKg, heightInMetr);
        System.out.println(imt);
    }
}