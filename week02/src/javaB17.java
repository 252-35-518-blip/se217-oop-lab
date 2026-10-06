public class javaB17 {
    public static void main(String[] args) {
       String str = "I Love Myself";
       String [] arr = str.split("\\s+");

       for(int i = 0; i < arr.length; i++)
       {
           System.out.println(arr[i]);
       }
    }
}
