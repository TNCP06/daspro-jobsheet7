public class LatihanMandiriWeek7_3 {
    public static void main(String[] args) {

        int i = 0;
        do {
            i++;

            if (i%3==0) {
                continue;
            }

            System.out.print(i+" ");
        } while (i<=50);
    }
}