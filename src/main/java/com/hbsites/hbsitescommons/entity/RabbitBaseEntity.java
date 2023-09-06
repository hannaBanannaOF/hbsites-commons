package com.hbsites.hbsitescommons.entity;

import com.hbsites.hbsitescommons.interfaces.EventProducerInterface;

public abstract class RabbitBaseEntity<LISTDTO, DETAILDTO> extends BaseEntity<LISTDTO, DETAILDTO>{

    public abstract LISTDTO toListDTO(EventProducerInterface template);

    public abstract DETAILDTO toDetailDTO(EventProducerInterface template);

}
