package java_programs_250;

public class Ex_9_Left_Triangle_Star_Pattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
