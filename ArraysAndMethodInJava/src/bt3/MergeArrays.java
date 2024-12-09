package bt3;

public class MergeArrays {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5,6};

        int[] array3 = new int[array1.length + array2.length];



        for (int i = 0; i < array1.length; i++) {
           array3[i] = array1[i];
        }

        for (int i = 0; i < array2.length; i++) {
            array3[array1.length + i] = array2[i];
        }

        // Hiển thị mảng 3 sau khi gộp
        System.out.println("Mảng 3 sau khi gộp là:");
        for (int num : array3) {
            System.out.print(num + " ");
        }
    }
}
