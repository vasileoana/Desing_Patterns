package contbancar_builderv1;

public class Main {

    public static void main(String[] args) {
        ContBancarBuilder builder = new ContBancarBuilder();
        ContBancar contBancar = builder.setContSalariu(true).setSuma(30).setDetinator("popescu").build();
        System.out.println(contBancar);
    }

}
