import java.util.Scanner;
class table{
    public static void main(String[] args) {

        System.out.println("Enter the table to be displayed: ");
        Scanner sc=new Scanner(System.in);
        int table= sc.nextInt();
        System.out.println(" The table of " + table + " is given below ");

        for(int i=0; i<=10; i++) {
            int mul= table * i;
            System.out.println(table + " * " + i + " = " + mul);
            
        }
        
        
    }
}