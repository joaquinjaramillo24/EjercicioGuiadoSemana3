public class Producto {

    // Atributos de instancia (cada objeto tiene los suyos)
    private int id;
    private String nombre;
    private double precio;
    private String categoria;

    // Paso 5: atributo de clase (uno solo para todos los objetos)
    private static int contador = 0;

    // Pasos 2 y 3: constructor
    public Producto(String nombre, double precio, String categoria) {
        this.nombre = nombre;
        setPrecio(precio);          // reutiliza la validación del setter
        this.categoria = categoria;

        // Paso 6 y desafío: contador e ID automático
        contador++;
        this.id = contador;
    }

    // Paso 7: método static
    public static int getTotalCreados() {
        return contador;
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio >= 0) {
            this.precio = precio;
        }
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}