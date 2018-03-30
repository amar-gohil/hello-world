package com.intellociplabs.rfq.service;

import java.util.ArrayList;

import com.intellociplabs.common.vo.RfqVO;

public interface RfqService {

		RfqVO addRfq(RfqVO rfqVO) throws Exception;
		
		ArrayList<RfqVO> getAllRfq() throws Exception;
		
		RfqVO getRfqById(String rfqId) throws Exception;
		
		RfqVO updateRfq(RfqVO rfqVO) throws Exception;		
		
		void removeRfq(String rfqId) throws Exception;
	
}
