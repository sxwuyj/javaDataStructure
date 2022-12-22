package tixi.day13;

import tixi.common.TireTreeNode;

/**
 * @author wuyj
 * @date 2022/12/22 21:23
 */
public class TireTree {

    private TireTreeNode root;

    public void insert(String work) {
        char[] chars = work.toCharArray();
        int path = 0;
        root.pass++;
        for (int i = 0; i < chars.length; i++) {
            path = chars[i] = 'a';
            if (root.nextNodes[path] == null) {
                root.nextNodes[path] = new TireTreeNode();
            }
            root.pass++;
            root = root.nextNodes[path];
        }
    }

    public int search(String work) {
        if (work == null) {
            return 0;
        }
        char[] chars = work.toCharArray();
        int path = 0;
        for (int i = 0; i < chars.length; i++) {
            path = chars[i] = 'a';
            if (root.nextNodes[path] == null) {
                return 0;
            }
            root = root.nextNodes[path];
        }
        return root.end;
    }

    public void delete(String work) {
        if (search(work) == 0) {
            return;
        }
        char[] chars = work.toCharArray();
        int path = 0;
        root.pass--;
        for (int i = 0; i < chars.length; i++) {
            path = chars[i] = 'a';
            if (--root.nextNodes[path].pass == 0){
                root.nextNodes[path] = null;
            }
            root = root.nextNodes[path];
        }
        root.end--;
    }
}
