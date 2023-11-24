package com.hbsites.hbsitescommons.rpgtracker.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SessionBasicInfoDTO implements Serializable {
    private UUID dmId;
    private UUID coreId;
    private String sessionName;
    private boolean inPlay;
    private List<SessionSheetDTO> sessionSheets;
}
