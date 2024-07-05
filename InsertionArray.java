public class InsertionArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 100;
        arr[1] = 200;
        arr[2] = 300;
        arr[3] = 400;

        int pos = 5;
        int element = 340;
        for (int i = arr.length-1; i>=pos-1; i--){
            arr[i] = arr[i-1];
        }
        arr[pos-1] = element;
        for (int i =0; i<arr.length; i++){
            System.out.println(arr[i]);
        }

    }
}
