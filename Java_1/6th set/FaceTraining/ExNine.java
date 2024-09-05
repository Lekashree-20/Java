package ZohoSet1.FaceTraining;

public class ExNine {
    public static void main(String[] args) {
        int num = 5612073;
        int[] arr = new int[100];
        int i = 0;
        int n = 0;
        while(num>0){
            n = num%10;
            arr[i] = n;
            i++;
            num=num/10;
        }
        for (int j = 0; j < i; j++){
            System.err.println(arr[j]);
        }
    }
}
