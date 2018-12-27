package example2;


public interface CustomIterator {
    boolean hasNext();
    boolean hasPrevious();
    Object next();
    Object previous();
    void start();
    void end();
}
