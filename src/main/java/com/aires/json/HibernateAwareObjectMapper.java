package com.aires.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.hibernate3.Hibernate3Module;
 
public class HibernateAwareObjectMapper extends ObjectMapper {
 
    public HibernateAwareObjectMapper() {
        Hibernate3Module hm = new Hibernate3Module();
        registerModule(hm);
    }
}