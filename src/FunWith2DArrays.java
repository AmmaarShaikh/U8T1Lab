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
}
