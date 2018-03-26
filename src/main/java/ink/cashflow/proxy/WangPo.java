package ink.cashflow.proxy;

/**
 * 代理人
 */
public class WangPo implements KindWomen {

    private KindWomen kindWomen;
    
    public WangPo() {
        this.kindWomen = new PanJinLian();
    }
    
    public WangPo(KindWomen kindWomen) {
        super();
        this.kindWomen = kindWomen;
    }

    // 王婆代理潘金莲
    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan();
    }

    // 王婆代理潘金莲
    @Override
    public void happyWithMan() {
        this.kindWomen.happyWithMan();
    }

}
