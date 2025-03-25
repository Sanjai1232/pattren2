public class pp3
{
    public static void main(String[] args) {
        int print=1;
        int n=5;
        for (int i = 0; i <=n; i++) {
            if (print%2==0) {
                print=1;
            }else {
                print=0;
            }
            for (int j = 0; j <=i; j++) {
                System.out.print(print);
                print=1-print;
            }
            System.out.println(" ");
        }
    }
}
