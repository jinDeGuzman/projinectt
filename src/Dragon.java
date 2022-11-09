public class Dragon
{
    public String dragType;
    public int dragPower;
    public String name;

    public Dragon(String dragType)
    {
        setDragType(dragType);
        setDragPower(dragPower);
        setName(name);
    }

    public Dragon()
    {
        dragType ="";
        dragPower = 0;
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDragPower() {return dragPower;
    }

    public void setDragPower(int dragPower) {
        if(dragPower <= 10 && dragPower >= 0)
        {
            this.dragPower = dragPower;
        }
        else
            this.dragPower= -10;
    }

    public String getDragType() {
        return dragType;
    }

    public void setDragType(String dragType)
    {
        if(dragType.matches("[A-Z][a-z]*_[0-9]"))
        {
            this.dragType = dragType;
        }
        else
            this.dragType = "Are you dumb";
    }
}
