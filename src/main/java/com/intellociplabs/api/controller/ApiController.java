package com.intellociplabs.api.controller;

import static com.intellociplabs.api.controller.ApiUrl.ADD_API;
import static com.intellociplabs.api.controller.ApiUrl.BASE_URL;
import static com.intellociplabs.api.controller.ApiUrl.GET_ALL_API;
import static com.intellociplabs.api.controller.ApiUrl.GET_API_BY_ID;
import static com.intellociplabs.api.controller.ApiUrl.REMOVE_API;
import static com.intellociplabs.api.controller.ApiUrl.UPDATE_API;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intellociplabs.api.service.ApiService;
import com.intellociplabs.common.enums.ResponseStatus;
import com.intellociplabs.common.vo.ApiVO;
import com.intellociplabs.common.vo.RequestVO;
import com.intellociplabs.common.vo.ResponseVO;

@RestController
@RequestMapping(BASE_URL)
public class ApiController {

	
	@Autowired
	private ApiService apiService;
	
	@RequestMapping(value = ADD_API, method = RequestMethod.POST)
    public ResponseVO<ApiVO> addApi(@RequestBody ApiVO apiVO) throws Exception {
    	ResponseVO<ApiVO> responseVO = new ResponseVO<ApiVO>();
    	apiVO = apiService.addApi(apiVO);
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription());
    	responseVO.setValueObject(apiVO);
        return responseVO;
    }
	
	@RequestMapping(value = GET_ALL_API, method = RequestMethod.POST)
    public ResponseVO<ApiVO> getAllApi()
            throws Exception {    	
		ResponseVO<ApiVO> responseVO = new ResponseVO<ApiVO>();    
		responseVO.setData(apiService.getAllApi());
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription()); 
    	responseVO.setTotalRecords(responseVO.getData().size());
		return responseVO;
    }
	
	@RequestMapping(value = GET_API_BY_ID, method = RequestMethod.POST)
	public ResponseVO<ApiVO> getApiById(@RequestBody RequestVO<String> requestVO) throws Exception {		
		ResponseVO<ApiVO> responseVO = new ResponseVO<ApiVO>();
		responseVO.setValueObject(apiService.getApiById(requestVO.getValueObject()));
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription());    	
		return responseVO;
	}
	
	
	@RequestMapping(value = UPDATE_API, method = RequestMethod.POST)
    public ResponseVO<ApiVO> updateApi(@RequestBody ApiVO apiVO) throws Exception {
    	ResponseVO<ApiVO> responseVO = new ResponseVO<ApiVO>();
    	apiVO = apiService.updateApi(apiVO);
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setValueObject(apiVO);
        return responseVO;
    }
	
	
	@RequestMapping(value = REMOVE_API, method = RequestMethod.POST)
	public ResponseVO<ApiVO> removeApi(@RequestBody RequestVO<String> requestVO) throws Exception {
		apiService.removeApi(requestVO.getValueObject());
		ResponseVO<ApiVO> responseVO = new ResponseVO<ApiVO>();    	
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription());    	
		return responseVO;
	}
	

	

	
	
}
