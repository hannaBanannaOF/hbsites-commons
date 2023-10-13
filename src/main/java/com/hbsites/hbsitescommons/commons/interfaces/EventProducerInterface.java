package com.hbsites.hbsitescommons.commons.interfaces;

import java.util.List;
import java.util.UUID;

public interface EventProducerInterface {

    public void getFromRabbitMQ(List<UUID> uuids, UUID session, UUID characterSheet);

}
