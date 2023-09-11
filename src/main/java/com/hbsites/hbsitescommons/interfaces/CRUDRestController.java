package com.hbsites.hbsitescommons.interfaces;

import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

public interface CRUDRestController<LISTDTO, DETAILDTO, IDCLASS, CREATEDTO> {

    @GetMapping
    Page<LISTDTO> getAll(@RequestParam(
            value = "page",
            required = false,
            defaultValue = "0") int page);

    @PostMapping
    DETAILDTO create(@RequestBody CREATEDTO dto);

    @GetMapping("/{uuid}")
    DETAILDTO getOne(@PathVariable IDCLASS uuid);

    @PutMapping("/{uuid}")
    DETAILDTO update(@PathVariable IDCLASS uuid, @RequestBody CREATEDTO dto);

    @DeleteMapping("/{uuid}")
    void delete(@PathVariable IDCLASS uuid);

}
