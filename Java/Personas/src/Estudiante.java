public class Estudiante extends Persona {

    public Estudiante(String ID, String NOMBRE, String EMAIL, String IDIOMA) {
        super(ID, NOMBRE, EMAIL, IDIOMA);
    }

    @Override
    public void dirigir() {
        setUrl("educursos.com/"+idioma+"/estudiante");
    }
    
    //Inserte acá el método constructor

    //Inserte acá la implementación del método abstracto de la clase padre
}