package behavioral_patterns.iterator;

interface Aggregate<T> {
    Iterator<T> createIterator();
}