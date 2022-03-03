public class FunWith2DArrays {

    public static int totalElements(int[][] lists){
        return lists.length*lists[0].length;
    }

    public static void fourCorners(String[][] lists){
        System.out.println(lists[0][0]);
        System.out.println(lists[0][lists[0].length-1]);
        System.out.println(lists[lists.length-1][0]);
        System.out.println(lists[lists.length-1][lists[lists.length-1].length-1]);
    }

    public static double average(int[][] lists){
        int total = 0;
        for (int[] row : lists){
            for (int col : row){
                total += col;
            }
        }
        return (double)total / (lists.length * lists[0].length);
    }

    public static int[] indexFound(String[][] lists, String target){
        for (int row = 0; row < lists.length; row++){
            for (int col = 0; col < lists[0].length; col++){
                if (lists[row][col].equals(target)){
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
