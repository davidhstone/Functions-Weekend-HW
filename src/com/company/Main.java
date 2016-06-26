package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

    }

        //Problem 1
        public boolean sleepIn(boolean weekday, boolean vacation) {

            //if weekday == true >>> sleepIn == false
            // if not weekday == true && vacation == true >>>> sleepIn == true

            if (vacation == true || (!(weekday == true))) {
                return true;
            }

            else {
                return false;
            }

        }

        //Problem 2
        public int sumDouble(int a, int b) {

            if ( a == b) {
                return 2*(a+b);
            }
            else {
                return a+b;
            }
        }

        //Problem 3
        public int close10(int a, int b) {

            int diffA = 10 - a;
            int diffB = 10 - b;

            if ( Math.abs(diffA) > Math.abs(diffB) )  {
                return b;
            }

            else if (Math.abs(diffA) < Math.abs(diffB) ) {
                return a;
            }

            else {
                return 0;
            }
        }

        //Bonus 1
        public String frontBack(String str) {

            String firstChar = Character.toString(str.charAt(0));
            String lastChar = Character.toString(str.charAt(str.length() - 1));
            String newString = "";
            String s;
            s = "";
            String blankString = "";

            for (char i = 1; i < (str.length() - 1); i++) {
                newString = newString.concat(Character.toString(str.charAt(i)));
            }

            //for (char i = 0; i < (str.length());) {
            //  newString = str;
            //}

            if (str.length() <= 1) {
                return str;
            }
            if (s == str) {
                return null;
            }
            newString = lastChar + newString + firstChar;
            return newString;

        }

    //Bonus 2
        public String notString(String str) {

            String testString = "not";
            String frontString = "";

            if (str.length() >= 3) {
                for (char i = 0; i < 3; i++) {
                    frontString = frontString.concat(Character.toString(str.charAt(i)));
                }
            }

            if (!(testString.equals(frontString))) {
                str = testString + " " + str;
            }

            return str;

        }
}
