package S201250137.Matrix;

public class Snake {
    private String order = "";
    Sort skill;
    private String log = "";

    public void learnSort(Sort skill){
        this.skill = skill;
    }


    public String startSort(Matrix l){
        if (skill == null){
            skill = new QuickSort();
        }
        skill.load(l.prepareToSort());
        skill.sort();
        order = skill.getProcess();

        for (String step: order.split("\n")){
            analyze(step, l);
            System.out.println(l.toString());
            log += l.toString();
            log += "\n[frame]\n";
        }
        return log;
    }


    private void analyze(String s, Matrix l){
        String[] needToChange = s.split("<->");
        Position[] temp = new Position[2];
        for (Position p : l.getLine()){
            if (p.thereIs().getSign() == Integer.parseInt(needToChange[0])){
                temp[0] = p;
            }
            else if (p.thereIs().getSign() == Integer.parseInt(needToChange[1])){
                temp[1] = p;
            }
        }
        temp[0].exchangeWith(temp[1]);
    }
    
}
