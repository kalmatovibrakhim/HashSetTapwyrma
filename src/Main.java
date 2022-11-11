import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Set<Integer>hashSet1 = new HashSet<>();
        Set<Integer>hashSet2 = new HashSet<>();
        Set<Integer>hashSymmetric =new TreeSet<>();

        for (int i = 0; i < 10; i++) {
            hashSet1.add(random.nextInt(15));
            hashSet2.add(random.nextInt(15));
        }
        System.out.println(hashSet1);
        System.out.println(hashSet2);

        for (Integer integer : hashSet1) {
            if (hashSet2.contains(integer)){
                continue;
            }else {
                hashSymmetric.add(integer);
            }
        }
        for (Integer integer : hashSet2) {
            if (hashSet1.contains(integer)){
                continue;
            }else {
                hashSymmetric.add(integer);
            }
        }
        System.out.println(hashSymmetric);
    }
}