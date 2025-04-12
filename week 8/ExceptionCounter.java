import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionCounter {
    public static void countExceptions(String filepath) throws IOException{
        File myfile=new File(filepath);
        FileReader fr=new FileReader(myfile);
        int exceptioncount=0;
        String line;
        BufferedReader br=new BufferedReader(fr);
        while((line=br.readLine())!=null){
            if(line.contains("catch")){
                exceptioncount++;
            }
        }
        System.out.println("Number of try blocks in the file are: "+exceptioncount);
        fr.close();
        
    }

    public static void main(String[] args) {
        try {
            countExceptions("demo.java");
        }catch(IOException e){
            System.out.println("File not found");
        }
    }
}