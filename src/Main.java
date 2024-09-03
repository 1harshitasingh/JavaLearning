import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= 100; ++i) {
            list.add(i);
        }

        for (int element: list) {
            System.out.println(element);
        }
    }
}