public class DateDemo {
    public static void main (String[] args){

        //Date dateDemo = new Date(); //возьмет значения по умолчанию (1.1.1970)

        Date dateDemo = new Date(13,11,1988);
        dateDemo.printData();

        DateTime timeDemo = new DateTime(23, 23, 23);

        ExtendedTime extendedTime = new ExtendedTime(111);

        timeDemo.printTime();

        timeDemo.printDateTime();

        extendedTime.printFullTime();

    }
}
