package S201250137.List;

import java.util.Random;

public class SmallMonster {
    Position p;
    private final int sign;
    private final int r;
    private final int g;
    private final int b;

    public SmallMonster(int sign){
        Random r = new Random();
        this.r = r.nextInt(255);
        this.g = r.nextInt(255);
        this.b = r.nextInt(255);
        this.sign = sign;

    }

    public SmallMonster(int rgb, int sign){
        if (rgb >= 0 && rgb <= 255){
            this.r = rgb;
            this.b = 0;
            this.g = 0;
        }
        else if (rgb > 255 && rgb <= 510){
            this.r = 255;
            this.g = rgb - 255;
            this.b = 0;
        }
        else {
            this.r = 255;
            this.g = 255;
            this.b = rgb - 510;
        }
        
        this.sign = sign;
    }

    public int getSign(){
        return sign;
    }

    public void setPosition(Position p){
        this.p = p;
        p.belongTo(this);
    }

    public Position getPosition(){
        return p;
    }

    public String toString() {
        int length = String.valueOf(sign).length();
        
        return "\033[48;2;" + this.r + ";" + this.g + ";" + this.b + ";38;2;0;0;0m    " + " ".repeat(3 - length) + this.sign + "  \033[0m";
    }
}
