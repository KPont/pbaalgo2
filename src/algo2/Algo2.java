/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algo2;

/**
 *
 * @author Kasper
 */
public class Algo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(getSquareRoot(1337.5f));
    }

    public static float getSquareRoot(float x){
        float result = 0;
        for (float i = 0; i < x; i++) {
            
            if((i * i) == x){
                return i;
            }
            else if((i * i) > x){
                do{
                    i -= 0.05f;
                }while((i * i) > x);
                while((i * i) < x && (i * i) != x){
                    i += 0.001f;
                    System.out.println(i);
                }  
                if((i * i) > x){
                    i -= 0.001f;
                }
                while((i * i) < x && (i * i) != x){
                    i += 0.0001f;
                    System.out.println(i);
                }
                if((i * i) > x){
                    i -= 0.0001f;
                }
                while((i * i) < x && (i * i) != x){
                    i += 0.00001f;
                    System.out.println(i);
                }
                if((i * i) > x){
                    i -= 0.00001f;
                }
                result = i;
                return result;
            }
            
        }
        return result;
    }
}
