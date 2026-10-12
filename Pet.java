
public class Pet {
    private String ID;
    private String name;
    private String dateTime;
    private String birthDate;
    private double ageAtDateTime;
    private double ageCurrent;
    private String outcomeType;
    private String type;
    private String sex;
    private String breed;

    // Constructor
    public Pet(String ID, String name, String dateTime, String birthDate,
               String outcomeType, String type, String sex, String breed) {
        this.ID = ID;
        if (name.equals(""))
                this.name = ID;
        else
                this.name = name;
        this.dateTime = dateTime;
        this.birthDate = birthDate;
        this.outcomeType = outcomeType;
        this.type = type;
        this.sex = sex;
        this.breed = breed;
    }

    // Getters and Setters
    public String getID() { return ID; }


    public void setAgeAtDateTime() {
        int[] birth = DateUtils.parseDate(birthDate);
        int[] now = DateUtils.parseDateTime(dateTime);
        int jd1 = DateUtils.dateToJulian(birth[0], birth[1], birth[2]);
        int jd2 = DateUtils.dateToJulian(now[0], now[1], now[2]);
        int daysDiff = jd2 - jd1;
        this.ageAtDateTime = daysDiff / 365.25;
    }
    
    public void setAgeCurrent() {

        this.ageCurrent = 0;
    }
}
