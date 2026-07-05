class Solution {
    // Function to sort an array using Heap Sort.
    void heapify(int arr[], int n, int i) {     //heapify
        int largest = i;
        int l = 2 * i + 1;
        int r = 2 * i + 2;

        if (l < n && arr[l] > arr[largest])         //left child
            largest = l;

        if (r < n && arr[r] > arr[largest])        // right child         
            largest = r;

        if (largest != i) {                     // swapping     
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            heapify(arr, n, largest);
        }
    }
    public void heapSort(int arr[]) {
        // code here
        int n = arr.length;
        
        for(int i = n/2-1; i>=0; i--)         //build max heap
        heapify (arr, n, i);
        
        for(int i = n-1; i>0; i--){         //extract elements on by one
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            
            heapify(arr,i,0);
        }
        
    }
}