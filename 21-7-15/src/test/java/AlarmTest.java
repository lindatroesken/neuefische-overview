import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {


    @Test
    @DisplayName("Thread level RED never allows more people")
    public void testAlarmRedToMuch(){
        // GIVEN
        int numberOfPeople = 1;
        String alarmLevel = "red";
        // WHEN
        String actual = Alarm.storeAlarm(alarmLevel, numberOfPeople);
        // THEN
        assertEquals("keine Personen erlaubt", actual);
    }

    @Test
    public void testAlarmYellowOK(){
        // GIVEN
        int person = 30;
        String alarmLevel = "yellow";
        // WHEN
        String actual = Alarm.storeAlarm(alarmLevel, person);
        //  THEN
        assertEquals("Maximale Personenzahl nicht überschritten", actual);
    }
    @Test
    public void testAlarmGreenToMuch(){
        // GIVEN
        int person = 70;
        String alarmLevel = "green";
        // WHEN
        String actual = Alarm.storeAlarm(alarmLevel, person);
        // THEN
        assertEquals("Zu viele Personen", actual);
    }



}