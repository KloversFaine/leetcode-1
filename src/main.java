import java.util.Arrays;

public class main {
    public static void main(String[] args)
    {
        solution sol = new solution();
        int input[] = {1,2,3};
        System.out.println(Arrays.toString(sol.twoSum(input, 4)));

        int input2[] = {1, 2, 3, 4, 2, 3, 4};
        System.out.println(sol.kuaizi(input2));

        System.out.println(sol.powerfulIntegers(2, 3, 10));
    }
}
