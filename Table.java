import java.util.Scanner;
public class Table {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter num");
        int n = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.printf("%d * %d = %d",n, i, n*i).println();

        }
        
    }
    
}
