package com.hbsites.hbsitescommons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
public class SessionSheetDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;


    private UUID uuid;
    private String characterName;
}
