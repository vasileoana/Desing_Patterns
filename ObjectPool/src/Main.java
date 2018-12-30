
public class Main {

    public static void main(String[] args) {

        ObjectPool objectPool = ObjectPool.getInstance();
        Resursa r = objectPool.getResursa();
        if(r!= null){
            r.utilizeaza();
        }
         objectPool.releaseResursa(r);

        Resursa r2 = objectPool.getResursa();
        if(r2!= null){
            r2.utilizeaza();
        }
        objectPool.releaseResursa(r2);


    }

}
