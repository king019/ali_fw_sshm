package com.k.web.mybatis.dao.base.vo;
import java.io.Serializable;
import java.util.List;
public class PageBean implements Serializable {
  private static final long serialVersionUID = 2647073846755242380L;
  private boolean nextPage = true;
  private boolean upPage = true;
  private int totalPage;
  private int countResults;
  private int currentlyPage = 1;
  private List dataList;
  private int start;
  private int end;
  private int pageSize = 20;
  public PageBean() {
  }
  public PageBean(int currentlyPage, int pageSize, Integer recordsCount) {
    this.pageSize = pageSize <= 0 ? 1 : pageSize;
    countResults = recordsCount;
    int tempTotalPage = countResults / pageSize;
    int tempNum = countResults % pageSize;
    if (tempNum > 0) {
      tempTotalPage++;
    }
    totalPage = tempTotalPage;
    if (currentlyPage <= 0) {
      this.currentlyPage = 1;
    } else if (currentlyPage > totalPage) {
      this.currentlyPage = totalPage;
    } else {
      this.currentlyPage = currentlyPage;
    }
    start = (this.currentlyPage - 1) * this.pageSize + 1;
    end = this.currentlyPage * this.pageSize;
    if (this.currentlyPage == 1) {
      upPage = false;
    }
    if (this.currentlyPage == totalPage) {
      nextPage = false;
    }
  }
  /**
   * @return the nextPage
   */
  public boolean isNextPage() {
    return nextPage;
  }
  /**
   * @param nextPage the nextPage to set
   */
  public void setNextPage(boolean nextPage) {
    this.nextPage = nextPage;
  }
  /**
   * @return the upPage
   */
  public boolean isUpPage() {
    return upPage;
  }
  /**
   * @param upPage the upPage to set
   */
  public void setUpPage(boolean upPage) {
    this.upPage = upPage;
  }
  /**
   * @return the totalPage
   */
  public int getTotalPage() {
    return totalPage;
  }
  /**
   * @param totalPage the totalPage to set
   */
  public void setTotalPage(int totalPage) {
    this.totalPage = totalPage;
  }
  /**
   * @return the countResults
   */
  public int getCountResults() {
    return countResults;
  }
  /**
   * @param countResults the countResults to set
   */
  public void setCountResults(int countResults) {
    this.countResults = countResults;
  }
  /**
   * @return the currentlyPage
   */
  public int getCurrentlyPage() {
    return currentlyPage;
  }
  /**
   * @param currentlyPage the currentlyPage to set
   */
  public void setCurrentlyPage(int currentlyPage) {
    this.currentlyPage = currentlyPage;
  }
  /**
   * @return the dataList
   */
  public List getDataList() {
    return dataList;
  }
  /**
   * @param dataList the dataList to set
   */
  public void setDataList(List dataList) {
    this.dataList = dataList;
  }
  /**
   * @return the start
   */
  public int getStart() {
    return start;
  }
  /**
   * @param start the start to set
   */
  public void setStart(int start) {
    this.start = start;
  }
  /**
   * @return the end
   */
  public int getEnd() {
    return end;
  }
  /**
   * @param end the end to set
   */
  public void setEnd(int end) {
    this.end = end;
  }
  /**
   * @return the pageSize
   */
  public int getPageSize() {
    return pageSize;
  }
  /**
   * @param pageSize the pageSize to set
   */
  public void setPageSize(int pageSize) {
    this.pageSize = pageSize;
  }
}
