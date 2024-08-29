import java.io.*;



public class Employees {
    public static void main(String[] args) throws IOException {
        System.out.println("Ajith \"kumar"); 
        System.out.println("Please enter the value :");
        int N;
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            N = Integer.parseInt(bufferedReader.readLine().trim());
            
        }
        
        if ( N % 2 != 0  ){
            System.out.println("Weird");
        }
        else {
            if ( N >= 2 && N <= 5){
                System.out.println("Not Weird");
            }
            else if ( N >= 6 && N <= 20){
                System.out.println("Weird");
            }
            else {
                System.out.println("Not Weird");
            }
            
            
        } 
    }
     
}

