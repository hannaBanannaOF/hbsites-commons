package com.hbsites.hbsitescommons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessionBasicInfoDTO implements Serializable {
    private UUID coreId;
    private String sessionName;
    private boolean inPlay;
    private List<SessionSheetDTO> sessionSheets;
}
