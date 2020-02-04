import java.util.ArrayList;

public class CollegeDB {
    private ArrayList<College> colleges;

    public CollegeDB(){

    }
    //overloaded constructor
    public CollegeDB(ArrayList<College> colleges){
        this.colleges = colleges;
    }

    public ArrayList<College> getColleges(){
        return this.colleges;
    }

    public void setColleges(ArrayList<College> colleges) {
        this.colleges = colleges;
    }
}
