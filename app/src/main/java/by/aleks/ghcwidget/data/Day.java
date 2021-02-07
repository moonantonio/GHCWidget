package by.aleks.ghcwidget.data;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Alex on 12/8/14.
 */
public class Day {

    private int level;
    private int commitsNumber;
    private Calendar calendar = Calendar.getInstance();

    public Day(Date date, int commitsNumber, String color) {
        this.calendar.setTime(date);
        this.commitsNumber = commitsNumber;
        this.level = setLevel(color);
    }

    public String toString() {
        return "Date:" + calendar.toString() + " Commits:" + commitsNumber + " Level:" + level;
    }

    private int setLevel(String color) {

        // normal color scheme

        if (color.equals("#ebedf0"))
            return 0;
        if (color.equals("#9be9a8"))
            return 1;
        if (color.equals("#40c463"))
            return 2;
        if (color.equals("#30a14e"))
            return 3;
        if (color.equals("#216e39"))
            return 4;

        // spooky color scheme (only on halloween)

        if (color.equals("#eeeeee"))
            return 0;
        if (color.equals("#ffee4a"))
            return 1;
        if (color.equals("#ffc501"))
            return 2;
        if (color.equals("#fe9600"))
            return 3;
        if (color.equals("#03001c"))
            return 4;

        if (color.equals("var(--color-calendar-graph-day-bg)"))
            return 0;
        if (color.equals("var(--color-calendar-graph-day-L1-bg)"))
            return 1;
        if (color.equals("var(--color-calendar-graph-day-L2-bg)"))
            return 2;
        if (color.equals("var(--color-calendar-graph-day-L3-bg)"))
            return 3;
        if (color.equals("var(--color-calendar-graph-day-L4-bg)"))
            return 4;

        throw new IllegalArgumentException("Can't find the color!");
    }

    public int getLevel() {
        return level;
    }

    public int getCommitsNumber() {
        return commitsNumber;
    }

    public void setCommitsNumber(int commitsNumber) {
        this.commitsNumber = commitsNumber;
    }

    public String getMonthName(){
        return new SimpleDateFormat("MMM").format(calendar.getTime());
    }
    public int getYear(){ return Integer.parseInt(new SimpleDateFormat("yyyy").format(calendar.getTime())); }

    public boolean isFirst(){
        //return firstDayInMonth;
        return calendar.get(Calendar.DAY_OF_MONTH)==1;
    }

}
