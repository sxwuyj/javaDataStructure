package tixi.day11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @author wuyj
 * @date 2022/12/4 23:43
 */
public class HeapCreate01<T> {

    private ArrayList<T> heap;
    private HashMap<T,Integer> indexMap;
    private int heapSize;
    private Comparator<? super T> comparator;

    public HeapCreate01(Comparator<? super T> comparator){
        heap = new ArrayList<>();
        indexMap = new HashMap<>();
        heapSize = 0;
        this.comparator = comparator;
    }

    public boolean isEmpty(){
        return heapSize == 0;
    }

    public boolean contains(T obj){
        return indexMap.containsKey(obj);
    }

    public int heapSize(){
        return heapSize;
    }

    public T peek(){
        return heap.get(0);
    }

    public void push(T obj){
        heap.add(obj);
        indexMap.put(obj,heapSize);
        heapInsert(heapSize++);
    }

    public T pop(){
        T ans = heap.get(0);
        swap(0,heapSize-1);
        indexMap.remove(ans);
        heap.remove(--heapSize);
        heapIfy(0);
        return ans;
    }

    public void  remove (T obj){
        int index = indexMap.get(obj);
        T replace = heap.get(heapSize -1);
        indexMap.remove(obj);
        heap.remove(--heapSize);
        if (obj != replace){
            heap.set(index,replace);
            indexMap.put(replace,index);
            resign(replace);
        }

    }

    private void resign(T obj) {
        heapInsert(indexMap.get(obj));
        heapIfy(indexMap.get(obj));
    }

    private void heapIfy(int index) {
        int left = index * 2 +1;
        while (heapSize > left){
            int best = heapSize > left+1 && comparator.compare(heap.get(left+1),heap.get(left)) < 0 ? left+1 : left;
            best = comparator.compare(heap.get(best),heap.get(index)) < 0 ? best : index;
            if (index == best){
                break;
            }
            swap(index,best);
            index = best;
            left = index*2+1;
        }
    }

    private void heapInsert(int index) {
        while (comparator.compare(heap.get(index), heap.get((index -1)/2))  < 0){
            swap(index,(index -1)/2);
            index = (index -1)/2;
        }
    }

    private void swap(int i, int j) {
        T o1 = heap.get(i);
        T o2 = heap.get(j);
        indexMap.put(o2,i);
        indexMap.put(o1,j);
        heap.set(j,o1);
        heap.set(i,o2);
    }
}
