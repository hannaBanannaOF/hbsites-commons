package com.hbsites.hbsitescommons.entity;

import com.hbsites.hbsitescommons.interfaces.EventProducerInterface;

public abstract class RabbitBaseEntity<LISTDTO, DETAILDTO, RABBITRETURN> extends BaseEntity<LISTDTO, DETAILDTO>{

    public abstract LISTDTO toListDTO(EventProducerInterface<RABBITRETURN> template);

    public abstract DETAILDTO toDetailDTO(EventProducerInterface<RABBITRETURN> template);

}
