package classcode;

public class LoopExamples {
    public static void main(String[] args) {
        whileLoopExample();
    }

    private static void whileLoopExample() {
        int count = 5;

        while (count > 0) {
            System.out.println(count--);
        }
    }
}
