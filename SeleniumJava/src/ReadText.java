import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
public class ReadText {

	public static void main(String[] args) throws IOException {
		String Fpath = "C:\\Users\\cheta\\Desktop\\SeleniumJava\\Read.txt";
		BufferedReader bf = new BufferedReader (new FileReader(Fpath));
		String startline;
		while((startline = bf.readLine()) != null) {
			System.out.println(startline);	
		}
	}
}
