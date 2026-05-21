public class Array {
    
    public static int[] listNumber(int[] number, int result) {

        for (int outer_loop = 0; outer_loop < number.length; outer_loop++) {

            for (int inner_loop = outer_loop + 1; inner_loop < number.length; inner_loop++) {

                if (number[outer_loop] + number[inner_loop] == result) {

                    return new int[]{number[outer_loop], number[inner_loop]};
                }
            }
        }
    }
}
