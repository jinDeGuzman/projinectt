public class Dragon
{
    public String dragType;
    public int dragPower;
    public Dragon(String dragType)
    {
        this.dragType = dragType;
    }

    public Dragon(int dragPower)
    {
        this.dragPower = 0;
    }
    public Dragon()
    {
        dragType ="";
        dragPower = 0;
    }

    public int getDragPower() {return dragPower;
    }

    public void setDragPower(int dragPower) {
        this.dragPower = dragPower;
    }

    public String getDragType() {
        return dragType;
    }

    //public void setDragType(String dragType) {
    //    this.dragType = dragType;
    //}
    public void setDragType(String dragType)
    {
        if(dragType.matches("[A-Z][a-z]*_[0-9]"))
        {
            this.dragType = dragType;
        }
        else
            this.dragType = "Are you dumb";
    }//3 digits - 2 - 4
}
