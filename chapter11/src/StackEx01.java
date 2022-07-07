import java.util.*;

public class StackEx01 {
    public static Stack back = new Stack();
    public static Stack forward = new Stack();

    public static void main(String[] args) {
        goURL("1.NATE");
        goURL("2.YAHOO");
        goURL("3.NAVER");
        goURL("4.GOOGLE");

        printStatus();

        goBack();
        System.out.println("back");
        printStatus();
        goBack();
        System.out.println("back");
        printStatus();
        goForward();
        System.out.println("forward");
        printStatus();

        goURL("Youtube");
        System.out.println("new URL");
        printStatus();
    }

    public static void printStatus() {
        System.out.println("back:" + back);
        System.out.println("forward: " + forward);
        System.out.println(back.peek());
        System.out.println();
    }

    public static void goURL(String url) {
        back.push(url);
        if (!forward.empty()) {
            forward.clear();
        }
    }

    public static void goForward() {
        if (!forward.empty()) {
            back.push(forward.pop());
        }
    }

    public static void goBack() {
        if (!back.empty()) {
            forward.push(back.pop());
        }
    }
}
