package com.czw.aop.act.impl;

import com.czw.aop.act.Encoreable;

/** 
 * 
 * @author Zevi Chan
 * @date 2016年6月22日 下午1:43:13 
 * 
 */
public class DefaultEncoreable implements Encoreable {

	public void performEncore() {
		System.out.println("DefaultEncoreable");
	}

}
