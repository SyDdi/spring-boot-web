package com.dongnao.jack.service;

import java.util.List;
import java.util.Map;

import com.dongnao.jack.bean.ConsultContent;

public interface CommonService {
    
    List<ConsultContent> queryContent(Map map);
    
    //    int updateConsultContract(String psptId, int id);
    //    
    //    List<ConsultContract> queryConsultContract();
}
