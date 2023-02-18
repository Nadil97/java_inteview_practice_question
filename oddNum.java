import java.util.Arrays;
import java.util.List;

public class oddNum {
    public static boolean containsOnlyOddNumbers(List <Integer> list){
        for(int i : list){
            if (i % 2 ==0)
                return false;

        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(containsOnlyOddNumbers(Arrays.asList(5,7,9)));
    }
    
}
