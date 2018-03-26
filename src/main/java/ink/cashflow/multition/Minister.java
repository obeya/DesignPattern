package ink.cashflow.multition;

public class Minister {
    
    public static void main(String[] args) {
        
        
        int ministerNum = 7;
        
        for (int i = 0; i < ministerNum; i++) {
            Emperor emperor = Emperor.getInstance(1);
            
            System.out.print("第" + (i + 1) + "大臣参拜的是: ");
            emperor.getInfo();
            System.out.println();
        }
        
        
    }
}
