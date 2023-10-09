package Factory.Factory1;

public class Flutter {

    public Uifactory createfactory(String platform){
        if (platform.equals("Android")){
            return new AndroidUuifactory();
        }
        else if (platform.equals("Ios")){
            return new IosUifactory();
        }
         return null;
    }
}
// 2 problems 1. lot of if else condtions in main class.
//2.if we made error in writting Ios in client . it gives null pointer exception.
//for 1st problem.. we move all if else conditions outside.
//we make enum of platforms to minimise the problem
//new implementation at factory 2.