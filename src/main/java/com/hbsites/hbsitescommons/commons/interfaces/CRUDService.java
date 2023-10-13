package com.hbsites.hbsitescommons.commons.interfaces;

import org.springframework.data.domain.Page;

public interface CRUDService<IDCLASS, DTO, CREATEDTO, DETAILDTO> {

    Page<DTO> getAll(int page);
    DETAILDTO create(CREATEDTO dto);

    void deleteById(IDCLASS id);

    DETAILDTO getById(IDCLASS id);

    DETAILDTO update(IDCLASS id, CREATEDTO payload);

}
