import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine();

        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            String s = sc.nextLine();
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        int q = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < q; i++) {
            String query = sc.nextLine();
            System.out.println(map.getOrDefault(query, 0));
        }

        sc.close();
    }
}
