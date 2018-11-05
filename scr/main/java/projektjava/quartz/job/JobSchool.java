package projektjava.quartz.job;
import org.quartz.JobExecutionContext;

import java.util.Date;

import static org.quartz.DateBuilder.dateOf;

public class JobSchool implements org.quartz.Job {

    public void execute(JobExecutionContext jobExecutionContext) {
        Date data = new Date();
        isBreak(data);
        System.out.println(howmanytime(data));


    }

    public static Boolean isBreak(Date data) {
        if ((data.after(dateOf(00, 00, 00)) && data.before(dateOf(8, 15, 00)))
                || (data.after(dateOf(9, 45, 00)) && data.before(dateOf(10, 00, 00)))
                || (data.after(dateOf(11, 30, 00)) && data.before(dateOf(11, 45, 00)))
                || (data.after(dateOf(13, 15, 00)) && data.before(dateOf(13, 45, 00)))
                || (data.after(dateOf(15, 15, 00)) && data.before(dateOf(15, 30, 00)))
                || (data.after(dateOf(17, 00, 00)) && data.before(dateOf(17, 15, 00)))
                || (data.after(dateOf(18, 45, 00)) && data.before(dateOf(23, 59, 59)))) {
            return true;
        } else return false;
    }

    public String howmanytime(Date data) {
        if (isBreak(data) == true) {
            if (
                    (data.after(dateOf(00, 00, 00)) && data.before(dateOf(8, 15, 00)))) {
                Date enddata = dateOf(8, 15, 00);
                long current, end, result;
                current = data.getTime(); //nanosekundy
                end = enddata.getTime();
                result = (end - current) / 60000;
                return "Do końca przerwy zostało: " + result + "minut";

            }
            if ((data.after(dateOf(9, 45, 00)) && data.before(dateOf(10, 00, 00)))) {
                Date enddata2 = dateOf(10, 00, 00);
                long current2, end2, result2;
                current2 = data.getTime(); //nanosekundy
                end2 = enddata2.getTime();
                result2 = (end2 - current2) / 60000;
                return "Do końca przerwy zostało: " + result2 + "minut";

            }
            if ((data.after(dateOf(11, 30, 00)) && data.before(dateOf(11, 45, 00)))) {
                Date enddata3 = dateOf(11, 45, 00);
                long current3, end3, result3;
                current3 = data.getTime(); //nanosekundy
                end3 = enddata3.getTime();
                result3 = (end3 - current3) / 60000;
                return "Do końca przerwy zostało: " + result3 + "minut";
            }
            if ((data.after(dateOf(13, 15, 00)) && data.before(dateOf(13, 45, 00)))) {
                Date enddata4 = dateOf(13, 45, 00);
                long current4, end4, result4;
                current4 = data.getTime(); //nanosekundy
                end4 = enddata4.getTime();
                result4 = (end4 - current4) / 60000;
                return "Do końca przerwy zostało: " + result4 + "minut";
            }
            if ((data.after(dateOf(15, 15, 00)) && data.before(dateOf(15, 30, 00)))) {
                Date enddata5 = dateOf(15, 30, 00);
                long current5, end5, result5;
                current5 = data.getTime(); //nanosekundy
                end5 = enddata5.getTime();
                result5 = (end5 - current5) / 60000;
                return "Do końca przerwy zostało: " + result5 + "minut";
            }
            if ((data.after(dateOf(17, 00, 00)) && data.before(dateOf(17, 15, 00)))) {
                Date enddata6 = dateOf(17, 15, 00);
                long current6, end6, result6;
                current6 = data.getTime(); //nanosekundy
                end6 = enddata6.getTime();
                result6 = (end6 - current6) / 60000;
                return "Do końca przerwy zostało: " + result6 + "minut";
            }
            if ((data.after(dateOf(18, 45, 00)) && data.before(dateOf(23, 59, 59)))) {
                Date enddata7 = dateOf(23, 59, 59);
                long current7, end7, result7;
                current7 = data.getTime(); //nanosekundy
                end7 = enddata7.getTime();
                result7 = (end7 - current7) / 60000;
                return "Do końca przerwy zostało: " + result7 + "minut";
            } else return "error";
        } else {
            if ((data.after(dateOf(8, 15, 00)) && data.before(dateOf(9, 45, 00)))) {
                Date enddata8 = dateOf(9, 45, 00);
                long current8, end8, result8;
                current8 = data.getTime(); //nanosekundy
                end8 = enddata8.getTime();
                result8 = (end8 - current8) / 60000;
                return "Do końca zajęć zostało: " + result8 + "minut";
            }
            if ((data.after(dateOf(10, 00, 00)) && data.before(dateOf(11, 30, 00)))) {
                Date enddata9 = dateOf(11, 30, 00);
                long current9, end9, result9;
                current9 = data.getTime(); //nanosekundy
                end9 = enddata9.getTime();
                result9 = (end9 - current9) / 60000;
                return "Do końca zajęć zostało: " + result9 + "minut";
            }

            if ((data.after(dateOf(11, 45, 00)) && data.before(dateOf(13, 15, 00)))) {
                Date enddata10 = dateOf(13, 15, 00);
                long current10, end10, result10;
                current10 = data.getTime(); //nanosekundy
                end10 = enddata10.getTime();
                result10 = (end10 - current10) / 60000;
                return "Do końca zajęć zostało: " + result10 + "minut";
            }
            if ((data.after(dateOf(13, 45, 00)) && data.before(dateOf(15, 15, 00)))) {
                Date enddata11 = dateOf(15, 15, 00);
                long current11, end11, result11;
                current11 = data.getTime(); //nanosekundy
                end11 = enddata11.getTime();
                result11 = (end11 - current11) / 60000;
                return "Do końca zajęć zostało: " + result11 + "minut";
            }
            if ((data.after(dateOf(15, 30, 00)) && data.before(dateOf(17, 00, 00)))) {
                Date enddata12 = dateOf(17, 00, 00);
                long current12, end12, result12;
                current12 = data.getTime(); //nanosekundy
                end12 = enddata12.getTime();
                result12 = (end12 - current12) / 60000;
                return "Do końca zajęć zostało: " + result12 + "minut";
            }
            if ((data.after(dateOf(17, 15, 00)) && data.before(dateOf(18, 45, 00)))) {
                Date enddata13 = dateOf(18, 45, 00);
                long current13, end13, result13;
                current13 = data.getTime(); //nanosekundy
                end13 = enddata13.getTime();
                result13 = (end13 - current13) / 60000;
                return "Do końca zajęć zostało: " + result13 + "minut";
            }
        }return "blad";
    }
}

