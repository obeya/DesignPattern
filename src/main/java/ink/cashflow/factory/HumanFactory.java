package ink.cashflow.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Random;

import ink.cashflow.ClassUtils;

public class HumanFactory {

    private static HashMap<String, Human> map = new HashMap<String, Human>(0);
    
    public static Human createHuman(Class c) {
        Human human = null;

        try {
            
            // 延迟初始化
            if (map.containsKey(c.getSimpleName())) {
                human = map.get(c.getSimpleName());
            } else {
                String name = c.getName();
                human = (Human) Class.forName(c.getName()).newInstance();
                map.put(c.getSimpleName(), human);
            }
            
        } catch (InstantiationException e) {
            System.out.println("必须指定人种的颜色!");
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            System.out.println("人种定义错误!");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.out.println("人种找不到!");
            e.printStackTrace();
        }
        return human;
    }
    
    public static Human createHuman() {
        
        List<Class> classList = ClassUtils.getAllClassByInterface(Human.class);
        
        Random random = new Random();
        int curr = random.nextInt(classList.size());
        
        Human human = createHuman(classList.get(curr));
        
        return human;
        
    }

}
