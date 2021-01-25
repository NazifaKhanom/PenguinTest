import java.util.Scanner;

public class Main {
    static String [] course={"English Gramma","Mathematics","Physics","Chemistry","Biology"};
    static String [] teacher={"John Smith","Lara Gilbert","Johanna Kabir","Danniel Robertson","Larry Cooper"};
static int mat[][]=new int [4][3];
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Type\nA. Create Routine\nB. Show Routine\nC. List Courses with Teachers Name");
     char c = sc.next().charAt(0);
     for(; ;){
         for(; ;){
     if(c=='A'){
         for(int i=0;i<5;i++){
             System.out.println((i+1)+"."+course[i]);
         }
         
         for(int i=0;i<4;i++){
         for(int j=0;j<3;j++){
         mat[i][j]=sc.nextInt();
         }
         }
            System.out.println("Type\nA. Create Routine\nB. Show Routine\nC. List Courses with Teachers Name");
      c = sc.next().charAt(0);
         break;
     }
     else if(c=='B'){
       for(int i=0;i<4;i++){
         for(int j=0;j<3;j++){
        if(j==2){
            System.out.print(course[mat[i][j]]);
        }
        else{
         System.out.print(mat[i][j]+" ");
        }
         } 
           System.out.println("");
       }
     
        System.out.println("Type\nA. Create Routine\nB. Show Routine\nC. List Courses with Teachers Name");
      c = sc.next().charAt(0);
       break;
     }
      else if(c=='C'){
           for(int i=0;i<5;i++){
             System.out.println(course[i]+","+teacher[i]);
         }
              System.out.println("Type\nA. Create Routine\nB. Show Routine\nC. List Courses with Teachers Name");
      c = sc.next().charAt(0);
           break;
     }
         }
     }
    }


}
