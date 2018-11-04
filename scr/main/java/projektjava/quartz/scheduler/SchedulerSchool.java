package projektjava.quartz.scheduler;

import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.impl.StdSchedulerFactory;
import projektjava.quartz.job.JobSchool;

import static org.quartz.CronScheduleBuilder.cronSchedule;
import static org.quartz.JobBuilder.newJob;
import static org.quartz.TriggerBuilder.newTrigger;

public class SchedulerSchool {

    public static void main(String[] args) throws InterruptedException
    {
        SchedulerRun();
    }

    public static void SchedulerRun()
    {

        try {
            Scheduler scheduler = StdSchedulerFactory.getDefaultScheduler();

            JobDetail job = newJob(JobSchool.class)
                    .withIdentity("job2", "group2")
                    .build();

            Trigger trigger = newTrigger()
                    .withIdentity("trigger2", "group2")
                    .startNow()
                    .withSchedule(cronSchedule("0 0/1 * * * ?"))
                    .build();

            scheduler.scheduleJob(job, trigger);

            scheduler.start();


        } catch (SchedulerException se) {
            se.printStackTrace();
        }
    }
}

