package threadsafe;


public class Main {

    public static void main(String[] args){
        AgentieThreadSafe agentieThreadSafe = AgentieThreadSafe.getInstanta("Agentia ABC", 25000, 435);
        System.out.println(agentieThreadSafe);
    }

}
