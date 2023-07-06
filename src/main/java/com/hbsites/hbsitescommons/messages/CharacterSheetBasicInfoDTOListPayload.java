package com.hbsites.hbsitescommons.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hbsites.hbsitescommons.dto.CharacterSheetBasicInfoDTO;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

public record CharacterSheetBasicInfoDTOListPayload(@JsonProperty("infos") List<CharacterSheetBasicInfoDTO> infos) implements Serializable {
}
