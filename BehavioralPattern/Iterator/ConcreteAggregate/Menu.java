package DesignPatterns.BehavioralPattern.Iterator.ConcreteAggregate;
import java.util.ArrayList;
import java.util.List;
import DesignPatterns.BehavioralPattern.Iterator.ConcreteIterator.Item;
import DesignPatterns.BehavioralPattern.Iterator.Iterator.ItemIterator;

public class Menu {
    private List<Item> menuItems = new ArrayList<>();
    
    public void addItem(Item item){
        menuItems.add(item);
    }
    public ItemIterator<Item> interator(){
        return new MenuInterator();
    }
    
    class MenuInterator implements ItemIterator<Item>{
        private int currentIndex=0;

        @Override
        public boolean hasNext() {
            return currentIndex<menuItems.size();
        }

        @Override
        public Item next() {           
            return menuItems.get(currentIndex++);
        }
        
    }
}
