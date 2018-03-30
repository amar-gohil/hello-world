package com.intellociplabs.api.service.impl;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intellociplabs.api.repository.ApiRepository;
import com.intellociplabs.api.service.ApiConvertService;
import com.intellociplabs.api.service.ApiService;
import com.intellociplabs.common.domain.Api;
import com.intellociplabs.common.util.CommonUtil;
import com.intellociplabs.common.vo.ApiVO;

@Service
public class ApiServiceImpl implements ApiService{

	@Autowired
	ApiConvertService apiConvertService;
	
	@Autowired
	ApiRepository apiRepository;
	
	@Override
	public ApiVO addApi(ApiVO apiVO) throws Exception {
		Api api = apiConvertService.convertApiVOToDomain(apiVO);
		api.setId(CommonUtil.getUUID());		
		api = apiRepository.save(api);
		return apiConvertService.convertApiDomainToVO(api);		
	}

	@Override
	public ArrayList<ApiVO> getAllApi() throws Exception {
		Iterable<Api> productList = apiRepository.findAll();
		return apiConvertService.convertApiDomainListToVOList(productList);
	}

	@Override
	public ApiVO getApiById(String apiId) throws Exception {
		return apiConvertService.convertApiDomainToVO(
				apiRepository.findById(apiId));
	}

	@Override
	public ApiVO updateApi(ApiVO apiVO) throws Exception {
		Api existingObj = apiRepository.findById(apiVO.getId());
		if(existingObj != null) {					
			apiVO = apiConvertService.convertApiDomainToVO(apiRepository.save(
					apiConvertService.convertApiForUpdate(existingObj,apiVO)));
		}
		return apiVO;	
	}

	@Override
	public void removeApi(String apiId) throws Exception {
		apiRepository.removeApi(apiId);
		
	}
	
	

}
