package zhuanshiPattern;

public class Sinlenton {
    //通过volatile关键字来确保安全
    //加个volatile可以防止JVM指令重排序时导致的并非单例
    private static volatile Sinlenton  sin;
    
    private Sinlenton(){}
    
    public static Sinlenton getSinlenton(){
        if(sin==null){
            synchronized(Sinlenton.class){
                if(sin==null){
                    sin = new Sinlenton();
                    return sin;
                }
            }
        }
        return sin;
    }
}
