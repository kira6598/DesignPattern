package DesignPatterns.Excercise.WebSearch;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class WebSearchEngine implements QuerySubject {

    private List<QueryObserver> observers;
    private QueryFilterPolicy policy;
    public QueryFilterPolicy getPolicy() {
        return policy;
    }

    public void setPolicy(QueryFilterPolicy policy) {
        this.policy = policy;
    }

    public WebSearchEngine() {
        this.observers = new ArrayList<>();        
    }

    @Override
    public void registerObserver(QueryObserver observer) {
        observers.add(observer);      
    }

    @Override
    public void removeObserver(QueryObserver observer) {
        int index= observers.indexOf(observer);
        if(index>=0){
            observers.remove(index);
            
        }
    }

    @Override
    public void notifyObserver(String query) {
        for(int i=0;i<observers.size();i++){
            QueryObserver observer = observers.get(i);            
            if(policy.shouldNotify(query)){
                if(observer.shouldReceive(policy)){
                    observer.update(query);
                }                
                
            }
        }
    }

    public void simulateSearch(String filename){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            while((line= reader.readLine())!=null){
                notifyObserver(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
