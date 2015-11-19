package com.springapp.mvc.data;

import java.util.List;

/**
 * Created by baeonejune on 2015. 11. 9..
 */
public class ProductMainData {
    String dataId;
    String productId;
    String productName;
    String brandName;
    String productUrl;
    String thumbUrl;
    String orgPrice;
    String salePrice;
    String cpName;
    String spec1;
    String spec2;
    String status;
    String seedUrl;
    String insertDate;
    String categoryName;
    List<BlogExtBodyData> blogExtBodyList=null;
    List<ReputationData> reputationDataList=null;

    public String getDataId() {
        return dataId;
    }

    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public void setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
    }

    public String getOrgPrice() {
        return orgPrice;
    }

    public void setOrgPrice(String orgPrice) {
        this.orgPrice = orgPrice;
    }

    public String getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(String salePrice) {
        this.salePrice = salePrice;
    }

    public String getCpName() {
        return cpName;
    }

    public void setCpName(String cpName) {
        this.cpName = cpName;
    }

    public String getSpec1() {
        return spec1;
    }

    public void setSpec1(String spec1) {
        this.spec1 = spec1;
    }

    public String getSpec2() {
        return spec2;
    }

    public void setSpec2(String spec2) {
        this.spec2 = spec2;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getSeedUrl() {
        return seedUrl;
    }

    public void setSeedUrl(String seedUrl) {
        this.seedUrl = seedUrl;
    }

    public String getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(String insertDate) {
        this.insertDate = insertDate;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    public List<BlogExtBodyData> getBlogExtBodyList() {
        return blogExtBodyList;
    }

    public void setBlogExtBodyList(List<BlogExtBodyData> blogExtBodyList) {
        this.blogExtBodyList = blogExtBodyList;
    }

    public List<ReputationData> getReputationDataList() {
        return reputationDataList;
    }

    public void setReputationDataList(List<ReputationData> reputationDataList) {
        this.reputationDataList = reputationDataList;
    }
}
