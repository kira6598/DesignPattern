package DesignPatterns.Excercise.WebSearch;

public interface QuerySubject {
    void registerObserver(QueryObserver observer );
    void removeObserver(QueryObserver observer);
    void notifyObserver(String query);
}
