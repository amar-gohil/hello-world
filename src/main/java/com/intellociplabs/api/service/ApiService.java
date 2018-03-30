package com.intellociplabs.api.service;

import java.util.ArrayList;

import com.intellociplabs.common.vo.ApiVO;


public interface ApiService {

	ApiVO addApi(ApiVO apiVO) throws Exception;
	
	ArrayList<ApiVO> getAllApi() throws Exception;
	
	ApiVO getApiById(String apiId) throws Exception;
	
	ApiVO updateApi(ApiVO apiVO) throws Exception;		
	
	void removeApi(String apiId) throws Exception;
}
