package Practice.FootballClub;

public class Field {
    private int width;
    private int length;
    private FieldStatus status;


    public Field(int width, int length){
        this.width = width;
        this.length = length;
        status = FieldStatus.MAINTENANCE_NEEDED;
    }
    public String toString(){
        return "Field:"+ width +"x"+ length +"m State:"+ status;
    }

    public void doMaintenance(){
        if(status == FieldStatus.MAINTENANCE_NEEDED){
            status = FieldStatus.READY_FOR_PLAY;
            System.out.println("Maintenance is done!");
        } else if(status  == FieldStatus.BUSY){
            System.out.println("Maintenance can not be performed during play.");
        } else{
            System.out.println("No Maintenance needed.");
        }
    }

}

