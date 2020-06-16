public class Wochentag {


    private int[] monthVal = {1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6};
    private String[] days = {"Samstag", "Sonntag", "Montag", "Dienstag", "Mittwoch", "Donnerstag", "Freitag"};



    public void printWochentag(int pTag, int pMonat, int pJahr) {

        int arrayDay = pTag -1;
        int yearVal = (((pJahr/10)%10)*10) + (pJahr%10);
        int century = (((pJahr/10/10/10)%10)*10) + (((pJahr/10/10)%10));
        int centuryVal = 0;

        switch (century) {
            case 18:
                centuryVal = 2; break;
            case 19:
                centuryVal = 0; break;
            case 20:
                centuryVal = 6; break;
            case 21:
                centuryVal = 4; break;
            default:
                System.exit(0);
        }

        int dayVal = ((((yearVal + yearVal/4) + monthVal[(pMonat-1)]) + pTag) + centuryVal);

        if(pJahr%4 == 0 && (pJahr%100 != 0 || pJahr%400 == 0)) {
            if (pMonat == 1 || pMonat == 2) {
                dayVal -= 1;
            }
        }

        int arrayDayVal = dayVal%7;


        System.out.println();
        System.out.println(days[arrayDayVal]);

    }
}
