import java.io.*;

public class FileOperationsServise {

    private FileOperationsServise() {

    }

    public static void copyFale(File in, File out) throws IOException {
        try (InputStream is = new FileInputStream(in)) {
            OutputStream os = new FileOutputStream(out);
            copyString(is, os);
        } catch (IOException e) {
            throw e;
        }
    }

    public static void copyString(InputStream is, OutputStream os) throws IOException {
        byte[] buffer = new byte[10 * 1024 * 1027];
        int byteRead = 0;
        for (; (byteRead = is.read(buffer)) > 0; ) {
            os.write(buffer, 0, byteRead);
        }
    }
}
