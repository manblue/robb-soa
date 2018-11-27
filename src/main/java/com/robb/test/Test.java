package com.robb.test;

import java.io.InputStream;

import com.robb.asm.Server2DubboServer;

public class Test {

	public static void main(String[] args) {
		InputStream is = Test.class.getResourceAsStream("/com/robb/service/impl/RobbServiceImpl.class");
		Server2DubboServer.buildDubboServerClass(is);
	}

}
