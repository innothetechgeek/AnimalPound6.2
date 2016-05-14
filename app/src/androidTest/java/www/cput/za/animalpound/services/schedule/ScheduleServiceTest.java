package www.cput.za.animalpound.services.schedule;

import android.test.AndroidTestCase;

import www.cput.za.animalpound.conf.App;
import www.cput.za.animalpound.domain.Schedule;
import www.cput.za.animalpound.services.schedule.Impl.ScheduleServiceImpl;

/**
 * Created by Game330 on 2016-05-14.
 */
public class ScheduleServiceTest extends AndroidTestCase {
    private ScheduleServiceImpl scheduleService;

    public void testSaveSchedule() throws Exception {

        Schedule schedule = new Schedule.Builder()
                .scheduleId(Long.parseLong("123213"))
                .time("14:45")
                .activity("To Adopt an animal")
                .build();
        scheduleService = new ScheduleServiceImpl();
        scheduleService.addSchedule(App.getAppContext());
        scheduleService.saveSchedule(schedule);
        System.out.print("ScheduleSaved!!");
    }
}
