import java.util.Scanner;

public class Q1{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        String input = "";
        String stop = "q";
        String square = "square";
        String circle = "circle";
        String rect = "rectangle";
        int width = 0;
        int length = 0;
        int perim = 0;

        while(true){

            input = sc.nextLine();

            if(input.equals(stop)){
                break;
            }
            else{
                if(input.equals(rect) || input.equals(square)){
                    System.out.println("Enter Width and Length:");

                    width = sc.nextInt();
                    length = sc.nextInt();

                    perim = (2*width) + (2* length);

                    System.out.println("Perimiter: " + perim);

                }
            }

        }

    }
}