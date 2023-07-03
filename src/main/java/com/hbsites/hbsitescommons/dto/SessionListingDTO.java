package com.hbsites.hbsitescommons.dto;

import com.hbsites.hbsitescommons.enumeration.ETRPGSystem;
import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public abstract class SessionListingDTO<SESSIONENTITY> {
    private UUID uuid;
    private String sessionName;
    private ETRPGSystem system;
    private boolean inPlay;
    private List<String> players;

    public void populate(UUID uuid, String sessionName, ETRPGSystem system, boolean inPlay, List<String> players) {
        this.setUuid(uuid);
        this.setSessionName(sessionName);
        this.setSystem(system);
        this.setInPlay(inPlay);
        this.setPlayers(players);
    }

    public abstract SESSIONENTITY toEntity();
}
