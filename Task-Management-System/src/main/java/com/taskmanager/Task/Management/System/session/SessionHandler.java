package com.taskmanager.Task.Management.System.session;

public class SessionHandler {

    private static Session session = new Session("");

    public static void setSession(Session session) {
            SessionHandler.session=session;
    }
    public static Session getSession() {
        return session;
    }
}
