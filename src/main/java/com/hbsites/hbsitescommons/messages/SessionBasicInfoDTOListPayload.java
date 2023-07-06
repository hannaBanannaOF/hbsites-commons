package com.hbsites.hbsitescommons.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hbsites.hbsitescommons.dto.CharacterSheetBasicInfoDTO;
import com.hbsites.hbsitescommons.dto.SessionBasicInfoDTO;

import java.io.Serializable;
import java.util.List;

public record SessionBasicInfoDTOListPayload(@JsonProperty("infos") List<SessionBasicInfoDTO> infos) implements Serializable {
}
