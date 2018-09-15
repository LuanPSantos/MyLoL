package com.trainee.mylol.util;

public class LeagueParseUtil{ 
    private static final String RANKED_FLEX_SR = "RANKED_FLEX_SR";
    private static final String RANKED_SOLO_5x5 = "RANKED_SOLO_5x5";
    private static final String RANKED_FLEX_TT = "RANKED_FLEX_TT";
    
    public static String getQueue(String queueType){
        switch (queueType){
            case RANKED_FLEX_SR:
                return "5X5 Flex";
            case RANKED_SOLO_5x5:
                return "5X5 Solo";
            case RANKED_FLEX_TT:
                return "3X3 Flex";
            default:
                return "Fila desconhecida";
        }
    }
}
