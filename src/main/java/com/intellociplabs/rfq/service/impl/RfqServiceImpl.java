package com.intellociplabs.rfq.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellociplabs.common.domain.Rfq;
import com.intellociplabs.common.util.CommonUtil;
import com.intellociplabs.common.vo.RfqVO;
import com.intellociplabs.rfq.repository.RfqRepository;
import com.intellociplabs.rfq.service.RfqConvertService;
import com.intellociplabs.rfq.service.RfqService;

@Service
public class RfqServiceImpl implements RfqService{
	
	@Autowired
	RfqConvertService rfqConvertService;

	@Autowired
	RfqRepository rfqRepository;
	
	@Override
	public RfqVO addRfq(RfqVO rfqVO) throws Exception {
		Rfq rfq = rfqConvertService.convertRfqVOToDomain(rfqVO);
		rfq.setId(CommonUtil.getUUID());		
		rfq = rfqRepository.save(rfq);
		return rfqConvertService.convertRfqDomainToVO(rfq);		
	}


	@Override
	public ArrayList<RfqVO> getAllRfq() throws Exception {
		Iterable<Rfq> rfqList = rfqRepository.findAll();
		return rfqConvertService.convertRfqDomainListToVOList(rfqList);
		
	}

	@Override
	public RfqVO getRfqById(String rfqId) throws Exception {		
		return rfqConvertService.convertRfqDomainToVO(
				rfqRepository.findById(rfqId));
	}

	@Override
	public RfqVO updateRfq(RfqVO rfqVO) throws Exception {
		Rfq existingObj = rfqRepository.findById(rfqVO.getId());
		if(existingObj != null) {					
			rfqVO = rfqConvertService.convertRfqDomainToVO(rfqRepository.save(
					rfqConvertService.convertRfqForUpdate(existingObj,rfqVO)));
		}
		return rfqVO;		
	}

	@Override
	public void removeRfq(String rfqId) throws Exception {
		rfqRepository.removeRfq(rfqId);
	}


}
