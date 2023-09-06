package com.hbsites.hbsitescommons.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hbsites.hbsitescommons.dto.UserDTO;
import com.hbsites.hbsitescommons.enumeration.EMicroservice;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public record UserDTOListPayload(
        @JsonProperty("users") List<UserDTO> users,
        @JsonProperty("userRequested") UUID userRequested,
        @JsonProperty("session") UUID session,
        @JsonProperty("characterSheet") UUID characterSheet) implements Serializable {
}
