import java.io.File;

public class ExceptionEx16 {
    public static void main(String[] args) {
        try {
            File f = createFile(args[0]);
            System.out.println(f.getName());
        } catch (Exception e) {
            System.out.println(e.getMessage() + ", re");
        }
    }

    static File createFile(String fileName) throws Exception {

        if (fileName == null || fileName.equals("")) {
            throw new Exception("invalid file name");
        }
        File f = new File(fileName);
        f.createNewFile();
        return f;
    }
}