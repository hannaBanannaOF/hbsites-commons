package com.hbsites.hbsitescommons.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hbsites.hbsitescommons.dto.CharacterSheetBasicInfoDTO;
import com.hbsites.hbsitescommons.enumeration.EMicroservice;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public record CharacterSheetBasicInfoDTOListPayload(
        @JsonProperty("infos") List<CharacterSheetBasicInfoDTO> infos,
        @JsonProperty("userRequested") UUID userRequested,
        @JsonProperty("microservice") EMicroservice microservice) implements Serializable {
}
