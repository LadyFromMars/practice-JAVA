public class TwiceAsOld{

  public static int TwiceAsOld(int dadYears, int sonYears){
   int i = 0 ;
     if (sonYears*2 < dadYears) {
    for( i=1 ; i < dadYears ; i++) {

     if ( (sonYears+i) *2 == dadYears+i) { return i  ;}
      }
    }

    if(sonYears*2 > dadYears)
    for( i=1; i<dadYears ; i++) {

     if ( (sonYears-i)*2 == dadYears-i) { return i ;}

    }
     return  i ;
  }
}
