import java.util.Scanner;

public class InsertionSorting {
    
    public static void insertionSorting(int arr[]){
        int k ,temp,j ;
        
        for(int i=1;i<arr.length;i++){
            k=arr[i];
            j=i-1;
            while(j>=0 && k<arr[j]){
               
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                j--;
            }
        }
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
        
    
    }

    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        
        int n= s.nextInt();
        System.out.println();
        
        int[] arr=new int[n];
        for(int i=0; i<arr.length; i++){
            arr[i]=s.nextInt();
        }
        System.out.println();
        
        insertionSorting(arr);
    }
}
