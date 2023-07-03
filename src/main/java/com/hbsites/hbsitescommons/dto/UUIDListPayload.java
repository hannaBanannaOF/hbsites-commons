package com.hbsites.hbsitescommons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;
import java.util.UUID;

@Data
@AllArgsConstructor
public class UUIDListPayload implements Serializable {
    @Serial
    private static final long serialVersionUID = 2L;

    private List<UUID> uuids;
}
