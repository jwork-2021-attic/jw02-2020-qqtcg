package S201250137.Matrix;

public class Position {
    private SmallMonster sm;

    public void belongTo(SmallMonster sm){
        this.sm = sm;
    }

    public SmallMonster thereIs(){
        return sm;
    }
    
    public void exchangeWith(Position p){
       SmallMonster tempSM = p.thereIs();
       p.belongTo(this.sm);
       this.sm.setPosition(p);
       this.belongTo(tempSM);
       tempSM.setPosition(this);
    }
}
