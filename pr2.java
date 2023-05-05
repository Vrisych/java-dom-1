// простые числа от 1 до 1000
public class pr2 {
    public static void main(String[] args) {
        boolean b = true;
        for (int i =2; i<=1000; i++) {
            for (int k = 2; k<i; k++){
                if (i % k == 0) {
                    b = false;
                    break;
                }
            }
            if (b) System.out.print(i + " ");
            else b = true;
                
        }
    }
    
}
