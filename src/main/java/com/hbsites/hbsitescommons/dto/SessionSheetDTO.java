package com.hbsites.hbsitescommons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SessionSheetDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;


    private UUID uuid;
    private String characterName;
}
