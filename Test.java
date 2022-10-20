public class Test {
    public static void main(String[] args) {
        // System.out.println("Testing here");
        int valueA = 20;
        float valueB = 80f;

        valueA += 33; // valueA + 33

        int examsScore = 80;

        String studentInitial = "D";


        if (examsScore >= 50 || studentInitial == "A") {
            System.out.println("Passed with A");
        } else if (examsScore >= 60) {
            System.out.println("Passed with B");
        } else {
            System.out.println(" failed");
        }

        // System.out.println("Hello world" + (valueA + valueB));
    }
}
