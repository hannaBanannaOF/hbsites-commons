package com.hbsites.hbsitescommons.commons.entity;

import com.hbsites.hbsitescommons.commons.interfaces.EventProducerInterface;

public abstract class RabbitBaseEntity<LISTDTO, DETAILDTO> extends BaseEntity<LISTDTO, DETAILDTO>{

    public abstract LISTDTO toListDTO(EventProducerInterface template);

    public abstract DETAILDTO toDetailDTO(EventProducerInterface template);

}
