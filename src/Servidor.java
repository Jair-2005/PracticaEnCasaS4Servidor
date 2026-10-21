public class Servidor {
    private int id;
    private String nombre;
    private String direccionIP;
    private boolean activo;

    private static int totalServidores = 0;
    private static int servidoresActivos = 0;


    public Servidor(String nombre, String direccionIP) {
        totalServidores++;
        this.id = totalServidores;
        this.nombre = nombre;
        this.direccionIP = direccionIP;
        this.activo = false;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccionIP() {
        return direccionIP;
    }

    public boolean isActivo() {
        return activo;
    }

    public void activar() {
        if (!activo) {
            activo = true;
            servidoresActivos++;
        }
    }


    public void desactivar() {
        if (activo) {
            activo = false;
            servidoresActivos--;
        }
    }

    public static int getTotalServidores() {
        return totalServidores;
    }

    public static int getServidoresActivos() {
        return servidoresActivos;
    }

    public void mostrarInfo() {
        System.out.println("ID " + id + " | " + nombre + " | " + direccionIP
                + " | " + (activo ? "activo" : "apagado"));
    }
}
