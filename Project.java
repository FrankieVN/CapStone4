public class Project
{
    String nameProject;
    int numberProject;
    String buildingType;
    String addressProject;
    String numberPlot;
    float feeTotal;
    float feeToDate;
    String deadLine;
    Architect arch;
    Contractor con;
    Customer cus;
    String fin;

    public Project(String nameProject, int numberProject, String buildingType, String addressProject, String numberPlot,
                   float feeTotal, float feeToDate, String deadLine, Architect arch, Contractor con, Customer cus, String fin) {

        this.nameProject = nameProject;
        this.numberProject = numberProject;
        this.buildingType = buildingType;
        this.addressProject = addressProject;
        this.numberPlot = numberPlot;
        this.feeTotal = feeTotal;
        this.feeToDate = feeToDate;
        this.deadLine = deadLine;
        this.arch = arch;
        this.con = con;
        this.cus = cus;
        this.fin = fin;
    }
    public void setDeadLine(String newDeadLine)
    {
        deadLine = newDeadLine;
    }

    public void setFeeToDate(float newFee)
    {
        feeToDate += newFee;
    }

    public void setFinal(String newFin)
    {
        fin = newFin;
    }

    public String getProject()
    {
        return nameProject;
    }

    public String toString() {
        String output = "    " + nameProject;
        output += "\nProject Number:" + numberProject;
        output += "\nType of building:" + buildingType;
        output += "\nProject address:" + addressProject;
        output += "\nPlot Number:" + numberPlot;
        output += "\nTotal Cost:" + feeTotal;
        output += "\nDeadline:" + deadLine;
        output += "\nArchitect:" + arch;
        output += "\nContractor:" + con;
        output += "\nCustomer:" + cus;

        return output;
    }
}
