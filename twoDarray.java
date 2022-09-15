import java.util.Scanner;

public class twoDarray {

 
    public static void main(String[] args){  

      String[][] cars =  {
                            {"Camero","Corvette","Silverado" },
                            {"Ranger","F-150", "Ferrari"}, 
                            {"Ferrari", "Lambo", "Tesla"}
                         };

     

      for(int i = 0;i < cars.length; i++ ){
        System.out.println();
        for(int j = 0; j < cars[i].length; j++){
          System.out.print(cars[i][j] + " ");
        }
      }
    }
}