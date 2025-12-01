import java.util.Scanner;

public class Main {
    public static int leftDirection(int input , int current){
        return (current - input) % 100;
    }

    public static int rightDirection(int input, int current){
        return (current + input) % 100;
    }

    public static int count(String input){
        int zeroCounter = 0;

        int startNum = 50; //default num

        String[] rotations = input.split("\n");
        
        for(String rotation : rotations){
            char direction = rotation.charAt(0);
            int rotationValue = Integer.parseInt(rotation.substring(1)); // skip the direction
            if(direction == 'L'){
                startNum = leftDirection(rotationValue, startNum);
            } else{
                startNum = rightDirection(rotationValue, startNum);
            }

            // after rotation check if it equals to zero
            if(startNum == 0){
                zeroCounter++;
            }
        }

        return zeroCounter;
    }

    public static void main(String[] args) {
        
        Scanner scnr = new Scanner(System.in);
        StringBuilder input = new StringBuilder();

        // crtl z indicates end of line
        System.out.println("enter your input");
        while(scnr.hasNextLine()){
            input.append(scnr.nextLine()).append("\n");
        }

        System.out.println("You enter in");
        System.out.println(input.toString());
        String test = input.toString();

        // calll on func 
        int result  = count(test);

        System.out.println(result);


        scnr.close();
    }   

    
}
