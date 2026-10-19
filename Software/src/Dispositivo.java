public class Dispositivo {

    // Paso 1: atributos privados
    private String nombre;
    private String tipo;
    private boolean activo;

    // Getter y setter de nombre (con validación: no se permite un nombre vacío)
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        }
    }

    // Getter y setter de tipo
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    // Getter y setter de activo (en booleanos el getter se llama isXxx)
    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Desafío adicional: acciones reales
    public void activar() {
        this.activo = true;
    }

    public void desactivar() {
        this.activo = false;
    }
}