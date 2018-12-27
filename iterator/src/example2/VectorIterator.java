package example2;

import java.util.Objects;

public class VectorIterator implements CustomIterator {

    private int[] values;
    private int position;

    public VectorIterator(int[] values) {
        this.values = values;
        this.position = -1;
    }

    @Override
    public boolean hasNext() {
        return (position + 1 < values.length);
    }

    @Override
    public boolean hasPrevious() {
        return (position - 1 >= 0);
    }

    @Override
    public Object next() {
        position++;
        return values[position];
    }

    @Override
    public Object previous() {
        position--;
        return values[position];
    }

    @Override
    public void start() {
        position = -1;
    }

    @Override
    public void end() {
        position = values.length;
    }
}
