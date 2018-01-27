//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

import javax.swing.JOptionPane;


public class SleepyHead {


    public static void main(String[] args) {
        
        boolean isWeekday, isVacation;
        
        /*
         * Ask the user for these values using
         * JOptionPane.showConfirmDialog(null, "is it a weekday?", "",
         * JOptionPane.YES_NO_OPTION);
         */
        int g = JOptionPane.showConfirmDialog(null, "Is it a weekend?", "",
        JOptionPane.YES_NO_OPTION);
        int w = JOptionPane.showConfirmDialog(null, "Are we on vacation?", "",
        JOptionPane.YES_NO_OPTION);
        
        
        if (g == 0 || w == 0) {JOptionPane.showMessageDialog(null, "Sleep in");
			
		}
        
        else if (g == 1) {JOptionPane.showMessageDialog(null, "Get up lazybones!");
		
		}
        
        else if (w == 0 && g == 1) {JOptionPane.showMessageDialog(null, "Get up lazybones!");
		
		}
        /*
         * Print “sleep in” if it is a vacation or a weekend. If it’s a weekday,
         * print “get up lazybones!” If it is a weekday, and we are on vacation,
         * print “sleep in”.
         */
    }
}
