package DesignPatterns.Excercise.WebSearch;

public class SoLongObserver implements QueryObserver {

    @Override
    public void update(String query) {
        System.out.println("So long..."+query);
    }

    @Override
    public boolean shouldReceive(QueryFilterPolicy policy) {
        if(policy instanceof LengthyQueryFilterPolicy){
            return true;
        }else{
            return false;
        }
    }
    
}
