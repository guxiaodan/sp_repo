package com.tedu.sp01.service;

import com.tedu.sp01.pojo.User;

public interface UserService {
	//��ȡ�û�
	User getUser(Integer id);
	//�����û��Ļ���
	void addScore(Integer id, Integer score);
}
