package B7;

public class main {
    public static void main(String[] args) {
        // sum random number 5 set
        int sum=0;
        int rnd;
        for(int i=1; i <= 5; i++){
            rnd = (int) (Math.random() * 10);
            sum += rnd;
            System.out.printf("i%d = %d\n", i, rnd);
        }
        System.out.println("Sum= " + sum);
    }
}
