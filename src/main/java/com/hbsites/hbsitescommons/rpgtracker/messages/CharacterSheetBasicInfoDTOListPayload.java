package com.hbsites.hbsitescommons.rpgtracker.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hbsites.hbsitescommons.rpgtracker.dto.CharacterSheetBasicInfoDTO;
import com.hbsites.hbsitescommons.commons.enumeration.EMicroservice;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public record CharacterSheetBasicInfoDTOListPayload(
        @JsonProperty("infos") List<CharacterSheetBasicInfoDTO> infos,
        @JsonProperty("userRequested") UUID userRequested,
        @JsonProperty("microservice") EMicroservice microservice) implements Serializable {
}
