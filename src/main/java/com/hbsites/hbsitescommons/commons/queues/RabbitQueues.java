package com.hbsites.hbsitescommons.commons.queues;

public class RabbitQueues {

    // User queues and exchange

    public static final String USER_REQUEST_QUEUE = "user.request";
    public static final String USER_EXCHANGE = "user-exchange";

    // RPGTracker core queues and exchange

    public static final String RPGTRACKER_CORE_EXCHANGE = "rpgtracker-core-exchange";
    public static final String CORE_CHARACTER_SHEET_REQUEST_QUEUE = "rpgtracker.core.character-sheet.request";
    public static final String CORE_SESSION_REQUEST_QUEUE = "rpgtracker.core.session.request";
    public static final String CORE_USER_RESPONSE_QUEUE = "rpgtracker.core.user.response";

    // RPGTracker call of cthulhu queues and exchange

    public static final String RPGTRACKER_COC_EXCHANGE = "rpgtracker-coc-exchange";
    public static final String COC_USER_RESPONSE_QUEUE = "rpgtracker.coc.user.response";
    public static final String COC_SESSION_RESPONSE_QUEUE = "rpgtracker.coc.session.response";
    public static final String COC_CHARACTER_SHEET_RESPONSE_QUEUE = "rpgtracker.coc.character-sheet.response";
}
