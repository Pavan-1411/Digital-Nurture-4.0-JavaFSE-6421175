package Logger;

public class Logger {
    private static Logger obj=null;
    private Logger()
    {
    }
    public static Logger getInstance()
    {
       if(obj==null)
       {
        obj=new Logger();
       }
       return obj;
    }
}
