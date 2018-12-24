package hotel;

import java.util.HashMap;

public class FabricaCamere {

    private HashMap<Integer, ICameraTiparire> aranjariCamere;

    public FabricaCamere(){
        aranjariCamere = new HashMap<>();
    }

    public ICameraTiparire getCamera(int cod){
        if(this.aranjariCamere.containsKey(cod)){
            return this.aranjariCamere.get(cod);
        } else {
            ICameraTiparire cameraTiparire = new Camera(cod, 3, 2, 2, 6);
            this.aranjariCamere.put(cod, cameraTiparire);
            return cameraTiparire;
        }
    }
}
