//EL CALIFICADOR GENERARÁ ERROR SI USTED NO IMPLEMENTA TODOS LOS MÉTODOS ESPECIFICADOS EN EL ENUNCIADO
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Trabajador {

    //Inserte acá los atributos

        public String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String CC;

    public String getCC() {
        return CC;
    }

    public void setCC(String CC) {
        this.CC = CC;
    }

    public double salarioPorHora;

    public double getSalarioPorHora() {
        return salarioPorHora;
    }

    public void setSalarioPorHora(double salarioPorHora) {
        this.salarioPorHora = salarioPorHora;
    }

    public int horasTrabajadas;

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int diaNacimiento;

    public int getDiaNacimiento() {
        return diaNacimiento;
    }

    public void setDiaNacimiento(int diaNacimiento) {
        this.diaNacimiento = diaNacimiento;
    }

    public int mesNacimiento;

    public int getMesNacimiento() {
        return mesNacimiento;
    }

    public void setMesNacimiento(int mesNacimiento) {
        this.mesNacimiento = mesNacimiento;
    }

    public int yearNacimiento;

    public int getYearNacimiento() {
        return yearNacimiento;
    }

    public void setYearNacimiento(int yearNacimiento) {
        this.yearNacimiento = yearNacimiento;
    }

    
    //Inserte acá el método constructorh
    public Trabajador(String Nombre, String Cc, double SalarioPorHora, int HorasTrabajadas, int DiaNacimiento, int MesNacimiento, int YearsNacimiento){
        nombre=Nombre;
        CC=Cc;
        salarioPorHora=SalarioPorHora;
        horasTrabajadas=HorasTrabajadas;
        diaNacimiento=DiaNacimiento;
        mesNacimiento=MesNacimiento;
        yearNacimiento=YearsNacimiento;
    }

    //Inserte acá los SETTERS Y GETTERS
    //Inserte acá los métodos (NO LOS GETTER Y SETTERS)
    //*************************************N O  E L I M I N A R  E S T E  M É T O D O*************************************
    public int calcularEdad() {
        LocalDateTime myDateObj = LocalDateTime.now();
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd");
        int diaActual = Integer.valueOf(myDateObj.format(myFormatObj));
        
        DateTimeFormatter myFormatObj2 = DateTimeFormatter.ofPattern("MM");
        int mesActual = Integer.valueOf(myDateObj.format(myFormatObj2));
        
        DateTimeFormatter myFormatObj3 = DateTimeFormatter.ofPattern("yyyy");
        int yearActual = Integer.valueOf(myDateObj.format(myFormatObj3));
        
        if(mesActual > mesNacimiento || mesActual == mesNacimiento && diaActual >= diaNacimiento)
            return yearActual - yearNacimiento;
        
        return yearActual - yearNacimiento - 1;     
    }
    
    public double salarioQuincenal(){
        return getSalarioPorHora()*getHorasTrabajadas();
    }
}