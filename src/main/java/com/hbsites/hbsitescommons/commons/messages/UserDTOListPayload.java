package com.hbsites.hbsitescommons.commons.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hbsites.hbsitescommons.commons.dto.UserDTO;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public record UserDTOListPayload(
        @JsonProperty("users") List<UserDTO> users,
        @JsonProperty("userRequested") UUID userRequested,
        @JsonProperty("session") UUID session,
        @JsonProperty("characterSheet") UUID characterSheet) implements Serializable {
}
