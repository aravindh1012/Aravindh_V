import java.util.*;

public class Problem_4 {
    public static void main(String[] args) {
        divisibleAndCount();

    }

    public static void divisibleAndCount() {
        Map <Integer, Integer> map = new HashMap<>();
        
        int[] arr = {1, 2, 8,9,12,46,76,82,15,20,30};
        int[] divisible = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        
        for(int value : arr) {
            for(int div : divisible) {
                if(value % div == 0) {
                    map.put(div, map.getOrDefault(div, 0) + 1);
                }
            }
        }

        System.out.println("divisible count: ");
        for(int i = 0; i < divisible.length; i++) {
            int div = divisible[i];
            System.out.print(div + ":" + map.getOrDefault(div, 0));
            if(i != divisible.length - 1) {
                System.out.print(", ");
            }
        }


    }
}
