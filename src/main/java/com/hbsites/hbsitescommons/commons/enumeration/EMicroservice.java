package com.hbsites.hbsitescommons.commons.enumeration;

import com.hbsites.hbsitescommons.commons.queues.RabbitQueues;
import lombok.Getter;

@Getter
public enum EMicroservice {
    RPGTRACKER_CORE(RabbitQueues.RPGTRACKER_CORE_EXCHANGE, RabbitQueues.CORE_USER_RESPONSE_QUEUE),
    RPGTRACKER_COC(RabbitQueues.RPGTRACKER_COC_EXCHANGE, RabbitQueues.COC_USER_RESPONSE_QUEUE),
    USER(RabbitQueues.USER_EXCHANGE, "");

    private final String exchange;
    private final String userReplyQueue;
    private EMicroservice(String exchange, String userReplyQueue) {
        this.exchange = exchange;
        this.userReplyQueue = userReplyQueue;
    }
}
