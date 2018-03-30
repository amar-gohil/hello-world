package com.intellociplabs.api.service.impl;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.intellociplabs.api.service.ApiConvertService;
import com.intellociplabs.common.domain.Api;
import com.intellociplabs.common.vo.ApiVO;

@Service
public class ApiConvertServiceImpl implements ApiConvertService{

	@Override
	public Api convertApiVOToDomain(ApiVO apiVO) throws Exception {
		Api api = new Api();		
		api.setName(apiVO.getName());		
		api.setIsActive("1");
		return api;
	}

	@Override
	public ApiVO convertApiDomainToVO(Api api) throws Exception {
		ApiVO apiVO = new ApiVO();
		apiVO.setId(api.getId());
		apiVO.setName(api.getName());		
		apiVO.setIsActive(api.getIsActive());
		return apiVO;
	}
	
	@Override
	public ArrayList<ApiVO> convertApiDomainListToVOList(Iterable<Api> apiList) throws Exception{		
		ArrayList<ApiVO> apiVOList = new ArrayList<ApiVO>();
		for (Api api : apiList) {
			ApiVO apiVO = new ApiVO();
			apiVO.setId(api.getId());
			apiVO.setName(api.getName());	
			apiVO.setIsActive(api.getIsActive());
			apiVOList.add(apiVO);
        }
		return apiVOList;
	}
	
	@Override
	public Api convertApiForUpdate(Api existingObj, ApiVO incomingObj) throws Exception {			
		existingObj.setName(incomingObj.getName());		
		existingObj.setIsActive(incomingObj.getIsActive());		
		return existingObj;
	}
	
}
