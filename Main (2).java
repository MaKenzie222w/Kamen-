class Main{
         public static void sun() {
             System.out.println("kamen");
         }
         public static void summer(int temp) {
                  if( temp > 50 ){
                          System.out.print(" * ");
                          temp-=1;
                          summer( temp );
                  }
         }
         public static void main(String [] args ) {
                       summer( 91 );
                       sun();
             }
           }  
             