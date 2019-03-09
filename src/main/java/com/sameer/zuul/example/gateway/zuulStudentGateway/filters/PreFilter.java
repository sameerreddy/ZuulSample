package com.sameer.zuul.example.gateway.zuulStudentGateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

public class PreFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    public int filterOrder() {
        return 1;
    }

    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext requestContext = RequestContext.getCurrentContext();
        HttpServletRequest httpServletRequest = requestContext.getRequest();
        System.out.println("Request Method: " + httpServletRequest.getMethod() + " request URL: "
                + httpServletRequest.getRequestURL().toString());
        return null;
    }
}
