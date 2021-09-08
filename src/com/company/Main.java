package com.company;

public class Main {
//Code executes 18 times. Look to the comments below to follow the processing path.
        public static void main(String[] args) {                //1
            zippo("rattle", 13);                     //2
        }                                                       //18
        public static void baffle(String blimp) {               //8
            System.out.println(blimp);                          //9
            zippo("ping", -5);                       //10
        }                                                       //14 + 17
        public static void zippo(String quince, int flag) {     //3
            if (flag < 0) {                                     //4 + 11
                System.out.println(quince + " zoop");           //12
            } else {                                            //5
                System.out.println("ik");                       //6
                baffle(quince);                                 //7
                System.out.println("boo-wa-ha-ha");             //15
            }
        }                                                       //13 + 16
    }
//The parameter "blimp" has the value "rattle", when "baffle" gets invoked.
//The output of this program is:
//ik
//rattle
//ping zoop
//boo-wa-ha-ha

