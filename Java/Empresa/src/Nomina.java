//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.util.ArrayList;
public class Nomina {

    //Inserte acá los atributos
    ArrayList<Trabajador>trabajadores=new ArrayList<>();
    
    public ArrayList<Trabajador> getTrabajadores(){
        return trabajadores;
    }
    //Inserte acá el método constructor
    public void agregarTrabajador(Trabajador t){
        boolean x=false;
        for (int i=0; i<trabajadores.size(); i++){
            if (trabajadores.get(i).getCC().equals(t.getCC())){
                x=true;
            }
        }
        if (x==false){
            trabajadores.add(t);
        }
    }
    
    public void eliminarTrabajador(String ID){
        for (int i=0; i<trabajadores.size(); i++){
            if (trabajadores.get(i).getCC().equals(ID)){
                trabajadores.remove(i);
                break;
            }
        }
    }
    
    public double calcularSalarioQuincenalNomina(){
        double salarioTotal=0;
        for (int i=0; i<trabajadores.size(); i++){
            salarioTotal=salarioTotal+trabajadores.get(i).salarioQuincenal();
        }
        return salarioTotal;
    }
    
    public double salarioQuincenalTrabajador(String ID){
        for (int i=0; i<trabajadores.size(); i++){
            if (trabajadores.get(i).getCC().equals(ID)){
                return trabajadores.get(i).salarioQuincenal();
            }
        }
        
        return -1;
    }
    
    public double promedioEdadNomina(){
        double promedio=0;
        for (int i=0; i<trabajadores.size(); i++){
            promedio=promedio+trabajadores.get(i).calcularEdad();
        }
        return promedio/trabajadores.size();
    }
    
    public double desviacionEstandarEdadNomina(){
        double desviacionEstandar=0;
        for (int i=0; i<trabajadores.size(); i++){
            desviacionEstandar=desviacionEstandar+Math.pow((trabajadores.get(i).calcularEdad()-promedioEdadNomina()),2);
        }
        return Math.pow((desviacionEstandar/trabajadores.size()), 0.5);
    }
    //Inserte acá los SETTERS Y GETTERS

    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)

}