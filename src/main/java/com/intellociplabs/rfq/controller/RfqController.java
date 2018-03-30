package com.intellociplabs.rfq.controller;

import static com.intellociplabs.rfq.controller.RfqUrl.ADD_RFQ;
import static com.intellociplabs.rfq.controller.RfqUrl.BASE_URL;
import static com.intellociplabs.rfq.controller.RfqUrl.GET_ALL_RFQ;
import static com.intellociplabs.rfq.controller.RfqUrl.GET_RFQ_BY_ID;
import static com.intellociplabs.rfq.controller.RfqUrl.REMOVE_RFQ;
import static com.intellociplabs.rfq.controller.RfqUrl.UPDATE_RFQ;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intellociplabs.common.enums.ResponseStatus;
import com.intellociplabs.common.vo.RequestVO;
import com.intellociplabs.common.vo.ResponseVO;
import com.intellociplabs.common.vo.RfqVO;
import com.intellociplabs.rfq.service.RfqService;

@RestController
@RequestMapping(BASE_URL)
public class RfqController {

	
	@Autowired
	private RfqService rfqService;
	
	@RequestMapping(value = ADD_RFQ, method = RequestMethod.POST)
    public ResponseVO<RfqVO> addRfq(@RequestBody RfqVO rfqVO) throws Exception {
    	ResponseVO<RfqVO> responseVO = new ResponseVO<RfqVO>();
    	rfqVO = rfqService.addRfq(rfqVO);
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription());
    	responseVO.setValueObject(rfqVO);
        return responseVO;
    }
	
	@RequestMapping(value = GET_ALL_RFQ, method = RequestMethod.POST)
    public ResponseVO<RfqVO> getAllRfq()
            throws Exception {    	
		ResponseVO<RfqVO> responseVO = new ResponseVO<RfqVO>();    
		responseVO.setData(rfqService.getAllRfq());
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription()); 
    	responseVO.setTotalRecords(responseVO.getData().size());
		return responseVO;
    }
	
	@RequestMapping(value = REMOVE_RFQ, method = RequestMethod.POST)
	public ResponseVO<RfqVO> removeRfq(@RequestBody RequestVO<String> requestVO) throws Exception {
		rfqService.removeRfq(requestVO.getValueObject());
		ResponseVO<RfqVO> responseVO = new ResponseVO<RfqVO>();    	
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription());    	
		return responseVO;
	}
	
	@RequestMapping(value = GET_RFQ_BY_ID, method = RequestMethod.POST)
	public ResponseVO<RfqVO> rfqById(@RequestBody RequestVO<String> requestVO) throws Exception {		
		ResponseVO<RfqVO> responseVO = new ResponseVO<RfqVO>();
		responseVO.setValueObject(rfqService.getRfqById(requestVO.getValueObject()));
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription());    	
		return responseVO;
	}
	
	@RequestMapping(value = UPDATE_RFQ, method = RequestMethod.POST)
    public ResponseVO<RfqVO> updateRfq(@RequestBody RfqVO rfqVO) throws Exception {
    	ResponseVO<RfqVO> responseVO = new ResponseVO<RfqVO>();
    	rfqVO = rfqService.updateRfq(rfqVO);
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setValueObject(rfqVO);
        return responseVO;
    }
	
	
}
