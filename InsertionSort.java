public class InsertionSort {
    public static void main(String[] args) {
        int[] ages = {17, 21, 97, 66, 55, 30, 33, 45, 58, 67, 38, 39, 41, 19, 23};
        insertion(ages);
    }

    public static void insertion(int ages[]) {

        int len = ages.length;

        for (int i = 1; i < len; i++) {
            int key = ages[i];  //initialising key to index i
            int j = i - 1;

            while (j >= 0 && ages[j] > key) {  //when j ==0 then the loop stops && key value is no longer smaller
                ages[j + 1] = ages[j];
                j = j - 1; // decrement
            }

            ages[j + 1] = key;
        }

//      Print out the full array
        System.out.println("The full list of ages is: ");
        for (int age : ages) {
                System.out.println(age);

            }
//      Print out only ages 30-40
        System.out.println("These are the ages listed that fall between 30 and 40: ");
        for (int age : ages) {
            if (age >= 30 && age <= 40) {
                System.out.println(age);
                }
            }
        }
    }
