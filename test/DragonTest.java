import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DragonTest
{
    @Test
    void typeDragPass()
    {
        Dragon jin = new Dragon("Red_1");
        assertTrue(jin.getDragType().matches("Red_1"));
    }

    @Test
    void typeDragSetterPass()
    {
        Dragon jin = new Dragon("Red_1");
        jin.setDragType("Blue_1");
        assertTrue(jin.getDragType().matches("Blue_1"));
    }

    @Test
    void typeDragRegexPass()
    {
        Dragon jin = new Dragon();
        jin.setDragType("Blue_1");
        assertTrue(jin.getDragType().matches("Blue_1"));
    }

    @Test
    void typeDragRegexFailNoFirstCap()
    {
        Dragon jin = new Dragon();
        jin.setDragType("blue_1");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void typeDragRegexFailCapsAfterFirst()
    {
        Dragon jin = new Dragon();
        jin.setDragType("BlUe_1");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void typeDragRegexFailNoUnderScore()
    {
        Dragon jin = new Dragon();
        jin.setDragType("Blue1");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void typeDragRegexFailLetterAtEnd()
    {
        Dragon jin = new Dragon();
        jin.setDragType("Blue_C");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void typeDragRegexFailSpecialLetterAtEnd()
    {
        Dragon jin = new Dragon();
        jin.setDragType("Blue_$");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void typeDragRegexFailNumberOutOfBounds()
    {
        Dragon jin = new Dragon();
        jin.setDragType("Blue_11");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void typeDragRegexFailSpaceInName()
    {
        Dragon jin = new Dragon();
        jin.setDragType("Red Green_1");
        assertTrue(jin.getDragType().matches("Are you dumb"));
    }

    @Test
    void dragPowerPass()
    {
        Dragon jin = new Dragon();
        jin.setDragPower(8);
        assertTrue(jin.getDragPower()==8);
    }
}