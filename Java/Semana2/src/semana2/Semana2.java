/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

//import java.util.Scanner;
import static semana2.E2.sumaPares;
import static semana2.E3.mean;
import static semana2.E4.ordenamientoPersonalizado;

/**
 *
 * @author ziellos
 */
public class Semana2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner lector = new Scanner (System.in);
//        int factorial = 1;
//        factorial = lector.nextInt();
//        int resultado = 1;
//        for(int i = 2; i <=  factorial; i++){
//            resultado=resultado*i;
//        }
//        System.out.println(resultado);
//        int num=1*2*3*4*5*6*7*8*9*10*11*12*13*14*15*16*17*18;
//        System.out.println(num);
        int vector[] = {0, 2, 1, 65, 66, 78, 12, 11, 90, 13};
        
        int E1 = sumaPares(vector);
        
        double E2 = mean(vector);
        
        int[] E3 = ordenamientoPersonalizado(vector);
        
        System.out.println(E1);
        System.out.println(E2);
        for (int i=0; i<vector.length; i++){
            System.out.print(E3[i]);
        }
    }
    
}