package br.unimontes.ccet.dcc.pg1.desktop.view.util;

public class Session{
    private static String sessionUsername;
    private static String sessionNome;
    private static String sessionFoto;

    public static String getSessionUsername() {
        return sessionUsername;
    }

    public static void setSessionUsername(String sessionUsername) {
        Session.sessionUsername = sessionUsername;
    }

    public static String getSessionNome() {
        return sessionNome;
    }

    public static void setSessionNome(String sessionNome) {
        Session.sessionNome = sessionNome;
    }

    public static String getSessionFoto() {
        return sessionFoto;
    }

    public static void setSessionFoto(String sessionFoto) {
        Session.sessionFoto = sessionFoto;
    }
    
}
