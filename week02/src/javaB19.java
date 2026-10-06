public class javaB19 {
    public static void main(String[] args) {
        say();

        int addition = getSum(12, 29);
        System.out.println("The sum is: " + addition);
    }
    static int getSum(int a, int b) {
            int sum = a + b;
            return sum;

        }
    static void say(){
        System.out.println("Hi Bangladesh!");
    }
}
