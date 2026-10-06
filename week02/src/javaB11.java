public class javaB11 {
    
   public static void main(String[] args) {
      int var1 = 0;

      for(int var2 = 5; var2 <= 100; var2 += 5) {
         var1 += var2;
      }

      System.out.println("Sum of numbers from 5 to 100 with step of 5: " + var1);
   }
}
