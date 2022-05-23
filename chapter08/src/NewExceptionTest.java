public class NewExceptionTest {
    public static void main(String[] args) {
        try {
            startInstall();
            copyFiles();
        } catch (SpaceException e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
            System.out.println("reinstall");
        } catch (MemoryException me) {
            System.out.println(me.getMessage());
            me.printStackTrace();
            System.gc();
            System.out.println("reinstall");
        } finally {
            deleteTempFiles();
        }
    }
    static void startInstall() throws SpaceException, MemoryException {
        if (!enoughSpace()) {
            throw new SpaceException("not enough space");
        }
        if (!enoughMemory()) {
            throw new MemoryException("not enough memory");
        }
    }
    static void copyFiles() {}
    static void deleteTempFiles() {}
    static boolean enoughSpace() { return false; }
    static boolean enoughMemory() { return true; }
}

class SpaceException extends Exception {
    SpaceException (String msg) {
        super(msg);
    }
}

class MemoryException extends Exception {
    MemoryException (String msg) {
        super(msg);
    }
}

