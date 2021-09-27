package S201250137.Matrix;

public class Matrix {
    private Position[] matrix;
    private int len;
    public Position[] getLine(){

        return matrix;
    }

    public Matrix(int length){
        matrix = new Position[length];
        len = (int)Math.pow((double)length, 0.5);
    }

    public void set(SmallMonster sm, int position){
        if (matrix[position] == null){
            matrix[position] = new Position();
        }
        matrix[position].belongTo(sm);
        sm.setPosition(matrix[position]);
    }

    public int[] prepareToSort(){
        int[] numberLine = new int[matrix.length];
        for (int i = 0; i < matrix.length; i++){
            numberLine[i] = matrix[i].thereIs().getSign();
        }
        return numberLine;
    }

    public String toString(){
        String snapShot = "";
        for (int i = 0; i < matrix.length; i++){
            snapShot += matrix[i].thereIs().toString();
            if ((i + 1) % len == 0){
                snapShot += "\n";
            }
        }
        return snapShot;
    }

}
