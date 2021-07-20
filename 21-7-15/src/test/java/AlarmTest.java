import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlarmTest {


    @Test
    @DisplayName("Threat level RED never allows anyone")
    public void testAlarmRedToMuch(){
        // GIVEN
        int numberOfPeople = 10;
        String alarmLevel = "red";
        // WHEN
        String actual = Alarm.storeAlarm(alarmLevel, numberOfPeople);
        // THEN
        assertEquals("keine Personen erlaubt", actual);
    }

    @Test
    @DisplayName("Threat level yellow allows up to 30 people")
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
    @DisplayName("Threat level green does not allow more than 60 people")
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