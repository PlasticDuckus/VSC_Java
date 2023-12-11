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
        double radius = 0;
        double perim = 0.0;

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
                else if(input.equals(circle)){
                    System.out.println("Enter Radius:");
                    radius = sc.nextInt();
                    perim = 2*(3.14159)*(radius);

                    System.out.println("Permimiter:"+ perim);
                }
            }

        }

    }
}