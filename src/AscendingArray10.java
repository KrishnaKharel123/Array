public class AscendingArray10 {

    public static void main(String[] args) {
        int[] values = {9, 8, 2, 1, 5, 3, 4, 6, 7};


        for (int i = 0; i < values.length; i++) {

            for (int j = i + 1; j < values.length; j++) {
                int order = 0;

                if (values[i] > values[j]) {
                    order = values[i];

                    values[i] = values[j];

                    values[j] = order;

                }
            }
            System.out.println(values[i] + "");
        }

    }
}







