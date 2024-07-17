package behavioral_patterns.iterator;

interface Iterator<T> {
    boolean hasNext();
    T next();
}