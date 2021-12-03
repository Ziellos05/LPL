public abstract class Vehiculo {
    //Inserte acá los atributos
    
    String nombreConductor;
    int nMaximoPasajeros;
    
    public String getNombreConductor(){
        return nombreConductor;
    }
    
    public int getnMaximoPasajeros() {
        return nMaximoPasajeros;
    }

    public void setnMaximoPasajeros(int nMaximoPasajeros) {
        this.nMaximoPasajeros = nMaximoPasajeros;
    }
    
    public int nPasajeros = 0;

    public int getnPasajeros() {
        return nPasajeros;
    }

    public void setnPasajeros(int nPasajeros) {
        this.nPasajeros = nPasajeros;
    }

    
    public double cantidadDinero = 0;

    public double getCantidadDinero() {
        return cantidadDinero;
    }


    public void setCantidadDinero(double cantidadDinero) {
        this.cantidadDinero = cantidadDinero;
    }

    public double localizacionX = 0;

    public double getLocalizacionX() {
        return localizacionX;
    }

    public void setLocalizacionX(double localizacionX) {
        this.localizacionX = localizacionX;
    }

    public double localizacionY = 0;

    public double getLocalizacionY() {
        return localizacionY;
    }

    public void setLocalizacionY(double localizacionY) {
        this.localizacionY = localizacionY;
    }

    public boolean aireAcondicionadoActivado = false;

    public boolean isAireAcondicionadoActivado() {
        return aireAcondicionadoActivado;
    }

    public void setAireAcondicionadoActivado(boolean aireAcondicionadoActivado) {
        this.aireAcondicionadoActivado = aireAcondicionadoActivado;
    }

    public boolean motorEncendido = false;

    public boolean isMotorEncendido() {
        return motorEncendido;
    }

    public void setMotorEncendido(boolean motorEncendido) {
        this.motorEncendido = motorEncendido;
    }

    public boolean wifiEncendido = false;

    public boolean isWifiEncendido() {
        return wifiEncendido;
    }

    public void setWifiEncendido(boolean wifiEncendido) {
        this.wifiEncendido = wifiEncendido;
    }

    public boolean enMarcha = false;

    public boolean isEnMarcha() {
        return enMarcha;
    }

    public void setEnMarcha(boolean enMarcha) {
        this.enMarcha = enMarcha;
    }

    //Inserte acá el método constructor
    public Vehiculo(String NombreConductor) {
        nombreConductor=NombreConductor;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    public abstract void gestionarMarcha();
    
    public void dejarPasajero() {
        int x=getnPasajeros();
        setnPasajeros(x-1);
    }
    public double calcularDistanciaAcopio() {
        double x=getLocalizacionX();
        double y=getLocalizacionY();
        double x2=Math.pow(x, 2);
        double y2=Math.pow(y, 2);
        double d=Math.pow((x2+y2), 0.5);
        return d;
    }
    
    public void gestionarAireAcondicionado(){
        if (isMotorEncendido()==true && isAireAcondicionadoActivado()==false){
            setAireAcondicionadoActivado(true);
        }
        else{
            setAireAcondicionadoActivado(false);
        }
    }
    
    public void gestionarMotor(){
        if (isMotorEncendido()==false){
            setMotorEncendido(true);
        }
        else{
            setMotorEncendido(false);
            setAireAcondicionadoActivado(false);
            setWifiEncendido(false);
            setEnMarcha(false);
        }
    }
    
    public void gestionarWifi(){
        if (isMotorEncendido()==true && isWifiEncendido()==false){
            setWifiEncendido(true);
        }
        else{
            setWifiEncendido(false);
        }
    }
    
    public void moverDerecha(double d){
        if(isEnMarcha()==true){
            double x=getLocalizacionX();
            setLocalizacionX(x+d);
        }
    }
    
    public void moverIzquierda(double d){
        if(isEnMarcha()==true){
            double x=getLocalizacionX();
            setLocalizacionX(x-d);
        }
    }
    
    public void moverArriba(double d){
        if(isEnMarcha()==true){
            double y=getLocalizacionY();
            setLocalizacionY(y+d);
        }
    }
    
    public void moverAbajo(double d){
        if(isEnMarcha()==true){
            double y=getLocalizacionY();
            setLocalizacionY(y-d);
        }
    }
    //Inserte acá los SETTERS Y GETTERS
    
    
    
}