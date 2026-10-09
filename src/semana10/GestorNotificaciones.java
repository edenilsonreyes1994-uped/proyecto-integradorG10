package semana10;

public class GestorNotificaciones {

    // 1. Envío simple
    public void notificar(Notificacion n) {
        System.out.println("--- Envio simple ---");
        n.enviar();
    }

    // 2. Envío con reintentos
    public void notificar(Notificacion n, int intentos) {
        System.out.println("--- Envio con reintentos ---");
        for (int i = 1; i <= intentos; i++) {
            System.out.println("Intento " + i + " de " + intentos);
            n.enviar();
        }
    }

    // 3. Envío urgente
    public void notificar(Notificacion n, boolean urgente) {
        System.out.println("--- Envio urgente: " + urgente + " ---");
        n.enviar();
    }

    // 4. Envío rápido (creando mensaje directo en parámetros)
    public void notificar(String destinatario, String mensaje) {
        System.out.println("--- Envio rapido ---");
        System.out.println("Para: " + destinatario);
        System.out.println("Msj: " + mensaje);
    }
}