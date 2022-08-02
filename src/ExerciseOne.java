public class ExerciseOne {

    static void displayArray(int[] a) {
        System.out.println("\nInside Display Array method");
        a[0] = 0;
        a[1] = 0;
        a[2] = 0;
        for (int i = 0; i < 3; i++)
            System.out.print(a[i] + " ");
    }

    static void loadTest() {
        int arr[] = { 2, 2, 2 };
        System.out.println("Before the function");
        for (int i = 0; i < 3; i++)
            System.out.print(arr[i] + " ");

        displayArray(arr);

        System.out.println("\nAfter the function");
        for (int i = 0; i < 3; i++)
            System.out.print(arr[i] + " ");
    }
}
