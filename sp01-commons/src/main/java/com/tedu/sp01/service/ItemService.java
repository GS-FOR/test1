package com.tedu.sp01.service;

import java.util.List;

import com.tedu.sp01.pojo.Item;

public interface ItemService {
	List<Item> getItems(String userId);//ͨ������ID����ȡ��Ʒ�б�
	void decreaseNumbers(List<Item> list);//�ڱ��涩��ʱ������Ʒ�б�
}