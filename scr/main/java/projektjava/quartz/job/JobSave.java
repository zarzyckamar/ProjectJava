package projektjava.quartz.job;

import org.quartz.JobExecutionContext;
import projektjava.ListOfResidents;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


//Simplest job is a class that implements Job interface (execute method)
public class JobSave implements org.quartz.Job {


    public void execute(JobExecutionContext jobExecutionContext)

    {

        String a = ListOfResidents.getInfo();


        try {
            toFile(a);
            System.out.println("Zapis do pliku wykonany");


        } catch (IOException e) {
            e.printStackTrace();

        }

        System.out.println(jobExecutionContext.getFireTime());
    }

    public static void toFile(String data) throws IOException
    {
        BufferedWriter writer = new BufferedWriter(new FileWriter("odp.txt"));
        writer.write(data);
        writer.close();
        FileReader fileReader = new FileReader("odp.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String input;
        List<String> lineList =new ArrayList<String>();
        while((input = bufferedReader.readLine())!= null)
        {
            lineList.add(input);

        }
        fileReader.close();

        Collections.sort(lineList);
        Writer fileWriter =new FileWriter("odp.txt");
        PrintWriter out = new PrintWriter(fileWriter);
        for(String outputLine : lineList)
        {
            out.println(outputLine);
            out.println();
        }
        out.flush();
        out.close();
        fileWriter.close();


    }
}