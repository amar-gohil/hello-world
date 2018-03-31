package com.intellociplabs.product.controller;

import static com.intellociplabs.product.controller.ProductUrl.BASE_URL;
import static com.intellociplabs.product.controller.ProductUrl.ADD_PRODUCT;
import static com.intellociplabs.product.controller.ProductUrl.REMOVE_PRODUCT;
import static com.intellociplabs.product.controller.ProductUrl.GET_ALL_PRODUCT;
import static com.intellociplabs.product.controller.ProductUrl.GET_PRODUCT_BY_ID;
import static com.intellociplabs.product.controller.ProductUrl.UPDATE_PRODUCT;
import static com.intellociplabs.product.controller.ProductUrl.GET_PRODUCT_BY_API_ID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RestController;

import com.intellociplabs.common.enums.ResponseStatus;
import com.intellociplabs.common.vo.ProductVO;
import com.intellociplabs.common.vo.RequestVO;
import com.intellociplabs.common.vo.ResponseVO;
import com.intellociplabs.product.service.ProductService;

@RestController
@RequestMapping(BASE_URL)
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	@RequestMapping(value = ADD_PRODUCT, method = RequestMethod.POST)
    public ResponseVO<ProductVO> addProduct(@RequestBody ProductVO productVO) throws Exception {
    	ResponseVO<ProductVO> responseVO = new ResponseVO<ProductVO>();
    	productVO = productService.addProduct(productVO);
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription());
    	responseVO.setValueObject(productVO);
        return responseVO;
    }
	
	@RequestMapping(value = GET_ALL_PRODUCT, method = RequestMethod.POST)
    public ResponseVO<ProductVO> getAllProduct()
            throws Exception {    	
		ResponseVO<ProductVO> responseVO = new ResponseVO<ProductVO>();    
		responseVO.setData(productService.getAllProduct());
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription()); 
    	responseVO.setTotalRecords(responseVO.getData().size());
		return responseVO;
    }
	
	
	@RequestMapping(value = REMOVE_PRODUCT, method = RequestMethod.POST)
	public ResponseVO<ProductVO> removeProduct(@RequestBody RequestVO<String> requestVO) throws Exception {
		productService.removeProduct(requestVO.getValueObject());
		ResponseVO<ProductVO> responseVO = new ResponseVO<ProductVO>();    	
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription());    	
		return responseVO;
	}
	
	@RequestMapping(value = GET_PRODUCT_BY_ID, method = RequestMethod.POST)
	public ResponseVO<ProductVO> productById(@RequestBody RequestVO<String> requestVO) throws Exception {		
		ResponseVO<ProductVO> responseVO = new ResponseVO<ProductVO>();
		responseVO.setValueObject(productService.getProductById(requestVO.getValueObject()));
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription());    	
		return responseVO;
	}
	
	@RequestMapping(value = UPDATE_PRODUCT, method = RequestMethod.POST)
    public ResponseVO<ProductVO> updateProduct(@RequestBody ProductVO productVO) throws Exception {
    	ResponseVO<ProductVO> responseVO = new ResponseVO<ProductVO>();
    	productVO = productService.updateProduct(productVO);
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setValueObject(productVO);
        return responseVO;
    }
	
	@RequestMapping(value = GET_PRODUCT_BY_API_ID, method = RequestMethod.POST)
    public ResponseVO<ProductVO> getProductByApiId(@RequestBody RequestVO<String> requestVO) throws Exception {    	
		ResponseVO<ProductVO> responseVO = new ResponseVO<ProductVO>();    
		responseVO.setData(productService.getProductByApiId(requestVO.getValueObject()));
    	responseVO.setStatusCode(ResponseStatus.A200.name());
    	responseVO.setStatusDescription(ResponseStatus.A200.getResponseDescription()); 
    	responseVO.setTotalRecords(responseVO.getData().size());
		return responseVO;
    }
	
}
