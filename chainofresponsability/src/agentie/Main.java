package agentie;

public class Main {
    public static void main(String[] args) {
        Notificator notificatorSMS = new NotificatorSms();
        Notificator notificatorEmail = new NotificatorEmail();
        Notificator notificatorManager = new NotificatorManager();

        notificatorSMS.setUrmatorulNotificator(notificatorEmail);
        notificatorEmail.setUrmatorulNotificator(notificatorManager);

        Client client = new Client("Popescu", null, "abc@gmail.com");

        notificatorSMS.notifica(client, "Notificare Test");
    }
}
