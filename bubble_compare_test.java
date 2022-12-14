import java.util.Scanner;
import java.util.Arrays.*;
import java.lang.*;

class Test {
    public static void main(String[] args)
    {
        int[] test_array;
        test_array = new int[5];
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter 5 numbers to fill array with:");
        int number1 = myObj.nextInt();
        int number2 = myObj.nextInt();
        int number3 = myObj.nextInt();
        int number4 = myObj.nextInt();
        int number5 = myObj.nextInt();
        test_array[0] = number1;
        test_array[1] = number2;
        test_array[2] = number3;
        test_array[3] = number4;
        test_array[4] = number5;
        for (int i = 0; i < test_array.length; i++) {
            System.out.println(test_array[i]);
        //Arrays.fill(test_array, Math.random() * 20);
        //for (int i = 0; i < 6; i++)
          //  System.out.println(Arrays.toInt(test_array[i]));

        for (int y = 0; y < test_array.length; y++) {
            for (int j = 0; j < test_array.length - y - 1; j++) {
                if (test_array[j] > test_array[j + 1]) {
                    int temp = test_array[j];
                    test_array[j] = test_array[j + 1];
                    test_array[j + 1] = temp;
                }
            }
        }

        for (int x = 0; x < test_array.length; x++) {
            System.out.println(test_array[x]);
        }
    }
}
}
