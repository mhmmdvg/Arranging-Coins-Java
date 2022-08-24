import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> coins = new ArrayList<Integer>();
        //Adding elements in the List
        coins.add(2);
        coins.add(5);
        coins.add(8);
        coins.add(4);


        for (int i = 0; i < coins.size(); i++) {
            int left = 1;
            int right = coins.get(i);
            int n = coins.get(i);

            for(int j = 0; left <= right; j++ ) {
//            while (left <= right) {
                int mid = (left + right) / 2;
                int sum = mid * (mid + 1) / 2;
                if (sum == n) {
                    System.out.println(mid);
                } else if (sum > n) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
//            }
            }
            System.out.println(right);
        }
    }
}

