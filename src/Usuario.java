package biblioteca;

public class Usuario {
    private String nombre;
    private String apellido;
    private String correo;
    private String numeroIdentificacion;

    public Usuario(String nombre, String apellido, String correo, String numeroIdentificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.numeroIdentificacion = numeroIdentificacion;
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }
}