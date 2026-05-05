
import java.util.Scanner;
public class Principal {
static int n;
static int fat = 1;

public static void fatorial(){
    for (int i=1;i<=n;i++){
        fat = fat*i;
    }
    
}
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        n = sc.nextInt();
        
        fatorial();
        
        System.out.println("O fatorial de" + n + " é " + fat);
        
    }
}
