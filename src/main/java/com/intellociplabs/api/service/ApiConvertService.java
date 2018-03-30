package com.intellociplabs.api.service;

import java.util.ArrayList;

import com.intellociplabs.common.domain.Api;
import com.intellociplabs.common.vo.ApiVO;

public interface ApiConvertService {
	
	Api convertApiVOToDomain(ApiVO apiVO) throws Exception;
	ApiVO convertApiDomainToVO(Api api) throws Exception;
	ArrayList<ApiVO> convertApiDomainListToVOList(Iterable<Api> apiList) throws Exception;
	Api convertApiForUpdate(Api existingObj, ApiVO incomingObj) throws Exception;
	
}
