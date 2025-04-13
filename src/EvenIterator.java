import java.util.Iterator;
import java.util.NoSuchElementException;

public class EvenIterator implements Iterable<Integer>  {
    private int[] data;

    public EvenIterator(int[] arr) {
        data = arr;
    }

    public Iterator<Integer> iterator() {
        return new Iterator<Integer>(){
            int index = 0;
            boolean prepared = false;

            public void advanceToNextEven() {
               while (index<data.length && data[index] % 2 != 0) {
                 index++;
               }
               prepared = true;
            }
            public boolean hasNext(){
                if (!prepared) {
                    advanceToNextEven();
                }
                return index < data.length;
            }

            public Integer next() {
               if (!hasNext()) {
                    throw new NoSuchElementException("No more even");
               }
                return data[index++]; 
            }
        };
    }
}
