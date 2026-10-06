public class javaB21 {
     public static void main(String[] args) {
        evenOrOdd(10);
        evenOrOdd(12);
        evenOrOdd(20);
        evenOrOdd(34);
        evenOrOdd(99);
    
    }
    static void evenOrOdd(int num)
    {
        if(num % 2 == 0)
            System.out.println(num + " is Even Number.");
        else
            System.out.println(num + " is Odd Number.");
    }
}
