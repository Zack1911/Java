class Demo{
    public static void main(String[] args) {
      
        // "data types" 
        // 1. intergral numbers
            // 1.a--> byte
              System.out.println("Byte min value : " + Byte.MIN_VALUE);
              System.out.println("Byte max value : " + Byte.MAX_VALUE);
            // 1.b-->short
              System.out.println("Short min value : " + Short.MIN_VALUE);
              System.out.println("Short max value : " + Short.MAX_VALUE);
            // 1.c-->int 
              System.out.println("Int min value : " + Integer.MIN_VALUE);
              System.out.println("Int max value : " + Integer.MAX_VALUE);
            // 1.d-->long
              System.out.println("Long min value : " + Long.MIN_VALUE);
              System.out.println("Long max value : " + Long.MAX_VALUE);
            
              long a = 2147483646677l;
              System.out.println("value of a :" + a);
        // 2. decimal numbers
            // 2.a--> float
              System.out.println("Float min value : " + Float.MIN_VALUE);  // kamse kam positive value
              System.out.println("Float max value : " + Float.MAX_VALUE);  // jada se jada postitive value
            // 2.b--> double
              System.out.println("Double min value : " + Double.MIN_VALUE);
              System.out.println("Double max value : " + Double.MAX_VALUE);
        // 3. charcters
            // 3.a--> char
              char c = 'a';
              System.out.println(c);
              System.out.println((int) c);
          
              System.out.println((char) 10084);
              System.out.println(Character.toString((char) 10084));

              System.out.println("Character min value : " +(int) Character.MIN_VALUE);
              System.out.println("character max value : " + (int) Character.MAX_VALUE);
        // 4. booleans
            // 4.a--> boolean

        //
          int ab = 10;
          System.out.println(ab);
          long cd = ab;
          System.out.println(cd);
          float de = ab;
          System.out.println(de);

          float hg = 1.73f;
          // int vf = hg; // can convert float into interger best practice typecast int vf = (int) hg;
          // System.out.println(vf);
          int kf = (int) hg;
          System.out.println(kf);  // print only 1




          byte byteValue = 10; // 1 byte
          short shortValue = byteValue; // 2 bytes
          int intValue = shortValue; // 4 bytes
          long longValue = intValue; // 8 bytes
          float floatValue = longValue; // 4 bytes  float can store value in scientic value also knwon as implicit conversion 
          double doubleValue = floatValue; // 8 bytes

          System.out.println("int: " + intValue);
          System.out.println("long: "+ longValue);
          System.out.println("float: " + floatValue);
          System.out.println("double: " + doubleValue);




         




    }
}
