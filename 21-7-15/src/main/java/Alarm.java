public class Alarm {

    public static void main(String[] args) {
        //System.out.println(storeAlarm(25));
    }

    public static String storeAlarm(String alarmLevel, int numberOfPeople){
        String answer;
        int limit = getLimit(alarmLevel);
//        switch (alarmLevel) {
//            case "red":
//                answer = "keine Personen erlaubt";
//                break;
//            case "yellow":
//                if (numberOfPeople <= 30) {
//                    answer = "Maximale Personenzahl nicht überschritten";
//                } else {
//                    answer = "Zu viele Personen";
//                }
//                break;
//            case "green":
//                if (numberOfPeople <= 60) {
//                    answer = "Maximale Personenzahl nicht überschritten";
//                } else {
//                    answer = "Zu viele Personen";
//                }
//                break;
//            default:
//                answer = null;
//                break;
//
//        }
        if (alarmLevel.equals("red")){
            answer = "keine Personen erlaubt";
        } else if (numberOfPeople>limit){
            answer = "Zu viele Personen";
        } else {
            answer = "Maximale Personenzahl nicht überschritten";
        }

        return answer;

    }
    private static int getLimit(String alarmLevel){
        switch (alarmLevel){
            case "yellow":
                return 30;
            case "green":
                return 60;
            default:
                return 0;
        }
    }
}

