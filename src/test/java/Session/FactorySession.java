package Session;

public class FactorySession {
    public static SessionInterface make(String sessionType){
        SessionInterface session;
        switch (sessionType.toLowerCase()){
            default:
                session= new ClientSessionAndroid();
                break;
        }
        return session;
    }
}
