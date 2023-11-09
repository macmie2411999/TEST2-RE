import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Set Samples
        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(2, 7, 11, 15));
        Integer target1 = 9;

        ArrayList<Integer> arrayList2 = new ArrayList<>(Arrays.asList(3, 2, 4));
        Integer target2 = 7;

        ArrayList<Integer> arrayList3 = new ArrayList<>(Arrays.asList(3, 7, 8, 9, 16, 10));
        Integer target3 = 19;

        ArrayList<Integer> arrayList4 = new ArrayList<>(Arrays.asList(5, 3, 7, 8));
        Integer target4 = 600;

        // Result Object
        ResultTEST2 resultTEST2 = new ResultTEST2(-1, -1);

        // Test
        testResultComplex(arrayList1, target1, resultTEST2);
        testResultComplex(arrayList2, target2, resultTEST2);
        testResultComplex(arrayList3, target3, resultTEST2);
        testResultComplex(arrayList4, target4, resultTEST2);

        // Test
        testResultOptimize(arrayList1, target1, resultTEST2);
        testResultOptimize(arrayList2, target2, resultTEST2);
        testResultOptimize(arrayList3, target3, resultTEST2);
        testResultOptimize(arrayList4, target4, resultTEST2);
    }

    public static void testResultComplex(ArrayList<Integer> listNumber, Integer target, ResultTEST2 resultTEST2) {
        // Check Conditions
        if(!checkConditions(listNumber, target)){
            return;
        }

        // Call Algo
        Boolean booleanResult = AlgoTEST2.findTwoSumComplex(listNumber, target, resultTEST2);

        if (booleanResult){
            System.out.println("0(n2) - " + resultTEST2.toString());
        } else{
            System.out.println("0(n2) - " + "No such pair found.");
        }
    }

    public static void testResultOptimize(ArrayList<Integer> listNumber, Integer target, ResultTEST2 resultTEST2) {
        // Check Conditions
        if(!checkConditions(listNumber, target)){
            return;
        }

        // Call Algo
        Boolean booleanResult = AlgoTEST2.findTwoSumOptimize(listNumber, target, resultTEST2);

        if (booleanResult){
            System.out.println("Less than 0(n2) - " +  resultTEST2.toString());
        } else{
            System.out.println("Less than 0(n2) - " + "No such pair found.");
        }
    }

    public static boolean checkConditions(ArrayList<Integer> listNumber, int target) {
        // Check the length condition
        if (!(2 <= listNumber.size() && listNumber.size() <= 104)) {
            System.out.println("Invalid length condition.");
            return false;
        }

        // Check the range condition for each element in listNumber
        for (int ele : listNumber) {
            if (!(-109 <= ele && ele <= 109)) {
                System.out.println("Invalid range condition for listNumber.");
                return false;
            }
        }

        // Check the range condition for target
        if (!(-109 <= target && target <= 109)) {
            System.out.println("Invalid range condition for target.");
            return false;
        }

        // All conditions are satisfied
        return true;
    }
}