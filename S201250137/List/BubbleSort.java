package S201250137.List;

public class BubbleSort implements Sort{
    private int[] needSort;
    private String process = "";

    public void load(int[] sortedElement){
        needSort = sortedElement;
    }

    public void sort(){
        sortSon(needSort.length - 1);
    }

    private void sortSon(int num){
        if (num <= 0){
            return;
        }
        for (int i = 0; i < num; i++){
            if (needSort[i] > needSort[i+1]){
                swap(i, i+1);
            }
        }
        sortSon(num - 1);
    }

    public String getProcess(){
        return process;
    }

    public void swap(int i, int j){
        int temp = needSort[i];
        needSort[i] = needSort[j];
        needSort[j] = temp;
        process += needSort[i] + "<->" + needSort[j] + "\n";
    }
}
