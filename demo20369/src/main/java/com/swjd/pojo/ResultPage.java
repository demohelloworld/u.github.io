package com.swjd.pojo;

import java.util.List;

public class ResultPage {
    //当前第几页
    private int currPage;
    //一页有多少条数据
    private int pageSize;
    //一共有多少条数据
    private long total;
    //一共有多少页
    private int page;
    //该页的数据
    private List pageList;

    public int getCurrPage() {
        return currPage;
    }

    public void setCurrPage(int currPage) {
        this.currPage = currPage;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public List getPageList() {
        return pageList;
    }

    public void setPageList(List pageList) {
        this.pageList = pageList;
    }
}
