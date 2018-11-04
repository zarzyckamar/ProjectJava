package projektjava.quartz.job;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.io.FileWriter;
import java.io.IOException;


//Simplest job is a class that implements Job interface (execute method)
public class JobSave implements org.quartz.Job {

    int i = 0;


    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {

   //     JobKey jobKey = JobExecutionContext.getJobDetail().getKey();

  //      JobDataMap PersonStorage = JobExecutionContext.getJobDetail().getJobDataMap();

      //  HashMap<String, ArrayList<Person>> PersonStorage =ListOfResidents.getX();


        try {
            FileWriter zapis = new FileWriter("odp.txt");

            zapis.write("dupa");

            zapis.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(jobExecutionContext.getFireTime());




    }
}
