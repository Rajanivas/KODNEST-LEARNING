package method;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
public class Bufferinput {

	public static void main(String[] args) {
		try (FileOutputStream fileOutputStream = new FileOutputStream("output.txt");
	     BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream)) {
			String data = "Hello, World!";
	        byte[] bytes = data.getBytes();
	        bufferedOutputStream.write(bytes);

	            // Remember to flush or close the buffered output stream to ensure all data is written.
	        bufferedOutputStream.flush();

	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	    }
    }