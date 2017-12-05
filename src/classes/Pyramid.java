
package classes;


public class Pyramid {
    public static void main(String[] args){
        
        for(int i = 0; i <= 5; i++){
            for(int x = 1; x <= (5-i); x++){
                System.out.print("-");
                
            }
            System.out.println("");
        }
        for(int i = 0; i <= 5; i++){
            for(int j = 1; j <= 9; j += 2){
                System.out.print(j);
            }
            System.out.println("");
        }
    }//end main
}//end Pyramid class
