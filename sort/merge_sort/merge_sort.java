class MergeSort
{
  void merge(int arr[], int l, int m, int r)
  {
    // Size of 2 subarrays
    int n1 = m - l + 1;
    int n2 = r - m;
    
    // Create 2 subarrays
    int a1[] = new int[n1];
    int a2[] = new int[n2];
    
    // Copy data to 2 subarrays
    int i, j;
    for(i=0; i<n1; i++){
      a1[i] = arr[l+i];
    }
    for(j=0; j<n2; j++){
      a1[j] = arr[m+j];
    }
    
    i = 0;
    j = 0;
    // Initial index of merged array
    int k = l;
    while(i<n1 && j<n2){
      if(a1[i] <= a2[j]){
        arr[k] = a1[i];
        i++;
      }
      else {
        arr[k] = a2[j];
        j++;
      }
      k++;
    }
    
    // Copy remaing a1
    while(i<n1){
      arr[k] = a1[i];
      i++;
      k++;
    }
    
    // Copy remaing a2
    while(j<n2){
      arr[k] = a2[j];
      j++;
      k++;
    } 
  }
  
  void mergeSort(int arr[], int l, int r)
  {
    // Calculate midpoint
    int m = (l+r) / 2;
    
    // Merge sort each subarray
    mergeSort(arr, l, m);
    mergeSort(arr, m+1, r);
    
    // Merge 2 subarrays
    merge(arr, l, m, r);
  }
}
