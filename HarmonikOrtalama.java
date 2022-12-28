public class HarmonikOrtalama {
    public static void main(String[] args) {
        double[] list = {1, 2, 3, 4, 5};
        double sum = 0.0;
        double harmonik;

        for (int i = 0; i < list.length; i++) {
            sum += 1 / list[i];
        }
        harmonik = list.length / sum;
        System.out.println(harmonik);
    }
}
