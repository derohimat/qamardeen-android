package com.batoulapps.QamarDeen.data;


public class QamarConstants {
   
   public static class Prayers {
      public static int FAJR = 0;
      public static int DUHA = 1;
      public static int DHUHR = 2;
      public static int ASR = 3;
      public static int MAGHRIB = 4;
      public static int ISHA = 5;
      public static int QIYYAM = 6;
    };
    
    public static int[] PRAYER_LIST = new int[]{ 
       Prayers.FAJR, Prayers.DHUHR, Prayers.ASR,
       Prayers.MAGHRIB, Prayers.ISHA };
    
}
