import java.util.HashMap;

public class FabricaDePachete {

    private HashMap<Integer, IPachetTuristic> pacheteTuristice;

    public FabricaDePachete(){
        pacheteTuristice = new HashMap<>();
    }

    public int getNrPachete(){
        return pacheteTuristice.size();
    }

    public IPachetTuristic getPachetTuristic(int codPachet){
        IPachetTuristic pachetTuristic = this.pacheteTuristice.get(codPachet);
        if(pachetTuristic == null){
            pachetTuristic = new PachetTuristic(codPachet, "Hotel", "OrasTuristic", true);
            this.pacheteTuristice.put(codPachet, pachetTuristic);
        }
        return pachetTuristic;
    }
}
