package beforemultithreading;

public class Demo {
    public static void main(String[] args) {
        // part1
        for(int i=0;i<=10;i++){
            System.out.println("first part i : "+i);
        }
        //part2
        for(int j=0;j<=10;j++){
            System.out.println("second part j : "+j);
        }
    }
}
