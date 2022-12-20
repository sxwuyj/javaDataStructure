package tixi.common;

/**
 * @author wuyj
 * @date 2022/12/20 22:05
 */
public class TireTreeNode {

    public int pass;
    public int end;
    public TireTreeNode [] nextNodes;

    public TireTreeNode() {
        this.pass = 0;
        this.end = 0;
        this.nextNodes = new TireTreeNode [26];
    }
}
