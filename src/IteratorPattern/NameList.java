package IteratorPattern;

/**
 * Created by cheny on 2018/5/9.
 */
public class NameList implements Container{
    private String[] names = new String[]{"aaa","bbb","ccc","ddd"};

    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }

    private class NameIterator implements Iterator<String>{
        private int index;

        @Override
        public boolean hasNext() {
            return index < names.length;
        }

        @Override
        public String next() {
            if(this.hasNext()){
                return names[index++];
            }
            return null;
        }
    }
}
