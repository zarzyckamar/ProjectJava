package projektjava;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.io.IOException;

public class JobSave implements org.quartz.Job {

    public JobSave() throws IOException {

    }

    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.err.println("Hello World!  MyJob is executing.");
    }
}