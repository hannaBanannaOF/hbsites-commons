package com.hbsites.hbsitescommons.dto;

import com.hbsites.hbsitescommons.enumeration.ETRPGSystem;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CharacterSheetListingDTO<SESSIONENTITY> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private UUID uuid;
    private String characterName;
    private ETRPGSystem system;
    private SessionListingDTO<SESSIONENTITY> session;
    private String userName;
}
