public class SIMCard{
    //Inserte acá los atributos
    
    public String numeroTelefono;
    
    public String empresaTelefonia = "HI";
    
    public double saldo = 0;
    
    public boolean celularApagado = true;

    public boolean modoAvionActivado = false;

    public boolean datosActivados = false;

    public int saldoDatos = 0;
    
    //Inserte acá el método constructor

    public SIMCard(String numero) {
        numeroTelefono = numero;
    }
    
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    
    public void comprarDatos (int c){
        if (c<=10){
            if((c*3000)>=getSaldo()){
                double x=getSaldo();
                setSaldo(x-(c*3000));
                int y=getSaldoDatos();
                setSaldoDatos(y+c);                
            }
        }
        else if (c>30){
            if((((c-20)*1500)+(20*3000))>=getSaldo()){
                double x=getSaldo();
                setSaldo(x-((((c-20)*1500)+(20*3000))));
                int y=getSaldoDatos();
                setSaldoDatos(y+c); 
            }
        }
        else{
            if((((c-10)*2500)+(10*3000))>=getSaldo()){
                double x=getSaldo();
                setSaldo(x-((((c-10)*2500)+(10*3000))));
                int y=getSaldoDatos();
                setSaldoDatos(y+c); 
        }    
            }
    }
    
    public void consumirDatos (int c){
        if (isCelularApagado()==false && isModoAvionActivado()==false && isDatosActivados()==true && c<=getSaldoDatos()){
            int x=getSaldoDatos();
            setSaldoDatos(x-c);
        }
    }
    
    public void llamar (int s){
        if (isCelularApagado()==false && isModoAvionActivado()==false){
            double x=getSaldo();
            if (s<=60){
                setSaldo(x-s);    
            }
            else{
                setSaldo(x-60-((s-60)/2));
            }
        }
    }
    
    public void recargarSaldo (double s){
        double x=getSaldo();
        setSaldo(x+s);
    }
    
    public void gestionarEncendidoCelular (){
        if (isCelularApagado()==true){
            setCelularApagado(false);
        }
        else{
            setCelularApagado(true);
            setModoAvionActivado(false);
            setDatosActivados(false);
        }
    }
    
    public void gestionarModoAvion (){
        if (isCelularApagado()==false){
            if (isModoAvionActivado()==false){
                setModoAvionActivado(true);
                setDatosActivados(false);
            }
            else{
                setModoAvionActivado(false);
            }
        }
    }
    
    public void gestionarDatos (){
        if (isCelularApagado()==false && isModoAvionActivado()==false){
            if (isDatosActivados()==false){
                setDatosActivados(true);
            }
            else{
                setDatosActivados(false);
            }
        }
    }
    //Inserte acá los SETTERS Y GETTERS
    
    public String getEmpresaTelefonia() {
        return empresaTelefonia;
    }
    public void setEmpresaTelefonia(String empresaTelefonia) {
        this.empresaTelefonia = empresaTelefonia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public boolean isCelularApagado() {
        return celularApagado;
    }
    public void setCelularApagado(boolean celularApagado) {
        this.celularApagado = celularApagado;
    }
    public boolean isModoAvionActivado() {
        return modoAvionActivado;
    }
    public void setModoAvionActivado(boolean modoAvionActivado) {
        this.modoAvionActivado = modoAvionActivado;
    }
    public boolean isDatosActivados() {
        return datosActivados;
    }
    public void setDatosActivados(boolean datosActivados) {
        this.datosActivados = datosActivados;
    }
    public int getSaldoDatos() {
        return saldoDatos;
    }
    public void setSaldoDatos(int saldoDatos) {
        this.saldoDatos = saldoDatos;
    }
    public String getNumeroTelefono(){
        return numeroTelefono;
    }
}