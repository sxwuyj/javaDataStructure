package tixi.day11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/**
 * @author wuyj
 * @date 2022/12/4 22:47
 *
 * 加强堆,只限非基础类型
 */
public class HeapCreate<T> {

    private ArrayList<T> heap;
    private HashMap<T,Integer> indexMap;
    private int headSize;
    private Comparator<? super T> comparator;

    public HeapCreate(Comparator<? super T> comparator) {
        heap = new ArrayList<>();
        indexMap = new HashMap<>();
        headSize = 0;
        this.comparator = comparator;
    }

    public boolean isEmpty(){
        return headSize > 0;
    }

    public int heapSize(){
        return headSize;
    }

    public boolean contains(T obj){
        return indexMap.containsKey(obj);
    }

    public T peek(){
        return heap.get(0);
    }

    public void push(T obj){
        heap.add(obj);
        indexMap.put(obj,headSize);
        heapInsert(headSize++);
    }

    public T pop(){
        T ans = heap.get(0);
        swap(0,headSize-1);
        indexMap.remove(ans);
        heap.remove(--headSize);
        heapIfy(0);
        return ans;
    }

    public void remove(T obj){
        T replace = heap.get(headSize - 1);
        int index = indexMap.get(obj);
        indexMap.remove(obj);
        heap.remove(--headSize);
        if (obj != replace){
            indexMap.put(replace,index);
            heap.set(index,replace);
            resign(replace);
        }


    }

    private void resign(T obj) {
        heapIfy(indexMap.get(obj));
        heapInsert(indexMap.get(obj));
    }

    private void heapIfy(int index) {
        int left = index * 2 +1;
        while (headSize > left){
            int maxIndex = left + 1 < headSize && comparator.compare(heap.get(left+1),heap.get(left)) > 0  ? left +1: left;
            maxIndex = comparator.compare(heap.get(index),heap.get(maxIndex)) > 0 ? index : maxIndex;
            if (maxIndex == index){
                break;
            }
            swap(maxIndex,index);
            index = maxIndex;
            left = index * 2 +1;
        }
    }

    public void heapInsert(int  index) {
       while (comparator.compare(heap.get(index),heap.get((index -1)/2)) > 0){
           swap(index,(index -1)/2);
           index = (index -1)/2;
       }
    }



    private void swap(int l, int r) {
        T o1 = heap.get(l);
        T o2 = heap.get(r);
        heap.set(r,o1);
        heap.set(l,o2);
        indexMap.put(o1,r);
        indexMap.put(o2,l);
    }
}
