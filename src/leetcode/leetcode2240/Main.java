package leetcode.leetcode2240;

public class Main {
    public static void main(String[] args) {
        String input = "04";
        System.out.println(Main.doService(input));

    }

    private static boolean doService(String input){
        if (input == null) return false;
        switch (input) {
            case "00":
            case "01":
            case "02":
            case "03":
                return true;
            default:
                return false;
        }
    }
}