package pachetturistic_builderv2;

public class Main {
    public static void main(String[] args) throws Exception {

        PachetTransportBuilder pachetTransportBuilder = new PachetTransportBuilder();
        PachetTransport transport = pachetTransportBuilder.setFumator(true).setHasAC(false).setHasTV(true).build();
        System.out.println(transport);

    }
}
