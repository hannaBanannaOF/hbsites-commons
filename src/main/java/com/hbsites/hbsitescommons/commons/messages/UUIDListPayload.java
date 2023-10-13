package com.hbsites.hbsitescommons.commons.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hbsites.hbsitescommons.commons.enumeration.EMicroservice;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public record UUIDListPayload(
        @JsonProperty("uuids") List<UUID> uuids,
        @JsonProperty("userRequested") UUID userRequested,
        @JsonProperty("session") UUID session,
        @JsonProperty("microservice") EMicroservice microservice,
        @JsonProperty("characterSheet") UUID characterSheet) implements Serializable {
}
