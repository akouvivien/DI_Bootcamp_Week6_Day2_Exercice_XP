import java.util.Scanner; 
public class App {
    public static void main(String[] args) {
        System.out.println("------------Exercice 1-----------------------");
        Scanner scanner = new Scanner(System.in);
        float moyenne = scanner.nextFloat();
        String grade ; 
        if (moyenne>=93 && moyenne<=100 ) {
            grade = "A";
            System.out.println(grade);
        } else  if(moyenne >= 90 && moyenne <= 92 ){
            grade = "-A";
            System.out.println(grade);
        } 
         else  if(moyenne>=87 && moyenne<=89 ){
            grade = "B+";
            System.out.println(grade);
        } 
         else  if(moyenne>=83 && moyenne<=86 ){
            grade = "B";
            System.out.println(grade);
        } 
         else  if(moyenne>=80 && moyenne<=82 ){
            grade = "B-";
            System.out.println(grade);
        } 
         else  if(moyenne>=77 && moyenne<=79 ){
            grade = "C+";
            System.out.println(grade);
        } 
         else  if(moyenne>=70 && moyenne<=76 ){
            grade = "C";
            System.out.println(grade);
        } 
         else  if(moyenne>=60 && moyenne<=69 ){
            grade = "D";
            System.out.println(grade);
        } 
         else  if(moyenne>=0 && moyenne<=59 ){
            grade = "F";
            System.out.println(grade);
        } 
        System.out.println("------------Exercice 2-----------------------");
        for (int i = 0; i < args.length; i++) {
            
        }
    }
    
    
}
