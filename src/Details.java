public class Details {

    private int empId;
    private String name;
    private String location;

    Details(){
        this.empId=0;
        this.name="";
        this.location="";
    }

    Details(int empId,String name,String location){

        this.empId=empId;
        this.name=name;
        this.location=location;

    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "empId="+empId+" Name="+name+" location="+location;
    }
}
