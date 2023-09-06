package com.hbsites.hbsitescommons.dto;

import com.hbsites.hbsitescommons.enumeration.ETRPGSystem;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
public abstract class SessionListingDTO<SESSIONENTITY> implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private UUID uuid;
    private String sessionName;
    private ETRPGSystem system;
    private boolean inPlay;

    public void populate(UUID uuid, String sessionName, ETRPGSystem system, boolean inPlay, List<String> players) {
        this.setUuid(uuid);
        this.setSessionName(sessionName);
        this.setSystem(system);
        this.setInPlay(inPlay);
    }

    public abstract SESSIONENTITY toEntity();
}
