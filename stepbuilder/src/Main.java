public class Main {
    public static void main(String[] args) {

        Email email = Email.builder()
                .from(new EmailAddress("Microservices Weekly <mw@microservicesweekly.com>"))
                .to(new EmailAddress("aaa@gmail.com"))
                .subject(new Subject())
                .content(new Content())
                .build();

    }
}
