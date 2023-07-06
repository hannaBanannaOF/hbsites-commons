package com.hbsites.hbsitescommons.interfaces;

import java.util.List;
import java.util.UUID;

public interface EventProducerInterface<T> {

    public T getFromRabbitMQ(List<UUID> uuids);

}
