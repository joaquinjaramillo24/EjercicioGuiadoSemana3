public class Main {
    public static void main(String[] args) {

        // Paso 2: esto NO compila si el atributo es private
        // dispositivo1.nombre = "Router";

        // Paso 8: usar los setters (dos objetos)
        Dispositivo dispositivo1 = new Dispositivo();
        dispositivo1.setNombre("Router");
        dispositivo1.setTipo("Red");
        dispositivo1.setActivo(true);

        Dispositivo dispositivo2 = new Dispositivo();
        dispositivo2.setNombre("Cámara");
        dispositivo2.setTipo("Seguridad");
        dispositivo2.setActivo(false);

        // Paso 9: usar los getters
        System.out.println("--- Dispositivo 1 ---");
        System.out.println(dispositivo1.getNombre());
        System.out.println(dispositivo1.getTipo());
        System.out.println(dispositivo1.isActivo());

        System.out.println("--- Dispositivo 2 ---");
        System.out.println(dispositivo2.getNombre());
        System.out.println(dispositivo2.getTipo());
        System.out.println(dispositivo2.isActivo());

        // Paso 10: dato incorrecto (nombre vacío)
        dispositivo1.setNombre("");
        System.out.println("--- Después de setNombre(\"\") ---");
        System.out.println(dispositivo1.getNombre());

        // Desafío: acciones
        dispositivo2.activar();
        dispositivo1.desactivar();
        System.out.println("--- Después de activar/desactivar ---");
        System.out.println(dispositivo1.getNombre() + " activo: " + dispositivo1.isActivo());
        System.out.println(dispositivo2.getNombre() + " activo: " + dispositivo2.isActivo());
    }
}