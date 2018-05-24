import java.awt.*;

public class Mouse {

    public Mouse() {

    }

    // moves mouse with x y
    public void moveMouse(int x, int y) {
        try {
            Robot robot = new Robot();

            robot.mouseMove(x,y);
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    public void mouseClick() {

    }
}
