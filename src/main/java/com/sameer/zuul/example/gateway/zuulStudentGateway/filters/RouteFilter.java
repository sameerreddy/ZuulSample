package com.sameer.zuul.example.gateway.zuulStudentGateway.filters;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

public class RouteFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "route";
    }

    public int filterOrder() {
        return 1;
    }

    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        System.out.println("route filter called");
        return null;
    }
}
