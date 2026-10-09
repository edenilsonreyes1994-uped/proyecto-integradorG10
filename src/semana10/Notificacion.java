package semana10;

public abstract class Notificacion {
    protected String destinatario;
    protected String mensaje;

    public Notificacion(String destinatario, String mensaje) {
        this.destinatario = destinatario;
        this.mensaje = mensaje;
    }

    // Método abstracto a sobrescribir obligatoriamente en subclases
    public abstract void enviar();

    // Sobrecarga de método dentro de la propia superclase (Ejercicio Reto 8.3)
    public void enviar(int veces) {
        for (int i = 0; i < veces; i++) {
            enviar(); // Despacho dinámico según el tipo real del objeto
        }
    }

    public String getDestinatario() {
        return destinatario;
    }
}