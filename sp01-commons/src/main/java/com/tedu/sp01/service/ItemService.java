package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	//��ȡָ�������е���Ʒ
	List<Item> getItems(String orderId);
	//������Ʒ�Ŀ��
	void decreaseNumbers(List<Item> list);
}
