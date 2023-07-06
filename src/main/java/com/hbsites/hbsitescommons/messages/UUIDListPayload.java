package com.hbsites.hbsitescommons.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.amqp.core.Message;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public record UUIDListPayload(@JsonProperty("uuids") List<UUID> uuids) implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
}
