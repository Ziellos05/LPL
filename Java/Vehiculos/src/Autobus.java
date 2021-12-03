public class Autobus extends Vehiculo{

    @Override
    public void gestionarMarcha() {
        if (isEnMarcha()==false && isPuertaAbierta()==false && isMotorEncendido()==true){
            setEnMarcha(true);
        }
        else{
            setEnMarcha(false);
        }
    }
    
    //Inserte acá los atributos
    
    public boolean puertaAbierta = false;

    public boolean isPuertaAbierta() {
        return puertaAbierta;
    }

    public void setPuertaAbierta(boolean puertaAbierta) {
        this.puertaAbierta = puertaAbierta;
    }

        
    public Autobus(String NombreConductor, int MaximoPasajeros) {
        super(NombreConductor);
        nMaximoPasajeros = MaximoPasajeros;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void recogerPasajero(int estrato){
        if (getnPasajeros()<getnMaximoPasajeros() && isPuertaAbierta()==true){
        //if (getnPasajeros()==0){
            double x=getCantidadDinero();
            double y=calcularPasaje(estrato);
            setCantidadDinero(x+y);
            int z=getnPasajeros();
            setnPasajeros(z+1); 
        }
    }
    
    @Override
    public void dejarPasajero(){
        if(isPuertaAbierta()==true){
            int x=getnPasajeros();
            setnPasajeros(x-1);
        }
    }
    
    public void gestionarPuerta(){
        if (isPuertaAbierta()==false && isEnMarcha()==false){
            setPuertaAbierta(true);
        }
        else{
            setPuertaAbierta(false);
        }
    }
    
    public static double calcularPasaje(int estrato){
        double x;
        switch (estrato) {
            case 1:
            case 2:
            case 0:
                x=1500;
                break;
            case 3:
            case 4:
                x=2600;
                break;
            default:
                x=3000;
                break;
        }
        return x;
    }
    //Inserte acá los SETTERS Y GETTERS
    
    
    
}