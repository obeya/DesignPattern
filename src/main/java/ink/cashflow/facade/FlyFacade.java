package ink.cashflow.facade;

public class FlyFacade {

    private ProcessFly fly = new ProcessFlyImpl();
    private CheckFly che = new CheckFly(); 
    
    public void fly() {
        
        fly.start("haha");
        
        che.check(fly);
        
        fly.end("enen");
        
    }
    
    public static void main(String[] args) {
        new FlyFacade().fly();
    }
}
