
import java.util.*;

public class arraylistmethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(12);
        list.add(13);
        list.add(21);
        list.add(34);

        list.set(2, 87);

        System.out.println(list);

    }
}
