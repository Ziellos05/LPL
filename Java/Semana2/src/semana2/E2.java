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
public class E2{
    public static int sumaPares(int [] vector){
        int s=0;
        for (int i=0; i<vector.length; i++){
            if(vector[i]%2==0 && vector[i]>0){
                s=s+vector[i];
            }
        }
        
        
        
        
        
        return s;
    }
}