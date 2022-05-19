public class Exercise07_05 {

    static void action(Robot r) {
        if (r instanceof DanceRobot) {
            DanceRobot.dance();
        } else if (r instanceof SingRobot) {
            SingRobot.sing();
        } else if (r instanceof DrawRobot) {
            DrawRobot.draw();
        }
    }

    public static void main(String[] args) {
        Robot[] arr = {new DanceRobot(), new SingRobot(), new DrawRobot()};
        for (int i = 0; i < arr.length; i++) {
            action(arr[i]);
        }
    }
}
class Robot {}
class DanceRobot extends Robot {
    static void dance() {
        System.out.println("DANCING!@");
    }
}

class SingRobot extends Robot {
    static void sing() {
        System.out.println("SINGING!");
    }
}

class DrawRobot extends Robot {
    static void draw() {
        System.out.println("Drawing");
    }
}