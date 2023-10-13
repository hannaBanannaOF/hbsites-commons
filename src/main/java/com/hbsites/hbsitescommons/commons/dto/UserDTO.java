package com.hbsites.hbsitescommons.commons.dto;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.UUID;

@Data
public class UserDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private UUID uuid;
    private String firstName;
    private String lastName;
    private String userName;

    public String getDisplayName() {
        String name = "";
        if (this.firstName != null && this.lastName != null) {
            name = getFirstName().concat(" ").concat(getLastName());
        }
        if (this.userName != null) {
            name = name.concat( " (").concat(getUserName()).concat(")");
        }
        return name;
    }
}
