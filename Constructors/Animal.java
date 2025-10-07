package Constructors;

public class Animal{

    private String aniName;
    public String getAniName() {
        return aniName;
    }
    public Animal (String aniName) {
        this.aniName = aniName;
    }




    int aniWeight;
    String aniID;

    public Animal (String myName, int theWeight, String someID) {
        aniName = myName;
        aniWeight = theWeight;
        aniID = someID;
    }
}
