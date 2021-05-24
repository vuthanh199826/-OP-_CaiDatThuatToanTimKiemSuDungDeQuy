import java.util.Scanner;

public class Main {
    public static int binSearch(int[] arr, int value){
        int left = 0;
        int right = arr.length-1;
        while (right>=left){
            int mid = (left+right)/2;
            if(value < arr[mid]){
                right = mid - 1;
            }else if(value>arr[mid]){
                left = mid + 1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nhap so thu " + i);
            arr[i] = sc.nextInt();
            sc.nextLine();
        }
        int temp = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        System.out.println(binSearch(arr,5));

    }


}
