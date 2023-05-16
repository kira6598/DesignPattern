package DesignPatterns.Excercise.WebSearch;

public class SnooperApp {
    public static void main(String[] args) {
        WebSearchEngine searchEngine = new WebSearchEngine();

        FriendObserver friendObserver = new FriendObserver();
        SoLongObserver soLongObserver =  new SoLongObserver();
        LengthyQueryFilterPolicy lengthyPolicy = new LengthyQueryFilterPolicy();

        // FriendQueryFilterPolicy friendPolicy = new FriendQueryFilterPolicy();
        searchEngine.registerObserver(friendObserver);
        searchEngine.registerObserver(soLongObserver);

     
        searchEngine.setPolicy(lengthyPolicy);
        searchEngine.simulateSearch("DesignPatterns/Excercise/WebSearch/test.txt");
  
        
    }
}
