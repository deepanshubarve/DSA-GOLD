import java.util.*;

public class Frankenstein {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Map<String, List<List<String>>> recipes = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String input = sc.nextLine().trim();
            String[] parts = input.split("=");
            String potion = parts[0].trim();
            String[] ingredients = parts[1].split("\\+");
            recipes.putIfAbsent(potion, new ArrayList<>());
            recipes.get(potion).add(Arrays.asList(ingredients));
        }
        String targetPotion = sc.nextLine().trim();
        Map<String, Integer> memo = new HashMap<>();
        System.out.println(minOrbs(targetPotion, recipes, memo));
    }
    private static int minOrbs(String potion, Map<String, List<List<String>>> recipes, Map<String, Integer> memo) {
        if (!recipes.containsKey(potion)) {
            return 0;
        }
        if (memo.containsKey(potion)) {
            return memo.get(potion);
        }
        int minOrbs = Integer.MAX_VALUE;
        for (List<String> recipe : recipes.get(potion)) {
            int orbsForRecipe = recipe.size() - 1;
            for (String ingredient : recipe) {
                orbsForRecipe += minOrbs(ingredient.trim(), recipes, memo);
            }
            minOrbs = Math.min(minOrbs, orbsForRecipe);
        }

        // Store the result in memo and return it
        memo.put(potion, minOrbs);
        return minOrbs;
    }
}
