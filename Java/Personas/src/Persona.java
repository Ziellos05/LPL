public abstract class Persona {

    
    public String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
   
    public String nombre;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
    public String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String idioma;

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    
    public Persona(String ID, String NOMBRE, String EMAIL, String IDIOMA) {
        id=ID;
        nombre=NOMBRE;
        email=EMAIL;
        idioma=IDIOMA;
    }

    
    public String url = "educursos.com";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public abstract void dirigir();
    //Inserte acá los atributos
    
    //Inserte acá el método constructor
    
    //Inserte acá los SETTERS Y GETTERS
    
    //Inserte acá el método abstracto
    
}
