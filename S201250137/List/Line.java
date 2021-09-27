package S201250137.List;

public class Line {
    private Position[] line;
    
    public Position[] getLine(){
        return line;
    }

    public Line(int length){
        line = new Position[length];
    }

    public void set(SmallMonster sm, int position){
        if (line[position] == null){
            line[position] = new Position();
        }
        line[position].belongTo(sm);
        sm.setPosition(line[position]);
    }

    public int[] prepareToSort(){
        int[] numberLine = new int[line.length];
        for (int i = 0; i < line.length; i++){
            numberLine[i] = line[i].thereIs().getSign();
        }
        return numberLine;
    }

    public String toString(){
        String snapShot = "";
        for (int i = 0; i < line.length; i++){
            snapShot += line[i].thereIs().toString();
        }
        return snapShot;
    }

}
