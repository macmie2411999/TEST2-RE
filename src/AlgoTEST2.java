import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class AlgoTEST2 {
    // O(n2) time complexity
    public static Boolean findTwoSumComplex(ArrayList<Integer> listNumber, Integer target, ResultTEST2 resultTEST2) {
        Integer size = listNumber.size();
        for (int firstIndex = 0; firstIndex < size; firstIndex++) {
            for (int secondIndex = firstIndex + 1; secondIndex < size; secondIndex++) {
                if ((listNumber.get(firstIndex) + listNumber.get(secondIndex)) == target) {
                    resultTEST2.setNumberOne(firstIndex);
                    resultTEST2.setNumberTwo(secondIndex);
                    return true;
                }
            }
        }
        return false; // Return false if no such pair is found
    }

    // Less than O(n2) time complexity
    public static Boolean findTwoSumOptimize(ArrayList<Integer> listNumber, Integer target, ResultTEST2 resultTEST2) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int ele : listNumber) {
            if (map.containsKey(target - ele)) {
                System.out.println(map.get(target - ele));

                resultTEST2.setNumberOne(map.get(target - ele));
                resultTEST2.setNumberTwo(listNumber.indexOf(ele));
                return true;
            } else {
                map.put(ele, listNumber.indexOf(ele));
            }
        }

        return false; // Return false if no such pair is found
    }

}