class Persona {
    public String nombre;
    public  int edad;
    public String sexo;

    
    public Persona(String nombre, int edad, String sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
}

class Usuario extends Persona {
    private String correo;
    private String contrasena;

    
    public Usuario(String nombre, int edad, String sexo,
                   String correo, String contrasena) {

        super(nombre, edad, sexo); 
        this.correo = correo;
        this.contrasena = contrasena;
    }

    
    public void informacionUsuario() {
        System.out.println("=== Información del Usuario ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Sexo: " + sexo);
        System.out.println("Correo: " + correo);
        System.out.println("Contraseña: " + contrasena);
    }
}

public class App {
    public static void main(String[] args) {

        
        Usuario usuario1 = new Usuario(
                "Juan Pérez",
                25,
                "Masculino",
                "juan@gmail.com",
                "12345"
        );

        
        usuario1.informacionUsuario();
    }
}