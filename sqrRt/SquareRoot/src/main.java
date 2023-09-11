import java.lang.reflect.Array;

public class main {
    public static void main(String[] args) throws Exception {
        int hi[] = {1,2,3,1,2,6};
        int he[] = {1,2,3,1,2,6};
        int ho[] = {1,4,1,1,2,5};

        Arrays.toString(hi);
        Arrays.copyOf(hi, 20);
        Arrays.copyOfRange(hi, 1, 4);
        Arrays.fill(hi, 59);
        System.out.println(Arrays.equals(hi, he));
        System.out.println(Arrays.equals(he, ho));

    }
}



