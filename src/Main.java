//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Servidor s1 = new Servidor("ServidorWeb", "192.168.1.20");
        Servidor s2 = new Servidor("ServidorBD", "192.168.1.21");
        Servidor s3 = new Servidor("ServidorArchivos", "192.168.1.22");

        System.out.println("Al crear -> total: " + Servidor.getTotalServidores()
                + " | activos: " + Servidor.getServidoresActivos()); // 3 | 0

        s1.activar();
        s2.activar();
        s2.activar(); // ya estaba activo: no debe contar dos veces
        System.out.println("Tras activar -> activos: " + Servidor.getServidoresActivos()); // 2

        s1.desactivar();
        s1.desactivar(); // ya estaba apagado: no debe restar dos veces
        s3.desactivar(); // nunca estuvo activo
        System.out.println("Tras desactivar -> activos: " + Servidor.getServidoresActivos()); // 1

        s1.mostrarInfo();
        s2.mostrarInfo();
        s3.mostrarInfo();
    }
}