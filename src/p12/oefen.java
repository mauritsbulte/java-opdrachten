package p12;


import java.util.Arrays;

public class oefen {

    public static void main(String[] args) {

        //define an array
        int[] numbers = new int[]{10,20,15,25,16,60,100};

                /*
                 * Average value of array elements would be
                 * sum of all elements/total number of elements
                 */

        //calculate sum of all array elements
        int sum = 0;

        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];

        //calculate average value
        double average = sum / numbers.length;

        //System.out.println("Average value of array elements is : " + average);

        int[] numbers2 = { 1, 5, 23, 2, 1, 6, 3, 1, 8, 12, 3 };
        Arrays.sort(numbers2);

        for(int i = 1; i < numbers2.length; i++) {
            if(numbers2[i] == numbers2[i - 1]) {

                System.out.println("Duplicate: " + numbers2[i]);
            }
        }
    }
}