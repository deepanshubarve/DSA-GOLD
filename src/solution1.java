import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class solution1 {

    public static int solution1(int age, int amount, int year) {
        // Validate input
        if (age <= 0 || age >= 80 || year <= 0 || year > 5 ||
                amount < 10000 || amount > 50000) {
            return -1;
        }

        // TreeMap for efficient age range lookup with corrected ranges
        TreeMap<Integer, List<Double>> RATE_MAP = new TreeMap<>() {{
            put(1, List.of(0.02, 0.03, 0.04));   // 1-20
            put(21, List.of(0.04, 0.05, 0.06));  // 21-40
            put(41, List.of(0.06, 0.07, 0.08));  // 41-60
            put(61, List.of(0.07, 0.08, 0.09));  // 61-79
        }};

        // Find applicable interest rates
        Map.Entry<Integer, List<Double>> rateEntry = RATE_MAP.floorEntry(age);
        if (rateEntry == null) return -1;

        // Calculate compound interest
        double principal = amount;
        List<Double> rates = rateEntry.getValue();

        for (int i = 0; i < year; i++) {
            principal *= (1 + rates.get(Math.min(i, 2)));
        }

        return (int)(principal - amount);
    }

    public static void main(String[] args) {
        System.out.println(solution1(35, 25000, 3)); // Should print 3938
        System.out.println(solution1(35, 55000, 3)); // Should print -1
    }
}
