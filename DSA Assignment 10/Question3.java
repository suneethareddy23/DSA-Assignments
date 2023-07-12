package in.ineuron.main;
import java.util.ArrayList;
import java.util.List;

public class Question3 {
    public static List<String> generateSubsets(String set) {
        List<String> subsets = new ArrayList<>();
        generateSubsetsHelper(set, "", 0, subsets);
        return subsets;
    }

    private static void generateSubsetsHelper(String set, String current, int index, List<String> subsets) {
        if (index == set.length()) {
            subsets.add(current);
            return;
        }

       
        generateSubsetsHelper(set, current, index + 1, subsets);

   
        generateSubsetsHelper(set, current + set.charAt(index), index + 1, subsets);
    }

    public static void main(String[] args) {
        List<String> subsets1 = generateSubsets("abc");
        System.out.println(subsets1);  

        List<String> subsets2 = generateSubsets("abcd");
        System.out.println(subsets2); 
    }
}