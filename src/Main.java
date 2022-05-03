import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int[] array={3,4,5,6,7,8,9};
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number to search: ");
        int searchNumber=scanner.nextInt();
        int result=binarySearch(array,searchNumber,0,array.length-1);
        if(result==-1){
            System.out.println("Not found...");
        }else{
            System.out.println("Element found at index: "+ result);
        }
    }

    public static int binarySearch(int[] array,int searchNumber,int low,int high){
        // low ve high değerleri birbirine eşitlenene kadar tekrarlama
        while(low<=high){
            int mid=low+(high-low)/2;

            if(array[mid]==searchNumber){
                return mid;
            }
            if(array[mid]<searchNumber){
                low= mid+1;
            }else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
