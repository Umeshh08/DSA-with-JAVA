public class Rhombus_pattern {
    public static void Rhombus(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void Diamond(int n){
        for(int i=0; i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=0; i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)+1;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
public static void main(String[] args) {
    // Rhombus(10);
    Diamond(6);
}
}
