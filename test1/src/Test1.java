import java.util.Scanner;

public class Test1 {

    public void star() {
        for(int a=1; a<=4 ; a++){
            for(int x=3;x>=a;x--){
                System.out.print(" ");
            }for (int z=1;z<=a;z++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public void starN(int data) {
        for(int a=1; a<=data ; a++){
            for(int x=data-1;x>=a;x--){
                System.out.print(" ");
            }for (int z=1;z<=a;z++){
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public Test1() {
        star();
        Scanner input= new Scanner(System.in);
        System.out.print("Masukan nilai N : ");int data = input.nextInt();
        starN(data);
    }

    public static void main(String[] args) {
        new Test1();
    }
}
