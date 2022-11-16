import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

        ArrayList<Integer> filteredIntList = new ArrayList<>();
        for (int x : intList) {
            if( (x > 0) && (x % 2 == 0) ){
                filteredIntList.add(x);
            }
        }
        filteredIntList.sort(Comparator.naturalOrder());
        for (int res: filteredIntList) {
            System.out.println(res);
        }
    }
}