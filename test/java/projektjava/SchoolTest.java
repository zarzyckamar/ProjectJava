package projektjava;

import org.junit.Before;
import org.junit.Test;
import projektjava.quartz.job.JobSchool;

import java.util.Date;
import java.util.logging.Logger;

import static java.lang.String.valueOf;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.quartz.DateBuilder.dateOf;

public class SchoolTest {

    JobSchool data;
    final static Logger logger = Logger.getLogger(valueOf(CheckPesel.class));

    @Before
    public void setUp() {
        logger.info("Odpalam setUp");
        data = new JobSchool();
    }
    @Test
    public void Lesson(){
        Date lessondata;
        lessondata=dateOf(13, 55, 43);
        assertFalse(data.isBreak(lessondata));

    }
    @Test
    public void Break(){
        Date breakdata;
        breakdata=dateOf(11, 37, 23);
        assertTrue(data.isBreak(breakdata));

    }
}