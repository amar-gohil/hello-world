package com.intellociplabs.rfq.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.intellociplabs.common.domain.Rfq;
import com.intellociplabs.common.util.CommonUtil;
import com.intellociplabs.common.vo.RfqVO;
import com.intellociplabs.rfq.service.RfqConvertService;

@Service
public class RfqConvertServiceImpl implements RfqConvertService{

	@Override
	public Rfq convertRfqVOToDomain(RfqVO rfqVO) throws Exception {
		Rfq rfq = new Rfq();		
		rfq.setProductId(rfqVO.getProductId());
		rfq.setFullName(rfqVO.getFullName());		
		rfq.setOfficialEmail(rfqVO.getOfficialEmail());
		rfq.setCompanyName(rfqVO.getCompanyName());
		rfq.setContactNo(rfqVO.getContactNo());
		rfq.setPackages(rfqVO.getPackages());
		rfq.setPackageType(rfqVO.getPackageType());
		rfq.setIsActive("1");
		rfq.setRfqDate(CommonUtil.getCurrentTimeInUTC());
		return rfq;
	}

	@Override
	public RfqVO convertRfqDomainToVO(Rfq rfq) throws Exception {
		RfqVO rfqVO = new RfqVO();
		rfqVO.setId(rfq.getId());		
		rfqVO.setProductId(rfq.getProductId());
		rfqVO.setFullName(rfq.getFullName());		
		rfqVO.setOfficialEmail(rfq.getOfficialEmail());
		rfqVO.setCompanyName(rfq.getCompanyName());
		rfqVO.setContactNo(rfq.getContactNo());
		rfqVO.setPackages(rfq.getPackages());
		rfqVO.setPackageType(rfq.getPackageType());		
		rfqVO.setIsActive(rfq.getIsActive());
		rfqVO.setRfqDate(rfq.getRfqDate());
		return rfqVO;
	}
	
	@Override
	public ArrayList<RfqVO> convertRfqDomainListToVOList(Iterable<Rfq> rfqList) throws Exception{		
		ArrayList<RfqVO> rfqVOList = new ArrayList<RfqVO>();
		for (Rfq rfq : rfqList) {
			RfqVO rfqVO = new RfqVO();
			rfqVO.setId(rfq.getId());		
			rfqVO.setProductId(rfq.getProductId());
			rfqVO.setFullName(rfq.getFullName());		
			rfqVO.setOfficialEmail(rfq.getOfficialEmail());
			rfqVO.setCompanyName(rfq.getCompanyName());
			rfqVO.setContactNo(rfq.getContactNo());
			rfqVO.setPackages(rfq.getPackages());
			rfqVO.setPackageType(rfq.getPackageType());		
			rfqVO.setIsActive(rfq.getIsActive());
			rfqVO.setRfqDate(rfq.getRfqDate());
			rfqVOList.add(rfqVO);
        }
		return rfqVOList;
	}
	
	@Override
	public Rfq convertRfqForUpdate(Rfq existingObj, RfqVO incomingObj) throws Exception {			
		existingObj.setProductId(incomingObj.getProductId());
		existingObj.setFullName(incomingObj.getFullName());		
		existingObj.setOfficialEmail(incomingObj.getOfficialEmail());
		existingObj.setCompanyName(incomingObj.getCompanyName());
		existingObj.setContactNo(incomingObj.getContactNo());
		existingObj.setPackages(incomingObj.getPackages());
		existingObj.setPackageType(incomingObj.getPackageType());
		existingObj.setIsActive(incomingObj.getIsActive());
		return existingObj;
	}
	
}
