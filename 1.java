// import java.util.Scanner;
// class Hello{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         int age;
//         System.out.println("Enter name : ");
//         String s=sc.nextLine();
//         System.out.println("enter age : ");
//         age=sc.nextInt();
//         System.out.println("Name of the person is "+s+" and age is "+age);
//     }
// }

import java.io.*;
class hello{
    public static void main(String[] args)throws IOException {
        BufferedReader bf= new BufferedReader(new InputStreamReader(System.in));
        int age;
        System.out.println("Enter name : ");
        String s=bf.readLine();
        System.out.println("enter age : ");
        age=Integer.parseInt(bf.readLine());
        System.out.println("Name of the person is "+s+" and age is "+age);
    }
}
