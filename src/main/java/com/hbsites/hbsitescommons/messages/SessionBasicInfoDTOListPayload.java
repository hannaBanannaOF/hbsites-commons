package com.hbsites.hbsitescommons.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hbsites.hbsitescommons.dto.CharacterSheetBasicInfoDTO;
import com.hbsites.hbsitescommons.dto.SessionBasicInfoDTO;
import com.hbsites.hbsitescommons.enumeration.EMicroservice;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public record SessionBasicInfoDTOListPayload(
        @JsonProperty("infos") List<SessionBasicInfoDTO> infos,
        @JsonProperty("userRequested") UUID userRequested,
        @JsonProperty("session") UUID session,
        @JsonProperty("microservice") EMicroservice microservice) implements Serializable {
}
