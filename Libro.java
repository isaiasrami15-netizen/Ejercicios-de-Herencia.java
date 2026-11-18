class Libro {
    public String titulo;
    public String autor;
    public int anio;

  
    public Libro(String titulo, String autor, int anio) {
        this.titulo = titulo;
        this.autor = autor;
        this.anio = anio;
    }
}

class LibroDigital extends Libro {
    private String formato;
    private double tamanoMB;

    public LibroDigital(String titulo, String autor, int anio,
                        String formato, double tamanoMB) {
        super(titulo, autor, anio); 
        this.formato = formato;
        this.tamanoMB = tamanoMB;
    }

    
    public void mostrarInfo() {
        System.out.println("=== Información del Libro Digital ===");
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Año: " + anio);
        System.out.println("Formato: " + formato);
        System.out.println("Tamaño: " + tamanoMB + " MB");
    }
}

public class App {
    public static void main(String[] args) {

        
        LibroDigital libro1 = new LibroDigital(
                "Java Básico",
                "Juan Pérez",
                2024,
                "PDF",
                15.8
        );

        
        libro1.mostrarInfo();
    }
}
