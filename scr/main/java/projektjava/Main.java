
package projektjava;

import projektjava.quartz.scheduler.SchedulerSave;
import projektjava.quartz.scheduler.SchedulerSchool;

public class Main {


    public static void main(String[] args) {
        SchedulerSave schedulersave =new SchedulerSave();
        schedulersave.SchedulerRun();
        SchedulerSchool schedulerschool = new SchedulerSchool();
        schedulerschool.SchedulerRun();

        ListOfResidents One = new ListOfResidents();
        One.Start();
        
    }


}
