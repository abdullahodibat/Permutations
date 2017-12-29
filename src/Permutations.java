import java.util.ArrayList;
import java.util.List;

/**
 * Created by abdullahodibat on 29.12.17.
 */
public class Permutations {

    static List<String> permutations = new ArrayList<>();

    public static void main(String[] args) {
        calculatePermutations("12345", 0, 4);
        System.out.println(permutations.size());
    }

    private static void calculatePermutations(String str, int start, int end) {
        if (start == end) {
            permutations.add(str);
        } else {
            for (int i = start; i <= end; i++) {
                str = swap(str, start, i);
                calculatePermutations(str, start + 1, end);
            }
        }
    }

    private static String swap(String s, int i, int j) {
        char[] chars = s.toCharArray();
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
        return String.valueOf(chars);
    }
}

