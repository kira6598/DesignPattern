package DesignPatterns.CreationalPatterns.ObjectPool.ObjectPool;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

import DesignPatterns.CreationalPatterns.ObjectPool.PooledObject.Taxi;

public class TaxiPool {
    private static final long EXPIRED_TIME_IN_MILISECOND=1200;
    private static final int NUMBER_OF_TAXI= 4;

    private final List<Taxi> available = Collections.synchronizedList(new ArrayList<>());
    private final List<Taxi> inUse = Collections.synchronizedList(new ArrayList<>());

    private final AtomicInteger count = new AtomicInteger(0);
    private final AtomicBoolean isWaiting = new AtomicBoolean(false);
    public synchronized Taxi getTaxi(){
        // nếu available trống thì chờ một thời gian
        if(!available.isEmpty()){
            Taxi taxi = available.remove(0);
            inUse.add(taxi);
            return taxi;
        }
        // count chưa bằng 4 thì không tạo thêm taxi nữa
        if(count.get()==NUMBER_OF_TAXI){
            this.waitingUtilTaxiAvailable();
            return this.getTaxi();
        }
        Taxi taxi = this.createTaxi();
        inUse.add(taxi);
        return taxi;
        
    }

    public synchronized void release(Taxi taxi){
        inUse.remove(taxi);
        available.add(taxi);
        System.out.println(taxi.getName()+" is free~");
    }
    private Taxi createTaxi() {
        waiting(200);
        Taxi taxi = new Taxi("Taxi " + count.incrementAndGet());
        System.out.println(taxi.getName()+ " is created~");
        return taxi;
    }
    private void waitingUtilTaxiAvailable() {
        if(isWaiting.get()){
            isWaiting.set(false);
            throw new TaxiNotFoundException("No taxi availabe!");
            
        }
        isWaiting.set(true);
        waiting(EXPIRED_TIME_IN_MILISECOND);
    }
    private void waiting(long expiredTimeInMilisecond) {
        try {
            TimeUnit.MILLISECONDS.sleep(expiredTimeInMilisecond);
        } catch (InterruptedException e) {
            e.printStackTrace();
            Thread.currentThread().interrupt();
        }
    }

}
