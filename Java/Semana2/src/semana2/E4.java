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
class E4 {
    public static int [] ordenamientoPersonalizado(int [] vector){
        int vectorOrdenado[] = vector;
        int x;
        for (int j=0; j<(vectorOrdenado.length/2); j++){
            for (int i=1; i<(vectorOrdenado.length/2); i++){
                if (vectorOrdenado[i]<vectorOrdenado[i-1]){
                    x=vectorOrdenado[i-1];
                    vectorOrdenado[i-1]=vectorOrdenado[i];
                    vectorOrdenado[i]=x;
                }
            }
        }
        for (int k=((vectorOrdenado.length/2)+1); k<vectorOrdenado.length; k++){
            for (int i=((vectorOrdenado.length/2)+1); i<vectorOrdenado.length; i++){
                if (vectorOrdenado[i]>vectorOrdenado[i-1]){
                    x=vectorOrdenado[i-1];
                    vectorOrdenado[i-1]=vectorOrdenado[i];
                    vectorOrdenado[i]=x;
                }
            }
            
        }
        return vectorOrdenado;
    }
}   
