class day1{

    public int leftDirection(int input , int current){
        return (current - input) % 100;
    }

    public int rightDirection(int input, int current){
        return (current + input) % 100;
    }

    public int count(String input){
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
}