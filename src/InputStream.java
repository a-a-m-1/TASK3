import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStream {
    public static void main(String[] args) throws IOException {

        int bajt;
        try(FileInputStream fis = new FileInputStream("C:\\Users\\student\\Desktop\\123.txt");
            FileOutputStream fas = new FileOutputStream("C:\\Users\\student\\Desktop\\456.txt")){
            do{
                bajt = fis.read();
                if((char)bajt== ' ') bajt = '-';
                if(bajt != -1) fas.write(bajt);
            }
            while(bajt != -1);
        }catch (IOException e){
            System.out.println("error IO");
        }



    }
}
