public class Dragon
{
    public String dragType;
    public int dragPower;
    public String name;

    public Dragon(String name, int dragPower, String dragType)
    {
        setDragType(dragType);
        setDragPower(dragPower);
        setName(name);
    }

    public Dragon()
    {
        dragType =" ";
        dragPower = 0;
        name = " ";
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name) {
        if(name.matches("[A-Z][a-z]*"))
        {
            this.name = name;
        }
        else
            this.name = "Are you dumb";
    }

    public int getDragPower()
    {
        return dragPower;
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

    @Override
    public String toString() {
        return "Dragon{" +
                "name='" + name + '\'' +
                ", Power=" + dragPower +
                ", Type='" + dragType + '\'' +
                '}';
    }
}
