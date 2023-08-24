public class ReverseArrayRange {
    public static void reverseRange(int[] A, int B, int C) {
        if (B < 0 || C >= A.length || B > C) {
            System.out.println("Invalid range.");
            return;
        }

        while (B < C) {
            int temp = A[B];
            A[B] = A[C];
            A[C] = temp;
            B++;
            C--;
        }
    }

    public static void main(String[] args) {
        int[] A1 = {1, 2, 3, 4};
        int B1 = 2;
        int C1 = 3;
        reverseRange(A1, B1, C1);
        for (int num : A1) {
            System.out.print(num + " ");
        }
        System.out.println();

        int[] A2 = {2, 5, 6};
        int B2 = 0;
        int C2 = 2;
        reverseRange(A2, B2, C2);
        for (int num : A2) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}