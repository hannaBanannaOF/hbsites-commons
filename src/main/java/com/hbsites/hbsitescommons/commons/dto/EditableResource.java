package com.hbsites.hbsitescommons.commons.dto;

import lombok.Data;

import java.util.UUID;

@Data
public abstract class EditableResource {
    private UUID creatorId;
}
