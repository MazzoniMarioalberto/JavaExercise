import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        System.out.println(countBits(1234));
        System.out.println(binaryConversion(1234));
    }

    /**
     *
     * @param n int value
     * @return number of bits 1
     */
    public static long countBits(int n){
        return Integer.bitCount(n);
    }

    /**
     *
     * @param n int value to convert in binary
     * @return binary value
     */
    public static long binaryConversion(int n){
        String tmp = "";
        List<Integer> binaryValue = new ArrayList<>();

        while(n>0){
            binaryValue.add(n%2);
            n/=2;
        }
        Collections.reverse(binaryValue);

        for (Integer integer : binaryValue) {
            tmp+=integer;
        }

        return Long.parseLong(tmp);
    }
}
