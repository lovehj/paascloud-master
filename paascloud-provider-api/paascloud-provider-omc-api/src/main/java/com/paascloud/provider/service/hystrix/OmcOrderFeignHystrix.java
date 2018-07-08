/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：OmcOrderFeignHystrix.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.service.hystrix;

import com.paascloud.provider.model.dto.OmcCancelOrderDto;
import com.paascloud.provider.model.dto.OmcCreateOrderDto;
import com.paascloud.provider.model.dto.OrderDto;
import com.paascloud.provider.model.dto.OrderPageQuery;
import com.paascloud.provider.service.OmcOrderFeignApi;
import com.paascloud.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * The class Omc order feign hystrix.
 *
 * @author paascloud.net@gmail.com
 */
@Component
public class OmcOrderFeignHystrix implements OmcOrderFeignApi {

	@Override
	public Wrapper updateOrderById(final OrderDto order) {
		return null;
	}

	@Override
	public Wrapper<Integer> getCartCount() {
		return null;
	}

	@Override
	public Wrapper getOrderCartProduct(Long userId) {
		return null;
	}

	@Override
	public Wrapper createOrderDoc(OmcCreateOrderDto omcCreateOrderDto) {
		return null;
	}

	@Override
	public Wrapper cancelOrderDoc(OmcCancelOrderDto cancelOrderDto) {
		return null;
	}

	@Override
	public Wrapper queryUserOrderDetailList(String orderNo, Long userId) {
		return null;
	}

	@Override
	public Wrapper queryUserOrderDetail(String orderNo) {
		return null;
	}

	@Override
	public Wrapper queryUserOrderListWithPage(OrderPageQuery orderPageQuery) {
		return null;
	}

	@Override
	public Wrapper queryOrderListWithPage(OrderPageQuery orderPageQuery) {
		return null;
	}

	@Override
	public Wrapper<Boolean> queryOrderPayStatus(String orderNo, Long userId) {
		return null;
	}
}
