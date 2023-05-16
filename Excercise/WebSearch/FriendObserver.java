package DesignPatterns.Excercise.WebSearch;

public class FriendObserver implements QueryObserver {

    @Override
    public void update(String query) {        
        System.out.println("Oh Yes! "+ query);
        
    }

    @Override
    public boolean shouldReceive(QueryFilterPolicy policy) {
        if(policy instanceof FriendQueryFilterPolicy){
            return true;
        }else{
            return false;
        }
    }

    
}
