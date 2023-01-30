package Main;

import java.util.HashMap;

public class IdAndPasswords {

    HashMap<String, String> logInfo = new HashMap<String,String>();

    IdAndPasswords() {
        //Here we add more key value pairs for users and passwords
        logInfo.put("Test", "test123");
        logInfo.put("Test2", "test1234");
        logInfo.put("Test3", "test1235");
    }

    protected HashMap<String, String> getLogInfo() {
        return logInfo;
    }
}
