package DesignPatterns.BehavioralPattern.Vistitor.Girl.SingleDispatch;

public class Example {
    public static void main(String[] args) {
        Girl girl = new HotGirl();
        Man ladyKiller = new ladyKiller();
        ladyKiller.kiss(girl);
        

        
    }
}
class Girl{}
class HotGirl extends Girl{}
class Man{
    void kiss(Girl girl){
        System.out.println("Man kiss a girl");
    }
    void kiss(HotGirl hotGirl){
        System.out.println("Man kiss a hot girl");
    }
}
class ladyKiller extends Man{
    @Override
    void kiss(Girl girl){
        System.out.println("ladyKiller kiss a girl");
    }
    @Override
    void kiss(HotGirl hotGirl){
        System.out.println("ladyKiller kiss a hot girl");
    }
}

