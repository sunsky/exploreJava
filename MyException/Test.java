package MyException;

import java.io.IOException;

import Copy.Person;

class Test{
  public static void main(String[] args) {
    try {
    Person p = new Person();
      System.out.println("before: "+p.name);
    modify(p);
      System.out.println("after: "+p.name);
      System.out.println("do try");
      throw new IOException("io error");
    } catch (Exception e) {
      //TODO: handle exception
      System.out.println(e.toString());
    }finally{

      System.out.println("done ");
    }
  }
  static void modify(Person p ){
    p.name = "modified";
    int[] arr = new int[]{11,2,33,4,5,6,7,8,9,0};
    // quickSort(arr,0,arr.length-1);
    quickSort(arr);
    PrintArray(arr);
  }
  static void PrintArray(int[] arr){
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
  }
  static void quickSort(int[] arr){
    quickSort(arr,0,arr.length-1);
  }
  static void quickSort(int[] arr,int start,int end){
    if(start<end){
      int pivot = arr[start];
      int i = start;
      int j = end;
      while(i<j){
        while(i<j && arr[j]>=pivot){
          j--;
        }
        arr[i] = arr[j];
        while(i<j && arr[i]<=pivot){
          i++;
        }
        arr[j] = arr[i];
      }
      arr[i] = pivot;
      quickSort(arr,start,i-1);
      quickSort(arr,i+1,end);
    }

  }
  

  // static void quickSort(int[] arr,int start,int end){
  //   if(start<end){
  //     int pivot = arr[start];
  //     int i = start;
  //     int j = end;
  //     while(i<j){
  //       while(i<j && arr[j]>=pivot){
  //         j--;
  //       }
  //       arr[i] = arr[j];
  //       while(i<j && arr[i]<=pivot){
  //         i++;
  //       }
  //       arr[j] = arr[i];
  //     }
  //     arr[i] = pivot;
  //     quickSort(arr,start,i-1);
  //     quickSort(arr,i+1,end);
  //   }
  // }

}
