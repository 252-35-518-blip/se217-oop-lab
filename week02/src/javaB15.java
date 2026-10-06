public class javaB15 {
      public static void main(String[] args) {
        int sum = 0;
        int a[][] = {{9, 2, 1}, {8, 7, 6}};
        for(int i =0; i<2; i++){
            for(int j =0; j<3; j++){
                System.out.print(a[i][j] + " ");
                sum += a[i][j];
            }
            System.out.println();
        }
        System.out.println("average value: " + (double)sum / 6);
    }
}
