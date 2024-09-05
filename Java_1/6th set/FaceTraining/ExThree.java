package ZohoSet1.FaceTraining;

public class ExThree {
    static void sorter(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for(int j = i; j < arr.length; j++) {
                if(i%2== 0){
                    if(arr[i]>=arr[j]){
                        int t = arr[j];
                        arr[j] = arr[i];
                        arr[i] = t;
                    }
                }
                else{
                    if(arr[i]<=arr[j]){
                        int t = arr[j];
                        arr[j] = arr[i];
                        arr[i] = t;
                    }
                }
            }
        }
        for (int i = 0;i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    } 
    public static void main(String[] args) {
        int[] arr = {5,1,3,2,4,6}; // op = 1(1st smallest),6(1st largest),2(2nd smallest),5(2nd largest),3(3rd smallest),4 (3rd largest)
        sorter(arr);
    }
}
