/*
 * Copyright (c) 2018. paascloud.net All Rights Reserved.
 * 项目名称：paascloud快速搭建企业级分布式微服务平台
 * 类名称：OmcShippingFeignHystrix.java
 * 创建人：刘兆明
 * 联系方式：paascloud.net@gmail.com
 * 开源地址: https://github.com/paascloud
 * 博客地址: http://blog.paascloud.net
 * 项目官网: http://paascloud.net
 */

package com.paascloud.provider.service.hystrix;

import com.github.pagehelper.PageInfo;
import com.paascloud.provider.model.dto.OmcShippingDTO;
import com.paascloud.provider.model.dto.OmcShippingQuery;
import com.paascloud.provider.service.OmcShippingFeignApi;
import com.paascloud.provider.service.PtcPayFeignApi;
import com.paascloud.wrapper.Wrapper;
import org.springframework.stereotype.Component;

/**
 * The class Omc cart feign hystrix.
 *
 * @author paascloud.net@gmail.com
 */
@Component
public class OmcShippingFeignHystrix implements OmcShippingFeignApi {
    @Override
    public Wrapper addShipping(OmcShippingDTO shipping) {
        return null;
    }

    @Override
    public Wrapper deleteShipping(Long shippingId, Long userId) {
        return null;
    }

    @Override
    public Wrapper updateShipping(OmcShippingDTO shipping) {
        return null;
    }

    @Override
    public Wrapper setDefaultAddress(OmcShippingDTO omcShippingDTO) {
        return null;
    }

    @Override
    public Wrapper<OmcShippingDTO> selectShippingById(Long shippingId, Long userId) {
        return null;
    }

    @Override
    public Wrapper<PageInfo> queryUserShippingListWithPage(OmcShippingQuery shipping) {
        return null;
    }

    @Override
    public Wrapper<PageInfo> queryShippingListWithPage(OmcShippingQuery shipping) {
        return null;
    }
}
