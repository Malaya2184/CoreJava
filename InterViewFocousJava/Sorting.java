class SortClass{
    public void selectionSort(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                
                if(arr[i]>arr[j]){
                    arr[i]= arr[i]*arr[j]/(arr[j]=arr[i]);
                }
            }
        }
        printArr(arr);
    }
    public void bubbleSort(int[] arr){

        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i]<arr[i++]){
                    arr[i]= arr[i]*arr[i++]/(arr[i++]=arr[i]);
                    sorted= false;
                }
            }
        }
        printArr(arr);
        
    }

    public void printArr(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}


public class Sorting{
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,99,6,32,45,87};
        SortClass ob = new SortClass();
        ob.selectionSort(arr);
        ob.bubbleSort(arr);
    }
}