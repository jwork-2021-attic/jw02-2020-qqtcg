package S201250137.List;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Scene {
    public static void main(String[] args){
        new Scene().play();
    }

    public void play(){
        Line line = new Line(64);
        int[] positions = getRandom(64);
       
        for (int i = 1; i <= 64; i++ ){
            SmallMonster sm = new SmallMonster(9 * (i + 20),  i );
            line.set(sm, positions[i - 1]);
        }

        Snake snake = new Snake();
        String log = snake.startSort(line);

        BufferedWriter writer;
        try{
            writer = new BufferedWriter(new FileWriter("result.txt"));
        writer.write(log);
        writer.flush();
        writer.close();
        }
        catch(IOException ex){
            ex.printStackTrace();
        }
        


    }



    public int[] getRandom(int size){
        Random r = new Random();
        //产生随机数数组
        int[] randomNumber = new int[size];
        for (int i = 0; i < size; i++){
            randomNumber[i] = i;
        }

        for (int j = 0; j < size; j++){
            int temp = randomNumber[j];
            int tempSign = r.nextInt(size);
            randomNumber[j] = randomNumber[tempSign];
            randomNumber[tempSign] = temp;
        }
        return randomNumber;
    }
}
