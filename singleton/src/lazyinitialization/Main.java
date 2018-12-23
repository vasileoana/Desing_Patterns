package lazyinitialization;


public class Main {

    public static void main(String[] args){
        Agentie agentie = Agentie.getInstanta("Agentia nr 1", 2450000.0f, 200);
        System.out.println(agentie);
    }

}
