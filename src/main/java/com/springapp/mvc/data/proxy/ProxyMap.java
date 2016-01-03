package com.springapp.mvc.data.proxy;

import java.util.List;

/**
 * Created by oj.bae on 2016. 1. 1..
 */
public class ProxyMap {
    private int totalCount=0;
    private int returnCode=200;
    private String errorMessage=null;
    private final static String proxyServerSite="http://www.freeproxylists.net/?c=&pt=80&pr=&a%5B%5D=0&u=80";
    private List<ProxyData> proxyDataList=null;

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public int getReturnCode() {
        return returnCode;
    }

    public void setReturnCode(int returnCode) {
        this.returnCode = returnCode;
    }

    public int getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    public String getProxyServerSite() {
        return proxyServerSite;
    }

    public List<ProxyData> getProxyDataList() {
        return proxyDataList;
    }

    public void setProxyDataList(List<ProxyData> proxyDataList) {
        this.proxyDataList = proxyDataList;
    }
}
