/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana2;

/**
 *
 * @author ziellos
 */
class E3{
    public static double mean(int [] vector){
        double promedio=0;
        for (int i=0; i<vector.length; i++){
            promedio=promedio+vector[i];
        }
        promedio=promedio/vector.length;
        
        
        
        
        
        return promedio;
    }
}
