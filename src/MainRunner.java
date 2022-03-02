import java.util.Arrays;

public class MainRunner {
    public static void main(String[] args){
        String[][] seatingChart ={
                        {"Abby", "Don", "George", "Kim"},
                        {"Brian", "Elenor", "Harry", "Lenny"},
                        {"Cathy", "Fred", "Jill", "Matt"}
        };

        for(String[] row : seatingChart){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        seatingChart[1][2] = "Paul";

        for(String[] row : seatingChart){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;

        for(String[] row : seatingChart){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        String[] temp2 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp2;

        for(String[] row : seatingChart){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        System.out.println(seatingChart[0][2] + seatingChart[2][0]);
        System.out.println();

        int[][] arr1 = new int[2][3];
        int[][] arr2 = new int[3][2];

        arr1[0][0] = 1;
        arr1[0][1] = 2;
        arr1[0][2] = 3;
        arr1[1][0] = 4;
        arr1[1][1] = 5;
        arr1[1][2] = 6;

        for(int[] row : arr1){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        arr2[0][0] = 1;
        arr2[0][1] = 4;
        arr2[1][0] = 2;
        arr2[1][1] = 5;
        arr2[2][0] = 3;
        arr2[2][1] = 6;

        for(int[] row : arr2){
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        System.out.println(arr1[0][2] + arr2[2][0]);
        System.out.println();

        int[][] list1 = {
                {5, 2},
                {1, 3},
                {7, 9}
        };

        System.out.println(FunWith2DArrays.totalElements(list1));
        System.out.println();

        int[][] list2 = {
                {}
        };

        System.out.println(FunWith2DArrays.totalElements(list2));
        System.out.println();

        String[][] list3 = {
                {"hi", "bye", "stuff", "go"},
                {"time", "up", "you", "good"},
                {"map", "low", "bow", "mom"}
        };

        FunWith2DArrays.fourCorners(list3);
        System.out.println();

        String[][] list4 = {
                {"time", "up", "bye"},
                {"hi", "hit", "up"},
                {"map", "bam", "low"},
                {"bow", "mom", "joy"}
        };

        FunWith2DArrays.fourCorners(list4);
        System.out.println();
    }
}
