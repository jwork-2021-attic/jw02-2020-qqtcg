package S201250137.Matrix;

public class QuickSort implements Sort{
    private int[] needSort;
    private String process = "";

    public void load(int[] sortedElement){
        needSort = sortedElement;
    }

    public void sort(){
        quickSort(0, needSort.length - 1);
    }

    private void quickSort(int left, int right){
        if (left >= right){
            return;
        }
        int index = getStandardIndex(left, right);
        quickSort(left, index - 2);
        quickSort(index, right);
    }

    private int getStandardIndex(int left, int right){
        int standard = needSort[left];
        int index = left + 1;
        for (int i = index; i <= right; i++){
            if (needSort[i] < standard){
               
                swap(i, index);
                index++;
            }
        }
        swap(left, index - 1);
        return index;
    }


    



    public void swap(int i, int j){
        int temp = needSort[i];
        needSort[i] = needSort[j];
        needSort[j] = temp;
        if (i != j){
            process += needSort[i] + "<->" + needSort[j] + "\n";
        }
        
    }

    public String getProcess(){
        return process;
    }
}
