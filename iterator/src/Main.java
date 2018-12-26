public class Main {

    //This pattern is used to get a way to access the elements of a collection object in sequential manner without any need to know its underlying representation.

    public static void main(String[] args) {
        NameRepository nameRepository = new NameRepository();
        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name=(String)iter.next();
            System.out.println("Name : "+ name);
        }
    }
}
