
package projektjava;

import projektjava.quartz.scheduler.SchedulerSave;

public class Main {


    public static void main(String[] args) {
        SchedulerSave scheduler =new SchedulerSave();
        scheduler.SchedulerRun();

        ListOfResidents One = new ListOfResidents();
        One.Start();

        
    }


}
