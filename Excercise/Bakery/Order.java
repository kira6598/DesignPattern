package DesignPatterns.Excercise.Bakery;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Order {
    public void autoOrder(){
        System.out.println("Wellcome to Bakery shop ~~");
        System.out.println("what type of cake do you like");
        System.out.println("1. Vanilla");
        System.out.println("2. Chocolate");
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("You choose: ");
            int chose = scanner.nextInt();
            Cake originCake= CakesFactoty.getCakeByInt(chose);
            // System.out.println(yourCake.getName());
            System.out.println("Do you want to decorate you cake ?");
            System.out.println("1. Yes            2. No");
            System.out.print("you choose: ");   
            int isDecorate= scanner.nextInt();
            if(isDecorate==2){
                System.out.println("that is "+ originCake.getName() + " with price: " +originCake.getPrice() );
            }else{
                Map<String,Integer>orders = service();
               Cake orderCake = creatCake(orders, originCake);
               serve(orderCake.decorate(), originCake);
               System.out.println("with price"+orderCake.getPrice());
            }
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
            }        
    }

    private void serve(String text,Cake originCake){

        if(text.contains("Multi-Layer")){
           System.out.println(text.substring(0,12)+originCake.getName()+text.substring(11)); 
        }else{
            System.out.println(originCake.getName()+text);
        }
    }

    private void showOption(Map<Integer,String> choosen){      
        System.out.println("what types of decorator do you want to add more: ");
        choosen.entrySet().forEach((e) -> {
            System.out.println(e.getKey()+". "+ e.getValue());
        });
        System.out.print("you choose: ");

    }
    private Map<String,Integer> service(){
        Map<String,Integer> oders = new HashMap<>();// stored times of order
        Map<Integer,String> choose = new HashMap<>();
        choose.put(1, "Multi-Layer");
        choose.put(2, "Spinkles");
        choose.put(3, "With say");
        Scanner scanner2 = new Scanner(System.in);
        showOption(choose);
        while(choose.size()>0){
            try {
                int chooseDecorator= scanner2.nextInt();
                if(chooseDecorator==1){                
                    choose.remove(1);
                    oders.put("Multi-Layer", 1);
                    System.out.println("oke~");
                }else{
                    System.out.println("how many times do you want to serve?");  
                    System.out.print("you choose: "); 
                    int times= scanner2.nextInt();
                    oders.put(choose.get(chooseDecorator), times);
                    choose.remove(chooseDecorator);
                    System.out.println("oke<3");
                    if(choose.isEmpty()) break;
                    System.out.println("Do you want to decorate you cake more ?");
                    System.out.println("1. Yes            2. No");
                    int isContinues = scanner2.nextInt();
                    if(isContinues==2) break;    
                }
                showOption(choose);
                
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        scanner2.close();
        return oders;
    }

    private static Cake creatCake(Map<String,Integer> orders,Cake cake){
        String Prekey = "Multi-Layer";
        String secondKey= "Spinkles";
        String thirdKey= "With say";
        DecoratorCake decoratorCake;

        if(orders.containsKey(Prekey)){
             decoratorCake = new MultiLayerDecorator(cake);
             orders.remove(Prekey);
        }else if( orders.containsKey(secondKey)){
             decoratorCake = new Spinkles(cake);
             orders.remove(secondKey);
        }else{
            decoratorCake = new WithSaying(cake);
            orders.remove(thirdKey);
        }

      while(orders.size()>0){
        if(orders.containsKey(secondKey)){
            Spinkles spinklesCake = new Spinkles(decoratorCake);
            int times= orders.get(secondKey)-1;
            while(times>0){
                Spinkles multSpinkles = new Spinkles(spinklesCake);
                spinklesCake = multSpinkles;
                times--;
            }
            decoratorCake=spinklesCake;
            orders.remove(secondKey);
        }else{
            WithSaying saying = new WithSaying(decoratorCake);
            int times= orders.get(thirdKey)-1;
  
            while(times>0){
                WithSaying multiSaying = new WithSaying(saying);
      
                saying = multiSaying;
                times--;
            }
            decoratorCake= saying;
            orders.remove(thirdKey);
        }
      }
        return decoratorCake;
    }
    }
    


    
    
