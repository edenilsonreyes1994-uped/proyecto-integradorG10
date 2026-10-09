package semana10;

public class EnvioMasivo {
    public static void main(String[] args) {
        Notificacion[] bandeja = {
            new NotificacionEmail("ana@uped.edu.sv", "Aviso general"),
            new NotificacionSMS("70099887", "Cambio de aula"),
            new NotificacionPush("dispositivo-77", "Nueva tarea", 1)
        };

        // Recorrido polimórfico: la JVM decide qué método enviar() ejecutar según el tipo real del objeto
        for (Notificacion n : bandeja) {
            n.enviar();
            System.out.println("----------------------------------------");
        }
    }
}