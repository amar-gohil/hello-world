package com.intellociplabs.rfq.service;

import java.util.ArrayList;

import com.intellociplabs.common.domain.Rfq;
import com.intellociplabs.common.vo.RfqVO;

public interface RfqConvertService {
	
	Rfq convertRfqVOToDomain(RfqVO rfqVO) throws Exception;
	RfqVO convertRfqDomainToVO(Rfq rfq) throws Exception;
	ArrayList<RfqVO> convertRfqDomainListToVOList(Iterable<Rfq> rfqList) throws Exception;
	Rfq convertRfqForUpdate(Rfq existingObj, RfqVO incomingObj) throws Exception;
	
}
