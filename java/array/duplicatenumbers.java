class DuplicateNumbersInArray{
  public static void main(String[] args){

    //Initilization of array (range 0 to 10).
    int[] arr = {0,0,0,1,2,2,2,2,4,5,7,8,8};

    //Creating a new array to hold the count for number of times the number has repeated.
    int[] range = new int[11];

    //Counting the number of times the element has repeated.
    for(int i = 0; i < arr.length; i++){
      range[arr[i]]+=1;
    }

    //Printing the element if it has repeated more than once i.e. if the count is more than once than its index is printed.
    for(int i = 0; i < range.length; i++){
      if(range[i]>1){
        System.out.print(i+"\t");
      }
    }
  }
}
