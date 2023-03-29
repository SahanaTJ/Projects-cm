package com.xworkz.pro.repositery;

import java.util.Collections;
import java.util.List;

import com.xworkz.pro.entity.UserEntity;

public interface UserRepositery {
	boolean save(UserEntity userEntity);

	default List<UserEntity> findAll() {
		return Collections.emptyList();
	}
}
