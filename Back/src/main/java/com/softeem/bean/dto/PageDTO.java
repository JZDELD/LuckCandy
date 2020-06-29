package com.softeem.bean.dto;

public class PageDTO {
    private Integer pageNow;
    private Integer pages;
    public static final Integer PAGE_SIZE = 10;

    public PageDTO(Integer pageNow, Integer pages) {
        if(pages == 0){
            pages = 1;
        }
        if(pageNow < 1){
            pageNow = 1;
        }else if (pageNow > pages){
            pageNow = pages;
        }
        this.pageNow = pageNow;
        this.pages = pages;
    }

    public Integer getPageNow() {
        return pageNow;
    }

    public void setPageNow(Integer pageNow) {
        this.pageNow = pageNow;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }
}
