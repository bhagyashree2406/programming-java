package entities;

public class Address {
    String flatNum;
    String lineNum;
    String taluka;
    String district;
    String state;

    public Address() {
    }

    public String getFlatNum(){
        return flatNum;
    }
    public void setFlatNum(String flatNum){
        this.flatNum =flatNum;
    }

    public String getLineNum() {
        return lineNum;
    }

    public void setLineNum(String lineNum) {
        this.lineNum = lineNum;
    }

    public String getTaluka() {
        return taluka;
    }

    public void setTaluka(String taluka) {
        this.taluka = taluka;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Address{" +
                "flatNum='" + flatNum + '\'' +
                ", lineNum='" + lineNum + '\'' +
                ", taluka='" + taluka + '\'' +
                ", district='" + district + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}