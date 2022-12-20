package tixi.day12;

import tixi.common.TireTreeNode;

/**
 * @author wuyj
 * @date 2022/12/20 22:04
 */
public class TireTree {

    private TireTreeNode root;


    public void insertWork(String work){
        if (work == null){
            return;
        }
        root.pass++;
        char[] chars = work.toCharArray();
        int path ;
        for (int i = 0; i < chars.length; i++) {
            path = chars[i] - 'a';
            if (root.nextNodes[path] == null){
                root.nextNodes[path] = new TireTreeNode();
            }
            root = root.nextNodes[path];
            root.pass++;
        }
        root.end++;
    }

    public int search(String work){
        if (work == null){
            return 0;
        }
        TireTreeNode node= root;
        char[] chars = work.toCharArray();
        int path = 0;
        for (int i = 0; i < chars.length; i++) {
            path = chars[i] - 'a';
            if (node.nextNodes[path] == null){
                return 0;
            }
            root = node.nextNodes[path];
        }
        return root.end;
    }

    public void delete(String work){
        if (search(work) == 0){
            return;
        }
        TireTreeNode node= root;
        char[] chars = work.toCharArray();
        int path = 0;
        node.pass--;
        for (int i = 0; i < chars.length; i++) {
            path = chars[i] - 'a';
            if (--node.nextNodes[path].pass == 0){
                node.nextNodes[path] = null;
                return;
            }
            node = node.nextNodes[path];
        }
        node.end--;
    }
}
