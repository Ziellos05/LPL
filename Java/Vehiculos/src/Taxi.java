public class Taxi extends Vehiculo{

    @Override
    public void gestionarMarcha() {
        if(isEnMarcha()==false && isSegurosActivados()==true){
            setEnMarcha(true);
        }
        else{
            setEnMarcha(false);
        }
    }
    //           ^ (Taxi hereda de Vehiculo)
    //Inserte acá los atributos
    
    
    public double distanciaRecorrida = 0;

    public double getDistanciaRecorrida() {
        return distanciaRecorrida;
    }

    public void setDistanciaRecorrida(double distanciaRecorrida) {
        this.distanciaRecorrida = distanciaRecorrida;
    }

    public boolean segurosActivados = false;

    public boolean isSegurosActivados() {
        return segurosActivados;
    }

    public void setSegurosActivados(boolean segurosActivados) {
        this.segurosActivados = segurosActivados;
    }

    
    //Inserte acá el método constructor
    
    public Taxi(String NombreConductor) {
        super(NombreConductor);
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void reiniciarTaximetro(){
        setDistanciaRecorrida(0);
    }
    
    public void presionarBotonPanico(){
        setEnMarcha(false);
        setSegurosActivados(false);
        setnPasajeros(0);
    }
    
    public void dejarPasajero(){
        if(getnPasajeros()==1){;
            setnPasajeros(0);
            double y=this.calcularPasaje();
            double z=getCantidadDinero();
            setCantidadDinero(z+y);
        }
    }
    
    public void recogerPasajero(){
        if(getnPasajeros()==0 && isEnMarcha()==false){
            setnPasajeros(1);
        }    
    }
    
    
    
    //Inserte acá los SETTERS Y GETTERS

    @Override
    public void moverAbajo(double d) {
        super.moverAbajo(d); //To change body of generated methods, choose Tools | Templates.
        if(isEnMarcha()==true && getnPasajeros()==1){
            double x=getDistanciaRecorrida();
            setDistanciaRecorrida(x+d);
        }
    }

    @Override
    public void moverArriba(double d) {
        super.moverArriba(d); //To change body of generated methods, choose Tools | Templates.
        if(isEnMarcha()==true && getnPasajeros()==1){
            double x=getDistanciaRecorrida();
            setDistanciaRecorrida(x+d);
        }
    }

    @Override
    public void moverIzquierda(double d) {
        super.moverIzquierda(d); //To change body of generated methods, choose Tools | Templates.
        if(isEnMarcha()==true && getnPasajeros()==1){
            double x=getDistanciaRecorrida();
            setDistanciaRecorrida(x+d);
        }
    }

    @Override
    public void moverDerecha(double d) {
        super.moverDerecha(d); //To change body of generated methods, choose Tools | Templates.
        if(isEnMarcha()==true && getnPasajeros()==1){
            double x=getDistanciaRecorrida();
            setDistanciaRecorrida(x+d);
        }
    }
    
    public double calcularPasaje(){
        double x=2300*getDistanciaRecorrida();
        return x+3000;
    }
    
    public void gestionarSeguros(){
        if(isEnMarcha()==false && isSegurosActivados()==true){
            setSegurosActivados(false);
        }
        else{
            setSegurosActivados(true);
        }
    }
}