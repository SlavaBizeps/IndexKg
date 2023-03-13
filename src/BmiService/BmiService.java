package BmiService;

public class BmiService {

    public int calculate(int weightInKg , double heightInMetr) {
                return (int) (weightInKg / heightInMetr / heightInMetr);

    }
}
