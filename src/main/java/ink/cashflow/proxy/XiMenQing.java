package ink.cashflow.proxy;

/**
 * 西门庆
 */
public class XiMenQing {

    public static void main(String[] args) {
        
        // 西门庆通过王婆找到潘金莲
        WangPo wangPo = new WangPo();
        
        
        
        // 实际是潘金莲在做
        wangPo.makeEyesWithMan();
        // 实际是潘金莲在做
        wangPo.happyWithMan();
        
        
        // 贾氏
        wangPo = new WangPo(new JiaShi());
        wangPo.makeEyesWithMan();
        wangPo.happyWithMan();
        
        
        
    }
}
