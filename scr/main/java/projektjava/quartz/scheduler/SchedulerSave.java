package projektjava.quartz.scheduler;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import projektjava.quartz.job.JobSave;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class SchedulerSave {

    public static void main(String[] args) throws InterruptedException {
        SchedulerRun();
    }

    public static void SchedulerRun()
    {

        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            JobDetail job = newJob(JobSave.class)
                    .withIdentity("job1", "group1")
                    .build();

            Trigger trigger = newTrigger()
                    .withIdentity("trigger1", "group1")
                    .startNow()
                    .withSchedule(cronSchedule("00/30 * * * * ?"))
                    .build();

            scheduler.scheduleJob(job, trigger);

            scheduler.start();


        } catch (SchedulerException se) {
            se.printStackTrace();
        }
    }
}

