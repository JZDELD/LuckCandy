package com.softeem.bean.dto;

public class PageDTO {
	private int pageRow; //ÿҳ��ʾ����
	private int pageCount; //��ҳ��
	private int pageNow; //��ǰҳ
	private int row; //�ܼ�¼��
	private int startRow; //��ʼ����

	public PageDTO(int pageRow, int pageNow, int row) {
		super();
		this.pageRow = pageRow;
		this.row = row;

		this.setPageCount(row); //������ҳ��
		this.setPageNow(pageNow); //�жϵ�ǰҳ��
		this.setStartRow();  //������ʼ����
	}

	public int getStartRow() {
		return startRow;
	}

	//������ʼ����
	public void setStartRow() {
		this.startRow = (pageNow - 1) * pageRow;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public PageDTO() {
		super();
	}

	public int getPageRow() {
		return pageRow;
	}

	public void setPageRow(int pageRow) {
		this.pageRow = pageRow;
	}

	public int getPageCount() {
		return pageCount;
	}

	//������ҳ�� int row : ����ܼ�¼��
	public void setPageCount(int row) {
		if (row % pageRow == 0) {
			pageCount = row / pageRow;
		} else {
			pageCount = row / pageRow + 1;
		}
	}

	public int getPageNow() {
		return pageNow;
	}

	//�жϵ�ǰҳ��
	public void setPageNow(int pageNow) {
		if (pageNow <= 1) {
			this.pageNow = 1;
		} else if (pageNow >= pageCount) {
			this.pageNow = pageCount;
		} else {
			this.pageNow = pageNow;
		}
	}
}
