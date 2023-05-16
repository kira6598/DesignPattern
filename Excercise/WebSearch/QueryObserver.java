package DesignPatterns.Excercise.WebSearch;

public interface QueryObserver {
    boolean shouldReceive(QueryFilterPolicy policy);
    void update(String query);
}
