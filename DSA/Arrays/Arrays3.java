import java.util.Scanner;

public class Arrays3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // Introduction to multi-dimensional arrays.

        double [][] arr = {{12,56,54},{6,59,4}};
        // traverse an array by using for each loop
        // for(double[] element :arr){
        //     for(double element2 :element){
        //         System.out.print(element2+"\t");
        //     }
        //     System.out.println();
        // } 
        
        // By using simple for loop
        for(int i=0; i < 2 ;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

        // double [][] arr2 = new double[2][];
        // arr2[0]=new double[3];
        // arr2[1]=new double[5];
        
        // for (int i = 0; i < 2; i++) {
        //     for (int j = 0; j < arr2[i].length; j++) {
        //         System.out.print("Enter marks in =" +arr2[i][j] + "\t");
        //         arr2[i][j]=scanner.nextDouble();
        //     }
        //     System.out.println();
        // }

        // for(int i=0; i < 2;i++){
        //     for(int j=0;j < arr2[i].length;j++){
        //         System.out.print(arr2[i][j]+"\t");
        //     }
        //     System.out.println();
        // }

        // student [][] students = new student[2][3];
        // students[0][0]=new student();
        // students[0][1]=new student();
        // students[0][2]=new student();
        // students[1][0]=new student();
        // students[1][1]=new student();
        // students[1][2]=new student();

        // students[0][0].id=1;
        // students[0][0].name="Tarun";
        // students[0][1].id=2;
        // students[0][1].name="Harsh";
        // students[0][2].id=3;
        // students[0][2].name="Vishnu";
        // students[1][0].id=4;
        // students[1][0].name="Priyanka";
        // students[1][1].id=5;
        // students[1][1].name="Sumaya";
        // students[1][2].id=6;
        // students[1][2].name="mayank";

    
    
        // for(int i=0;i<2;i++){
        //     for(int j=0; j < students[i].length;j++){
        //         System.out.println("Student id is : " + students[i][j].id + "\t" + "name is : " + students[i][j].name);
        //     }
        // }
    }
}

class student{
    int id;
    String name;
    public void display(){
        System.out.println("Student id is "+id+"\n"+"name is : "+name);
    }
}