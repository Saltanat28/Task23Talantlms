import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int [] massive = new int[10];
        for (int i = 0; i < massive.length; i++) {
            massive[i] += random.nextInt(0 , 2);
            System.out.println(massive[i]);

        }
        Arrays.sort(massive);
        System.out.println(Arrays.toString(massive));
        System.out.println(" Arraylist");

        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            number.add(random.nextInt(0,2 ));
        }
        Collections.sort(number);
        System.out.println(number);




        LinkedList<Integer>number2 = new LinkedList<>();

        System.out.println(" LinkedList ");
        for (int i = 0; i < 5; i++) {
            number2.add(random.nextInt(0,2));
        }
        Collections.sort(number2);
        System.out.println(number2);




    }
}