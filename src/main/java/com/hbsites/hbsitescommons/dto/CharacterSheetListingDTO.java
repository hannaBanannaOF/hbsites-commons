package com.hbsites.hbsitescommons.dto;

import com.hbsites.hbsitescommons.enumeration.ETRPGSystem;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

@Data
@AllArgsConstructor
public class CharacterSheetListingDTO {
    private UUID uuid;
    private String characterName;
    private ETRPGSystem system;
    private String sessionName;
}
