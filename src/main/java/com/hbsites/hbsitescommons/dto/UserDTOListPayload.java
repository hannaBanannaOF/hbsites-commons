package com.hbsites.hbsitescommons.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.List;

@Data
@AllArgsConstructor
public class UserDTOListPayload implements Serializable {
    @Serial
    private static final long serialVersionUID = 3L;

    private List<UserDTO> users;
}
